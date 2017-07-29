package com.retloh.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
import com.retloh.service.CommonServices;
import com.retloh.utils.FileUtil;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/down")
public class FileDownloadController {
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(FileDownloadController.class);
	
	@Autowired
	private CommonServices commonServices;
	
	
	/**
	 * 下载压缩后的 log文件 
	 * @return JSON数据
	 * /data/opt/
	 */
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
	
	
	@RequestMapping(value = "/toPage", method = { RequestMethod.GET })
	public String toPage(HttpServletRequest request) throws IOException {
		return "/common/general";
	}
	

	@RequestMapping(value = "/search", method = { RequestMethod.POST })
	@ResponseBody
	public String login(Common common, HttpServletRequest request) {
		LOGGER.error("时间{}，查询信息",new Date(),JacksonUtils.getInstance().obj2Json(common));
		Map<String, Object> maps = new HashMap<String, Object>();
		maps.put("status", false);
		int emptyCount = 0;
		if(StringUtils.isBlank(common.getPatNo())){
			emptyCount++;
		}
		if(StringUtils.isBlank(common.getIdCard())){
			emptyCount++;
		}
		if(StringUtils.isBlank(common.getSocialId())){
			emptyCount++;
		}
		if(StringUtils.isBlank(common.getPatName())){
			emptyCount++;
		}
		if(emptyCount>=3){
			maps.put("msg", "查询条件至少填写两个");
			return JacksonMapper.beanToJson(maps);
		}
		
		List<Common> result = commonServices.getpatInfoForDownload(common);
		
		return JacksonUtils.getInstance().obj2Json(result);
	}	
	
}
