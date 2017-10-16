package com.retloh.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.retloh.framework.CacheConstant;
import com.retloh.framework.cache.LocalCacheUtil;
import com.retloh.model.TUser;

public class ClientBaseController {
	
    protected TUser getAccountInfo(HttpServletRequest request) {
    	String token = request.getHeader("token");
    	TUser tUser = null;
    	if(StringUtils.isNotBlank(token)){
    		
    		tUser = (TUser)LocalCacheUtil.getInstance().getLocalCache(token);

    		String singleLoginKey = CacheConstant.CLIENT_SINGLE_LOGIN + tUser.getId();
    		
    		String tokenFromCache = LocalCacheUtil.getInstance().getLocalCacheForString(singleLoginKey);
    		
    		if(StringUtils.isBlank(tokenFromCache)){//如果缓存中根据传入的token取不到响应的
    			return null;
    		}
    		if(!token.equals(tokenFromCache)){
    			return null;
    		}
    	}
    	return tUser;
    }

}
