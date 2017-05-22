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
import org.springframework.web.bind.annotation.ResponseBody;
import com.retloh.framework.CacheConstant;
import com.retloh.model.TUser;
import com.retloh.service.UserServices;
import com.retloh.utils.CommonUtil;
import com.retloh.utils.JacksonMapper;

@Controller
@RequestMapping("/client")
public class ClientAuthController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(ClientAuthController.class);
    
    @Autowired
    private UserServices userServices;
    
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public String login(String loginName,String password,HttpServletRequest request,ModelMap modelMap) {
    	if(StringUtils.isNotBlank(loginName) && StringUtils.isNotBlank(password)){
    		TUser temp = userServices.getUserInfoBy(loginName, password);
    		modelMap.put("statu", false);
    		if(temp!=null){
    			String jsonStr = JacksonMapper.beanToJson(temp);
    			String cacheKey = CacheConstant.CLIENT_SESSION_CACHE + request.getSession().getId();
    			LOGGER.error("client Authentication is success,query result is jsonStr={},cacheKey={}", jsonStr, cacheKey);
    			modelMap.put("statu", true);
    			String token = CommonUtil.md5(cacheKey);
    			modelMap.put("token", token);
    		}else{
    			modelMap.put("errorInfo", "Authentication failed,here is some message.");
    		}
    	}
    	return JacksonMapper.beanToJson(modelMap);
    }
}
