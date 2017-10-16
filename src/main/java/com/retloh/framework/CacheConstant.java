package com.retloh.framework;

/**
 * 缓存常量类
 */
public class CacheConstant {

	/**
	 * 会员状态锁定
	 */
	public final static short TEST = 1;
	
	/**
	 * 同用前缀
	 */
	public static final String CACHE_PREFIX = "HOLTER_";

	/**
     * 数据缓存时效
     */
    public static final int USER_SESSION_EXPIRES = 3600;

    /**
     * 无操作时登出时间，30分钟未操作登出
     */
    public static final int USER_LOGOUT_TIMES = 1800;

	/**
	 * 招行cmbstore用户跳转
	 */
	public static final String CMBSTORE_REDIRECT = CACHE_PREFIX + "CMBSTORE_REDIRECT_";
	
	/**
	 * 会员登录数据缓存前缀
	 */
	public static final String USER_SESSION_CACHE = CACHE_PREFIX + "USER_SESSION_CACHE_";
	
	/**
	 * 客户端登录数据缓存前缀
	 */
	public static final String CLIENT_SESSION_CACHE = CACHE_PREFIX + "CLIENT_SESSION_CACHE_";
	
    /**
     * 无操作时登出时间，30分钟未操作登出
     */
    public static final int CLIENT_LOGOUT_TIMES = 7200;
    
    /**
     * 客户端下载前锁
     */
    public static final String CLIENT_BEFORE_UPLOAD_LOCK = CACHE_PREFIX + "CLIENT_BEFORE_UPLOAD_LOCK_";
    
    /**
     * 客户端下载前锁 值
     */
    public static final String CLIENT_BEFORE_UPLOAD_LOCK_FLAG = "OK";
    
    
    /**
     * 无操作时登出时间，30分钟未操作登出
     */
    public static final int CLIENT_BEFORE_UPLOAD_LOCK_TIME = 30*60;
    
    /**
     * 唯一登录
     */
    public static final String CLIENT_SINGLE_LOGIN = CACHE_PREFIX + "CLIENT_SINGLE_LOGIN_";
}
