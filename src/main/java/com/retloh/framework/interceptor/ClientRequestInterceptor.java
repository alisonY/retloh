package com.retloh.framework.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import com.retloh.framework.CacheConstant;
import com.retloh.model.TUser;
import com.retloh.utils.CommonUtil;


/**
 * 客户端  请求持久
 */
public class ClientRequestInterceptor extends AbstractHandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String ClientUserInfoCacheKey=getUserInfoCacheKey(request);
		TUser userInfoVoCached = (TUser)getIncached(ClientUserInfoCacheKey);
		if(userInfoVoCached != null){
                putIncached(ClientUserInfoCacheKey, userInfoVoCached, CacheConstant.CLIENT_LOGOUT_TIMES);
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		handler.getClass();
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	}

	private String getUserInfoCacheKey(HttpServletRequest request) {
		return CommonUtil.md5(CacheConstant.CLIENT_SESSION_CACHE + request.getSession().getId());
	}
	
}
