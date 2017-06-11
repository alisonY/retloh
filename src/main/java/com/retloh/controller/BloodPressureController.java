package com.retloh.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.retloh.model.BloodPreInfo;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.BloodPreInfoServices;
import com.retloh.utils.JacksonUtils;


/**
 * 血压
 *
 */
@Controller
@RequestMapping("/bp")
public class BloodPressureController {
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(BloodPressureController.class);
	
	@Autowired
	private BloodPreInfoServices bloodPreInfoServices;
	
	@RequestMapping(value="/info/toPage",method={RequestMethod.GET})
	public String toPage2(HttpServletRequest request) throws IOException {
		return "/bloodPressure/BPMainPage";
	}
	
	@RequestMapping(value="/info/getList",method={RequestMethod.POST})
	@ResponseBody
	public String toPage2(HttpServletRequest request,PageQuery pageQuery,BloodPreInfo bloodPreInfo) throws IOException {
		MyPageInfo<BloodPreInfo> resultList = new MyPageInfo<BloodPreInfo>(bloodPreInfoServices.getInfoList(bloodPreInfo, pageQuery));
		String resultJson = JacksonUtils.getInstance().obj2Json(resultList);
		return resultJson;
	}
	
	@RequestMapping(value="/data/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/xueya/xueyadata";
    }
	
	@RequestMapping(value="/date/toPage",method={RequestMethod.GET})
    public String toPage1(HttpServletRequest request) throws IOException {
    	return "/xueya/xueyadate";
    }
	
	
}
