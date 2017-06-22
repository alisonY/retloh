package com.retloh.controller;

import java.io.IOException;

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
import com.retloh.model.CaseInfo;
import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.model.commonVo.MyPageInfo;
import com.retloh.service.CaseInfoServices;
import com.retloh.service.UserServices;
import com.retloh.utils.CommonUtil;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/client")
public class ClientAuthController extends ClientBaseController {
	
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
    			String token = CommonUtil.md5(cacheKey);//token 根据当前用户cacheKey经过MD5编码后生成
    			modelMap.put("token", token);
    		}else{
    			modelMap.put("errorInfo", "Authentication failed,here is some message.");
    			LOGGER.error("client Authentication is failed,query result is loginName={},password={}", loginName, password);
    		}
    	}
    	return JacksonMapper.beanToJson(modelMap);
    }
    
    
	@RequestMapping(value="/getCommonList",method={RequestMethod.POST})
    @ResponseBody
    public String getCaseList(HttpServletRequest request, Common common,PageQuery pageQuery) throws IOException {
    	return "";
    }
}
