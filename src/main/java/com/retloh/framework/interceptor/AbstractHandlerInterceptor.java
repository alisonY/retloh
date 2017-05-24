package com.retloh.framework.interceptor;


import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import com.retloh.framework.cache.LocalCacheUtil;

/**
 * 拦截器基类
 */
public abstract class AbstractHandlerInterceptor implements HandlerInterceptor {

	/**
	 * 读取 cached
	 * 
	 * @param cacheClientEnum
	 * @param cacheKey
	 * @return Object
	 */
	protected String getIncachedStr(String cacheKey) {
		return LocalCacheUtil.getInstance().getLocalCacheForString(cacheKey);
	}
	
	
	protected Object getIncached(String cacheKey) {
		return LocalCacheUtil.getInstance().getLocalCache(cacheKey);
	}
	
	/**
	 * 写入 cached
	 * 
	 * @param cacheClientEnum
	 * @param cacheKey
	 * @param cacheObject
	 * @param cacheSeconds
	 * @return Serializable
	 */
	protected void putIncachedStr(String cacheKey, String cacheObjectStr, int cacheSeconds) {
		LocalCacheUtil.getInstance().putLocalCache(cacheKey, cacheObjectStr, cacheSeconds);
	}
	
	
	protected void putIncached(String cacheKey, Object obj, int cacheSeconds) {
		LocalCacheUtil.getInstance().putLocalCache(cacheKey, obj, cacheSeconds);
	}
	
	

    /**
     * 删除 cached
     *
     * @param cacheClientEnum
     * @param cacheKey
     * @param cacheObject
     * @return boolean
     */
    protected void delIncached(String cacheKey) {
    	LocalCacheUtil.getInstance().delLocalCache(cacheKey);
    }

	/**
	 * 获取请求上下文
	 * 
	 * @param request
	 * @return String
	 */
	protected String obtainRequestContextPath(HttpServletRequest request) {
		String prefix = request.getContextPath();
		String suffix = ObjectUtils.toString(request.getAttribute("_urlrewrite_site"), "");
		String separator = (!prefix.endsWith("/") && !suffix.equals("") && !suffix.startsWith("/") ? "/" : "");
		return prefix + separator + suffix;
	}
}
