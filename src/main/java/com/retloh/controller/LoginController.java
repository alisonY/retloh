package com.retloh.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	private static final Logger LOGGER     = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public String loginByNameAndPassword(HttpServletRequest request){
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		LOGGER.error("***********************************");
		LOGGER.error(username);
		LOGGER.error(password);
		
		return "OK";
		
	}
    

}
