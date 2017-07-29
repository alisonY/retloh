package com.retloh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.retloh.framework.CacheConstant;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.TUser;
import com.retloh.service.UserServices;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/auth")
public class LoginController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(LoginController.class);
    
    @Autowired
    private UserServices userServices;
    
    
    @RequestMapping(value="/toLogin",method={RequestMethod.GET})
    public ModelAndView toLogin(HttpServletRequest request,ModelMap modelMap,String i) {
        ModelAndView mv = new ModelAndView();
        if(isNumber(i)){
        	if(new Double(i)-new Double("0")<1){
        		modelMap.put("errorInfo", "验证失败");
        	}
        }
        mv.addAllObjects(modelMap);
    	mv.setViewName("login3");
        return mv;  
    }
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    public ModelAndView login(String loginName,String password,ModelMap modelMap,HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
    	if(StringUtils.isNotBlank(loginName) && StringUtils.isNotBlank(password)){
    		TUser temp = userServices.getUserInfoBy(loginName, password);
    		if(temp!=null){
    			/*
	  			  `user_rank` '等级, -1:都可以登录, 0:可以登录WEB端界面; 1：不可登录WEB端,客户端账号;',
	  			*/
    			String jsonStr = JacksonUtils.getInstance().obj2Json(temp);
    			String cacheKey = CacheConstant.USER_SESSION_CACHE + request.getSession().getId();
	  			if(temp.getUserRank()  == -1 || temp.getUserRank()  == 0){
	    			LOGGER.error("login action is success,query result is jsonStr={},cacheKey={}", jsonStr, cacheKey);
	    			//PUT TO CACHE
	    			LocalCacheUtil.getInstance().putLocalCache(cacheKey, temp, CacheConstant.USER_LOGOUT_TIMES);
	    			mv.setViewName("redirect:/main/welcome.do");
	    			return mv;  
	  			}else{
	  				LOGGER.error("account is only available at pc client.,query result is jsonStr={},cacheKey={}", jsonStr, cacheKey);
	  			}
    		}
    	}
		modelMap.put("i", Math.random());
		LOGGER.error("登录失败,loginName={},password={}", loginName, password);
		mv.addAllObjects(modelMap);
		//mv.setViewName("login");
		mv.setViewName("redirect:/auth/toLogin.do");//使用重定向
        return mv;  
    }
    
    
    @RequestMapping(value="/logout",method={RequestMethod.GET})
    public ModelAndView login(ModelMap modelMap,HttpServletRequest request) {
		String cacheKey = CacheConstant.USER_SESSION_CACHE + request.getSession().getId();
		LocalCacheUtil.getInstance().delLocalCache(cacheKey);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/auth/toLogin.do");//使用重定向
        return mv;  
    }
    
    
    private static boolean isNumber(String str) {
    	LOGGER.error(str);
    	if(StringUtils.equals(str, "null")){
    		return false;
    	}else{
    		if(StringUtils.isNotBlank(str)){
    			return str.matches("-?[0-9]+.*[0-9]*");
    		}else{
    			return false;
    		}
    	}
    } 
}
