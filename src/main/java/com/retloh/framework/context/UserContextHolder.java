package com.retloh.framework.context;


import org.springframework.core.NamedThreadLocal;
import com.retloh.model.TUser;

/**
 * 上下文持有者
 */
public abstract class UserContextHolder {

	private static final ThreadLocal<TUser> UserInfoVoHolder = new NamedThreadLocal<TUser>("User attributes");

	/**
	 * 重置会员属性
	 */
	public static void resetUserAttributes() {
		UserInfoVoHolder.set(null);
	}
	
	/**
	 * 设置会员信息
	 * 
	 * @param UserInfoVo
	 */
	public static void setUserInfoVo(TUser UserInfoVo) {
		UserInfoVoHolder.set(UserInfoVo);
	}
	
	/**
	 * 获取会员信息
	 * 
	 * @return UserInfoVo
	 */
	public static TUser getUserInfoVo() {
		return UserInfoVoHolder.get();
	}
	
}
