package com.retloh.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.retloh.framework.SysConstant;
import com.retloh.utils.FileUtil;

@Controller
@RequestMapping("/down")
public class FileDownloadController {
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(FileDownloadController.class);
	
	/**
	 * 下载压缩后的 log文件 
	 * @return JSON数据
	 * /data/opt/
	 */
	@RequestMapping(value = "/file", method = RequestMethod.GET, headers = "content-type=" + MediaType.APPLICATION_OCTET_STREAM_VALUE)
	public void downlog(HttpServletRequest request, HttpServletResponse response, String filePath) {
		
		String filename = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
		
		response.setHeader("Content-disposition", "attachment; filename="+filename);
		
		filePath = SysConstant.FILE_STORE_FOLDER+filePath;
		try {
			LOGGER.error("下载文件URL：{}",filename);
			FileUtil.fileToStream(response.getOutputStream(), filePath);
		} catch (IOException e) { 
			LOGGER.error("下载文件异常：{}",e.getMessage());
		}
	}
}
