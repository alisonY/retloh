package com.retloh.framework.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import com.retloh.framework.CacheConstant;
import com.retloh.framework.context.UserContextHolder;
import com.retloh.model.TUser;
import com.retloh.service.UserServices;


/**
 * 每一次请求拦截器
 */
public class OncePerRequestInterceptor extends AbstractHandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		String from = request.getParameter("from");
		if(StringUtils.isNotBlank(from)){
			request.getSession().setAttribute("from", from);
		}
		String userInfoCacheKey=getUserInfoCacheKey(request);
		TUser userInfoVoCached = (TUser)getIncached(userInfoCacheKey);
		if(userInfoVoCached != null){
                putIncached(userInfoCacheKey, userInfoCacheKey, CacheConstant.USER_LOGOUT_TIMES);//缓存持久化
		}else{
            //未登录过
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
		}
		// 注入当前会员信息
		if (modelAndView != null) {
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
