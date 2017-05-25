package com.retloh.framework.interceptor;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;

import com.retloh.framework.context.UserContextHolder;

/**
 * 会员鉴定拦截器
 * 
 * @author yang.mq
 *
 */
public class UserLogininAuthorizationInterceptor extends AbstractHandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (UserContextHolder.getUserInfoVo() == null) {
			StringBuilder urlBuilder = new StringBuilder();
			urlBuilder.append(request.getScheme());
			urlBuilder.append("://");
			urlBuilder.append(request.getServerName());
			urlBuilder.append(":");
			urlBuilder.append(request.getServerPort());
			urlBuilder.append(super.obtainRequestContextPath(request));
//			int beginIndex = (urlBuilder.charAt(urlBuilder.length() - 1) == '/' && Values.prototype.memberSignInUri.charAt(0) == '/') ? 1 : 0;
//			urlBuilder.append(Values.prototype.memberSignInUri.substring(beginIndex));
			urlBuilder.append("/auth/toLogin.do");
			
			// Http request with ajax
			if ("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))) {
				response.addHeader("Pragma", "no-cache");
				response.addHeader("Cache-Control", "no-cache, no-store, max-age=0");
				response.addDateHeader("Expires", 1L);
				response.addHeader("Location", urlBuilder.toString());
				response.setContentType("text/html; charset=UTF-8");
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().println("用户会话已过期请重新登录！");
				return false;
			}
			
			//urlBuilder.append("?redirectURL=");
			//urlBuilder.append(URLEncoder.encode(getRedirectURL(request), "UTF-8"));
			response.sendRedirect(urlBuilder.toString());
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
	}
	
	private String getRedirectURL(HttpServletRequest request) {
		StringBuilder urlBuilder = new StringBuilder();
		urlBuilder.append(request.getScheme());
		urlBuilder.append("://");
		urlBuilder.append(request.getServerName());
		urlBuilder.append(":");
		urlBuilder.append(request.getServerPort());
		urlBuilder.append(super.obtainRequestContextPath(request));
		urlBuilder.append(request.getServletPath());
		if (StringUtils.isNotBlank(request.getQueryString())) {
			urlBuilder.append("?").append(request.getQueryString().trim());
		}
		return urlBuilder.toString();
	}
}
