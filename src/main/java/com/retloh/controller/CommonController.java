package com.retloh.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.framework.SysConstant;
import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CommonServices;
import com.retloh.utils.FileUtil;
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

	@RequestMapping(value = "/toPage", method = { RequestMethod.GET })
	public String toPage(HttpServletRequest request) throws IOException {
		return "/common/common";
	}

	@RequestMapping(value = "/getInfo", method = { RequestMethod.POST })
	@ResponseBody
	public String getCaseInfo(HttpServletRequest request, Common common, PageQuery pageQuery) throws IOException {
		
		MyPageInfo<Common> resultList = new MyPageInfo<Common>(commonServices.getDataList(common, pageQuery,request));
		//String resultJson = JacksonMapper.beanToJson(resultList);
		String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
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
	
	@RequestMapping(value="/delInfo",method={RequestMethod.POST})
    @ResponseBody
    public String delInfo(HttpServletRequest request,String id){
		Map<String,Object> map = new HashMap<String, Object>();
		int result = 0;
		if(StringUtils.isNotBlank(id)){
			result = commonServices.deleteByPrimaryKey(id);
			if(result>0){
				map.put("msg","删除成功");
			}else{
				map.put("msg","删除失败");
			}
		}else{
			map.put("msg","操作失败，请重试_"+id);
		}
		map.put("status",result);
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
	
	@RequestMapping(value = "/file", method = RequestMethod.GET, headers = "content-type=" + MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public void downlog(HttpServletRequest request, HttpServletResponse response, String filePath) {
		String filename = filePath.substring(0, filePath.lastIndexOf("."));
		response.setHeader("Content-disposition", "attachment; filename="+filePath);
		filePath = SysConstant.FILE_STORE_FOLDER+filename+SysConstant.FILE_STORE_FOLDER+filePath;
		try {
			LOGGER.error("下载文件URL：{}",filename);
			FileUtil.fileToStream(response.getOutputStream(), filePath);
		} catch (IOException e) { 
			LOGGER.error("下载文件异常：{}",e.getMessage());
		}
	}
}
