package com.retloh.framework.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import com.retloh.framework.CacheConstant;
import com.retloh.framework.context.UserContextHolder;
import com.retloh.model.TUser;

/**
 * 每一次请求拦截器
 */
public class OncePerRequestInterceptor extends AbstractHandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String userInfoCacheKey=getUserInfoCacheKey(request);
		TUser userInfoVoCached = (TUser)getIncached(userInfoCacheKey);
		if(userInfoVoCached != null){
                putIncached(userInfoCacheKey, userInfoVoCached, CacheConstant.USER_LOGOUT_TIMES);//缓存持久化
		}
        // 设置会员上下文信息
		UserContextHolder.setUserInfoVo(userInfoVoCached);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		// 清除会话过期的会员上下文信息
		String userInfoCacheKey=getUserInfoCacheKey(request);
		TUser userInfoVoCached = (TUser)getIncached(userInfoCacheKey);
		if(userInfoVoCached == null){
			UserContextHolder.resetUserAttributes();
		}else{
			UserContextHolder.setUserInfoVo(userInfoVoCached);
		}
		// 注入当前会员信息
		if (modelAndView != null) {
			String urls = request.getParameter("redirectURL");
			//response.sendRedirect(urls);
			System.out.println(urls);
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	}

	/**
	 * 获取会员信息缓存键
	 * @param request
	 * @return String
	 */
	private String getUserInfoCacheKey(HttpServletRequest request) {
		return CacheConstant.USER_SESSION_CACHE + request.getSession().getId();
	}
	
}
