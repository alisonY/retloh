package com.retloh.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.Common;
import com.retloh.model.PageQuery;
import com.retloh.model.TUser;
import com.retloh.service.UserServices;
import com.retloh.utils.CommonUtil;
import com.retloh.utils.JacksonMapper;
import com.retloh.utils.JacksonUtils;

@Controller
@RequestMapping("/client")
public class ClientController extends ClientBaseController {
	
    private static final Logger LOGGER     = LoggerFactory.getLogger(ClientController.class);
    
    @Autowired
    private UserServices userServices;
	
    @RequestMapping(value="/login",method={RequestMethod.POST})
    @ResponseBody
    public String login(String loginName,String password,HttpServletRequest request,ModelMap modelMap) {
    	if(StringUtils.isNotBlank(loginName) && StringUtils.isNotBlank(password)){
    		TUser temp = userServices.getUserInfoBy(loginName, password);
    		modelMap.put("statu", false);
    		if(temp!=null){
    			//String jsonStr = JacksonMapper.beanToJson(temp);
    			String jsonStr = JacksonUtils.getInstance().obj2Json(temp);
    			String cacheKey = CacheConstant.CLIENT_SESSION_CACHE + request.getSession().getId();
    			String token = CommonUtil.md5(cacheKey);//token 根据当前用户cacheKey经过MD5编码后生成
    			LocalCacheUtil.getInstance().putLocalCache(token, temp, CacheConstant.CLIENT_LOGOUT_TIMES);
    			LOGGER.error("client Authentication is success,query result is jsonStr={},cacheKey={}", jsonStr, cacheKey);
    			modelMap.put("statu", true);
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
    public String getCommonList(HttpServletRequest request, Common common,PageQuery pageQuery) throws IOException {
		Map<String,Object> maps = new HashMap<String,Object>();
		TUser tUser = getAccountInfo(request);
		if(tUser==null){
			maps.put("msg", "请求异常");
		}else{
			String currentGroupId = tUser.getGroupId();
			maps.put("msg", tUser.getLoginName());
		}
		return JacksonUtils.getInstance().obj2Json(maps);
    }
}
