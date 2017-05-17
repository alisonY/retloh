package com.retloh.controller;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class LoginController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(LoginController.class);
    
    
    @RequestMapping(value="/toLogin",method={RequestMethod.GET})
    public ModelAndView toLogin() {
        ModelAndView mv = new ModelAndView();  
    	mv.setViewName("login");
        return mv;  
    }
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public ModelAndView login(String loginName,String password) {
        ModelAndView mv = new ModelAndView();  
    	if(StringUtils.equals(loginName, "root") && StringUtils.equals(password, "admin")){
    		mv.addObject("name", "蛤蛤");  
    		mv.setViewName("welcom");
    	}else{
    		mv.addObject("errorInfo", "登录失败");  
    		mv.setViewName("welcom");
    	}
        return mv;  
    }
    

}
