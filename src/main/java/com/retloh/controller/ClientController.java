package com.retloh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.retloh.framework.CacheConstant;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.CaseInfo;
import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.service.CommonServices;
import com.retloh.service.UserServices;
import com.retloh.utils.ChangeCharset;
import com.retloh.utils.CommonUtil;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/client")
public class ClientController extends ClientBaseController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(ClientController.class);
    
    @Autowired
    private UserServices userServices;
    
    @Autowired
    private CommonServices commonServices; 
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public String login(String loginName,String password,HttpServletRequest request,ModelMap modelMap) {
    	if(StringUtils.isNotBlank(loginName) && StringUtils.isNotBlank(password)){
    		TUser temp = userServices.getUserInfoBy(loginName, password);
    		modelMap.put("status", false);
    		if(temp!=null){
    			/*
	  			  `user_rank` '等级, -1:都可以登录, 0:可以登录WEB端界面; 1：不可登录WEB端,客户端账号;',
	  			*/
    			if(temp.getUserRank() != 0){
        			//String jsonStr = JacksonMapper.beanToJson(temp);
        			String jsonStr = JacksonUtils.getInstance().obj2Json(temp);
        			String cacheKey = CacheConstant.CLIENT_SESSION_CACHE + request.getSession().getId();
        			String token = CommonUtil.md5(cacheKey);//token 根据当前用户cacheKey经过MD5编码后生成
        			LocalCacheUtil.getInstance().putLocalCache(token, temp, CacheConstant.CLIENT_LOGOUT_TIMES);
        			LOGGER.error("client Authentication is success,query result is jsonStr={},cacheKey={}", jsonStr, cacheKey);
        			modelMap.put("status", true);
        			modelMap.put("token", token);
    			}else{
    				modelMap.put("errorInfo", "this account is only available at pc client.");
    			}
    		}else{
    			modelMap.put("errorInfo", "Authentication failed,here is some message.");
    			LOGGER.error("client Authentication is failed,query result is loginName={},password={}", loginName, password);
    		}
    	}
    	return JacksonMapper.beanToJson(modelMap);
    }
    
    /**
     * 必传参数 status pgType
     */
	@RequestMapping(value="/getCommonList",method={RequestMethod.POST})
    @ResponseBody
    public String getCommonList(HttpServletRequest request, Common common,PageQuery pageQuery,String ids) throws IOException {
		Map<String,Object> maps = new HashMap<String,Object>();
		maps.put("status", 0);
		TUser tUser = getAccountInfo(request);
		if(StringUtils.isBlank(common.getPgType()) || common.getStatus() == null){
			maps.put("msg", "pgType和status参数必传");
		}else{
			if(tUser==null){
				maps.put("status", -1);
				maps.put("msg", "login is required");
			}else{
				/*
				 * `user_rank` '等级, -1:都可以登录, 0:可以登录WEB端界面; 1：不可登录WEB端,客户端账号;',
				 * `user_type` '类型 0:管理员,1:采集端(上传端);2:分析端(下载端)',
				 */
				/*
				 * 状态
				 * 0=待上传数据包，1=已上传待分析，2=待分析下载中，3=已被下载，4=已被分析回传中，5=已回传报告
				 */
				String currentGroupId = tUser.getGroupId();
				common.setGroupId(currentGroupId);//只能看到自己分组内的
				common.setPgType(common.getPgType());
				if(tUser.getUserType() == 1){//1:采集端(上传端);
					common.setUpId(tUser.getId());//采集端 部分情况 都是只能看到自己上传的.
				}
				if(tUser.getUserType() == 2){//2:分析端(下载端);
					if(common.getStatus() == 1){//取待分析的
						
					}
					if(common.getStatus() == 5){//取已分析的
						//common.setUpId(tUser.getId());//只能看到自己分析上传的的
					}
				}
				List<String> idsList = new ArrayList<String>();
				if(StringUtils.isNotBlank(ids)){
					String[] id =  ids.split(",");
					idsList= java.util.Arrays.asList(id);
				}
				List<Common> resultList = commonServices.getDataListForClient(common,idsList, pageQuery);
				maps.put("status", 1);
				maps.put("msg", resultList);
			}			
		}
		return JacksonUtils.getInstance().obj2Json(maps);
    }
	
	/*
	public static void main(String[] args) {
		String ids = "123,444,5453,2134";
		String[] id =  ids.split(",");
		List<String> list= java.util.Arrays.asList(id);
		list.size();
	}
	*/
	
	
	/**
	 * 释放病例
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/release", method = { RequestMethod.POST })
	@ResponseBody
	public String releaseByid(HttpServletRequest request, String id) {
		Common common = commonServices.selectByPrimaryKey(id);
		Map<String, Object> map = new HashMap<String, Object>();
		TUser tUser = getAccountInfo(request);
		if(tUser==null){
			map.put("status", -1);
			map.put("msg", "未登录");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}else{
			int status = common.getStatus();
			if (status == 3) {
				common.setStatus(1);
				common.setUpdateTime(new Date());
				int res = commonServices.updateByPrimaryKey(common);
				if (res > 0) {
					map.put("status", 1);
					map.put("msg", "成功释放");
				} else {
					map.put("status", 0);
					map.put("msg", "释放失败");
				}
			} else {
				map.put("status", 0);
				map.put("msg", "无需释放!");
			}
		}
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}
	

	
	
	@RequestMapping(value = "/postcommon", method = { RequestMethod.POST })
	@ResponseBody
	public String postcommon(HttpServletRequest request) {
		
		String line = null;
		StringBuilder sb = new StringBuilder();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		TUser tUser = getAccountInfo(request);
		if(tUser==null){
			map.put("status", -1);
			map.put("msg", "login is required");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}else{
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
				while ((line = br.readLine()) != null) {
					sb.append(line);
				}
			} catch (IOException e1) {
				map.put("msg", "json转换异常");
				String resultJson = JacksonMapper.beanToJson(map);
				return resultJson;
			}
			String jsonstr = sb.toString();

			LOGGER.error("receive json:" + jsonstr);

			if (StringUtils.isNotBlank(jsonstr)) {
				Common info = new Common();
				try {
					info = JacksonMapper.jsonToBean(jsonstr, Common.class);
					if (info != null) {
						info.setId(UUID.randomUUID().toString());
						info.setUpTime(new Date());
						info.setDownTime(new Date());
						int flag = commonServices.insert(info);
						if (flag > 0) {
							map.put("status", true);
							String resultJson = JacksonMapper.beanToJson(map);
							return resultJson;
						} else {
							map.put("msg", "写库失败");
							String resultJson = JacksonMapper.beanToJson(map);
							return resultJson;
						}
					} else {
						map.put("msg", "参数异常");
						String resultJson = JacksonMapper.beanToJson(map);
						return resultJson;
					}
				} catch (Exception e) {
					map.put("msg", "json转换异常");
					String resultJson = JacksonMapper.beanToJson(map);
					return resultJson;
				}
			} else {
				map.put("msg", "json为空");
				String resultJson = JacksonMapper.beanToJson(map);
				return resultJson;
			}			
		}
	}
	
	
	
	@RequestMapping(value = "/postcommonJson", method = { RequestMethod.POST })
	@ResponseBody
	public String postcommonJson(HttpServletRequest request, String commonJson) {
		LOGGER.debug("收到JSON："+commonJson);
		Map<String, Object> map = new HashMap<String, Object>();
		TUser tUser = getAccountInfo(request);
		if(tUser==null || StringUtils.isBlank(commonJson)){
			map.put("status", -1);
			map.put("msg", "未登录");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}else{
			if (StringUtils.isNotBlank(commonJson)) {
				Common info = new Common();
				try {
					ChangeCharset test = new ChangeCharset();
					String newCommonJson = test.toUTF_8(commonJson);
					try {
						info = JacksonMapper.jsonToBean(newCommonJson, Common.class);
					} catch (Exception e) {
						map.put("status", 0);
						map.put("msg", "参数异常");
						String resultJson = JacksonMapper.beanToJson(map);
						return resultJson;
					}
					if (info != null) {
						//info.setId(UUID.randomUUID().toString());
						info.setUpTime(new Date());
						info.setDownTime(new Date());
						info.setStatus(0);
						String currentGroupId = tUser.getGroupId();
						info.setGroupId(currentGroupId);
						int flag = commonServices.insert(info);
						if (flag > 0) {
							map.put("status", 1);
							String resultJson = JacksonMapper.beanToJson(map);
							return resultJson;
						} else {
							map.put("msg", "写库失败");
							String resultJson = JacksonMapper.beanToJson(map);
							return resultJson;
						}
					} else {
						map.put("msg", "参数异常");
						String resultJson = JacksonMapper.beanToJson(map);
						return resultJson;
					}
				} catch (Exception e) {
					map.put("msg", "json转换异常");
					String resultJson = JacksonMapper.beanToJson(map);
					return resultJson;
				}
			} else {
				map.put("msg", "json为空");
				String resultJson = JacksonMapper.beanToJson(map);
				return resultJson;
			}	
		}
	}		

	
	
	@RequestMapping(value = "/testj", method = { RequestMethod.POST })
	@ResponseBody
	public String testj(HttpServletRequest request, String json) {
		LOGGER.error("收到JSON："+json);
		ChangeCharset test = new ChangeCharset();
		try {
			String toGBK = test.toGBK(json);
			String toASCII = test.toASCII(json);
			String toISO_8859_1 = test.toISO_8859_1(json);
			String toUTF_8 = test.toUTF_8(json);
			String toUTF_16  = test.toUTF_16(json);
			String toUTF_16BE  = test.toUTF_16BE(json);
			String toUTF_16LE  = test.toUTF_16LE(json);
			LOGGER.error("收到toGBK："+toGBK);
			LOGGER.error("收到toASCII："+toASCII);
			LOGGER.error("收到toISO_8859_1："+toISO_8859_1);
			LOGGER.error("收到toUTF_8："+toUTF_8);
			LOGGER.error("收到toUTF_16："+toUTF_16);
			LOGGER.error("收到toUTF_16："+toUTF_16BE);
			LOGGER.error("收到toUTF_16："+toUTF_16LE);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
	}	
	
	
}
