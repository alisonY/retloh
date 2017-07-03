package com.retloh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CommonServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

/**
 * 通用信息管理
 */
@Controller
@RequestMapping("/common")
public class CommonController {

	@Autowired
	private CommonServices commonServices;

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonController.class);

	@RequestMapping(value = "/postcommon", method = { RequestMethod.POST })
	@ResponseBody
	public String postcaseT(HttpServletRequest request) {

		String line = null;
		StringBuilder sb = new StringBuilder();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);

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

	@RequestMapping(value = "/toPage", method = { RequestMethod.GET })
	public String toPage(HttpServletRequest request) throws IOException {
		return "/common/common";
	}

	@RequestMapping(value = "/getInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String getCaseInfo(HttpServletRequest request, Common common, PageQuery pageQuery) throws IOException {
		MyPageInfo<Common> resultList = new MyPageInfo<Common>(commonServices.getDataList(common, pageQuery));
		long l1 = System.currentTimeMillis();
		String resultJson = JacksonMapper.beanToJson(resultList);
		long l2 = System.currentTimeMillis();
		String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
		long l3 = System.currentTimeMillis();
		LOGGER.error(String.valueOf(l2 - l1));
		LOGGER.error(String.valueOf(l3 - l2));
		return resultJson2;
	}

	@RequestMapping(value = "/viewInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String viewInfo(HttpServletRequest request, String id,Integer type) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		if(type !=null || StringUtils.isNotBlank(id)){
			if(type == 0){//查看
				String info = commonServices.getInfoById(id);
				StringBuffer sb = new StringBuffer();
				if (info != null) {
					String[] fields = info.split("#");
					sb.append("{\"status\":true,");
					sb.append("\"msg\":" + jsonSpliter(fields));
				} else {
					sb.append("{\"status\":false,");
					sb.append("\"msg\":\"查无此结果\"");
				}
				sb.append("}");
				return sb.toString();
			}
			else if(type == 1){//修改
				String info = commonServices.getInfoById(id);
				map.put("status", false);
				if (info != null) {
					map.put("status", true);
					map.put("msg", info);
					String resultJson = JacksonMapper.beanToJson(map);
					return resultJson;
				}else{
					map.put("msg", "查无此结果");
					String resultJson = JacksonMapper.beanToJson(map);
					return resultJson;
				}
			}else{
				map.put("msg", "参数异常");
			}
		}else{
			map.put("msg", "参数异常");
		}
		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}

	private String jsonSpliter(String[] fields) {
		StringBuffer sb = new StringBuffer();
		sb.append("{\"rows\":[");
		for (int x = 0; x < fields.length; x++) {
			String row = fields[x];
			String[] splited = row.split(":");
			sb.append("{\"name\":\"" + splited[0]);
			sb.append("\",\"value\":\"" + splited[1]);
			sb.append("\"}");
			if (x != fields.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]}");
		return sb.toString();
	}

	@RequestMapping(value = "/release", method = { RequestMethod.POST })
	@ResponseBody
	public String releaseByid(HttpServletRequest request, String id) {
		Common common = commonServices.selectByPrimaryKey(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		int status = common.getStatus();
		if (status == 3) {
			common.setStatus(1);
			int res = commonServices.updateByPrimaryKey(common);
			if (res > 0) {
				map.put("status", true);
				map.put("msg", "成功释放");
			} else {
				map.put("msg", "释放失败");
			}
		} else {
			map.put("msg", "无需释放!");
		}

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}
	
	
	
	@RequestMapping(value = "/saveCommonInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String saveCommonInfo(HttpServletRequest request, String id,String editedInfo) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		
		boolean checkPass = true;
		try {
			String[] fields = editedInfo.split("#");
			jsonSpliter(fields);
		} catch (Exception e) {
			checkPass = false;
		}
		Common common = new Common();
		common.setId(id);
		if(checkPass){
			common.setInfo(editedInfo);
		}else{
			map.put("msg", "格式不合法");
			String resultJson = JacksonMapper.beanToJson(map);
			return resultJson;
		}
		common.setUpdateTime(new Date());
		int res = commonServices.updateByPrimaryKeySelective(common);
		if (res > 0) {
			map.put("status", true);
			map.put("msg", "修改成功");
		} else {
			map.put("msg", "修改失败");
		}

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}
	
	
	@RequestMapping(value = "/saveCommon", method = { RequestMethod.POST })
	@ResponseBody
	public String saveCommon(HttpServletRequest request,Common common) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", false);
		common.setUpdateTime(new Date());
		int res = commonServices.updateByPrimaryKeySelective(common);
		if (res > 0) {
			map.put("status", true);
			map.put("msg", "修改成功");
		} else {
			map.put("msg", "修改失败");
		}

		String resultJson = JacksonMapper.beanToJson(map);
		return resultJson;
	}	

}
