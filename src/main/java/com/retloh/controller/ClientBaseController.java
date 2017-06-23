package com.retloh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.TUser;

public class ClientBaseController {
	
    protected TUser getAccountInfo(HttpServletRequest request) {
    	String token = request.getHeader("token");
    	TUser tUser = null;
    	if(StringUtils.isNotBlank(token)){
    		tUser = (TUser)LocalCacheUtil.getInstance().getLocalCache(token);
    	}
    	return tUser;
    }

}
