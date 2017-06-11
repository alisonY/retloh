package com.retloh.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/xueya")
public class XueYaInfoController {
	private static final Logger LOGGER     = LoggerFactory.getLogger(XueYaInfoController.class);
	
	
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

}
