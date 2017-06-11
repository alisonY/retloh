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

import com.retloh.model.CaseInfo;
import com.retloh.model.PageQuery;
import com.retloh.model.XueyaData;
import com.retloh.model.XueyaDate;
import com.retloh.model.XueyaInfo;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CaseInfoServices;
import com.retloh.service.XueYaDataServices;
import com.retloh.service.XueYaDateServices;
import com.retloh.service.XueYaInfoServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/xueya")
public class XueYaInfoController {
	private static final Logger LOGGER     = LoggerFactory.getLogger(XueYaInfoController.class);
	
	@Autowired
    private XueYaInfoServices xueyaInfoServices;
	@Autowired
    private XueYaDataServices xueyaDataServices;
	@Autowired
    private XueYaDateServices xueyaDateServices;
	
	
	@RequestMapping(value="/data/toPage",method={RequestMethod.GET})
    public String toPage(HttpServletRequest request) throws IOException {
    	return "/xueya/xueyadata";
    }
	
	@RequestMapping(value="/date/toPage",method={RequestMethod.GET})
    public String toPage1(HttpServletRequest request) throws IOException {
    	return "/xueya/xueyadate";
    }
	
	@RequestMapping(value="/info/toPage",method={RequestMethod.GET})
    public String toPage2(HttpServletRequest request) throws IOException {
    	return "/xueya/xueyainfo";
    }
	
	@RequestMapping(value="/data/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getXueYaDataInfo(HttpServletRequest request,XueyaData xueyadata,PageQuery pageQuery) throws IOException {
	    MyPageInfo<XueyaData> resultList = new MyPageInfo<XueyaData>(xueyaDataServices.getXueYaData(xueyadata, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	@RequestMapping(value="/info/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getXueYaInfo(HttpServletRequest request,XueyaInfo xueyainfo,PageQuery pageQuery) throws IOException {
	    MyPageInfo<XueyaInfo> resultList = new MyPageInfo<XueyaInfo>(xueyaInfoServices.getXueYaInfo(xueyainfo, pageQuery));
	    long l1 = System.currentTimeMillis();
	    String resultJson = JacksonMapper.beanToJson(resultList);
	    long l2 = System.currentTimeMillis();
	    String resultJson2 = JacksonUtils.getInstance().obj2Json(resultList);
	    long l3 = System.currentTimeMillis();
	    LOGGER.error(String.valueOf(l2-l1));
	    LOGGER.error(String.valueOf(l3-l2));
    	return resultJson2;
    }
	
	@RequestMapping(value="/date/getInfo",method={RequestMethod.POST})
    @ResponseBody
    public String getXueYaDateInfo(HttpServletRequest request,XueyaDate xueyadate,PageQuery pageQuery) throws IOException {
	    MyPageInfo<XueyaDate> resultList = new MyPageInfo<XueyaDate>(xueyaDateServices.getXueYaDate(xueyadate, pageQuery));
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
