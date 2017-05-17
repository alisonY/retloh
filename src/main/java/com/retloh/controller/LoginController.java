package com.retloh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/auth")
public class LoginController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(LoginController.class);
    
    
    @RequestMapping(value="/toLogin",method={RequestMethod.GET})
    public ModelAndView toLogin(HttpServletRequest request,ModelMap modelMap,String i) {
        ModelAndView mv = new ModelAndView();
        if(isNumber(i)){
        	Double x = new Double(i)-new Double("0");
        	if(new Double(i)-new Double("0")<1){
        		modelMap.put("errorInfo", "验证失败");
        	}
        }
        mv.addAllObjects(modelMap);
    	mv.setViewName("login");
        return mv;  
    }
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public ModelAndView login(String loginName,String password,ModelMap modelMap) {
        ModelAndView mv = new ModelAndView();  
    	if(StringUtils.equals(loginName, "root") && StringUtils.equals(password, "admin")){
    		mv.addObject("name", "蛤蛤");  
    		mv.setViewName("welcom");
    	}else{
    		modelMap.put("i", Math.random());
    		LOGGER.error("登录失败,loginName={},password={}", loginName, password);
    		mv.addAllObjects(modelMap);
    		//mv.setViewName("login");
    		mv.setViewName("redirect:/auth/toLogin.do");//使用重定向
    	}
        return mv;  
    }
    
    private static boolean isNumber(String str) {// 判断小数点开头  
        return str.matches("-?[0-9]+.*[0-9]*");
    } 
    

}
