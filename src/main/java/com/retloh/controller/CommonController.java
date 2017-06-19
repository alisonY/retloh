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

import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CommonServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;


@Controller
@RequestMapping("/common")
public class CommonController {
	
	@Autowired
    private CommonServices commonServices;
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(CommonController.class);
	
	@RequestMapping(value="/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/common/common";
    }
	
	@RequestMapping(value="/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getCaseInfo(HttpServletRequest request,Common common,PageQuery pageQuery) throws IOException {
	    MyPageInfo<Common> resultList = new MyPageInfo<Common>(commonServices.getDataList(common, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	

}
