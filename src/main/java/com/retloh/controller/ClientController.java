package com.retloh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.service.CommonServices;
import com.retloh.service.UserServices;
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
    		modelMap.put("statu", false);
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
        			modelMap.put("statu", true);
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
    
	@RequestMapping(value="/getCommonList",method={RequestMethod.POST})
    @ResponseBody
    public String getCommonList(HttpServletRequest request, Common common,PageQuery pageQuery) throws IOException {
		Map<String,Object> maps = new HashMap<String,Object>();
		TUser tUser = getAccountInfo(request);
		if(tUser==null){
			maps.put("msg", "请求异常");
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
					common.setUpId(tUser.getId());//只能看到自己分析上传的的
				}
			}
			List<Common> resultList = commonServices.getDataListForClient(common, pageQuery);
			maps.put("msg", resultList);
		}
		return JacksonUtils.getInstance().obj2Json(maps);
    }
}
