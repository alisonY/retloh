package com.retloh.ftpserver;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AppContext implements ApplicationContextAware{
	/**
	 * 通过此类能获取bean实例
	 */
	
	private static ApplicationContext applicationContext;  

	@Override
	public void setApplicationContext(ApplicationContext appContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext= appContext;  
	}
	public Object getBean(String beanName){  
        return this.applicationContext.getBean(beanName);  
    }  

}
