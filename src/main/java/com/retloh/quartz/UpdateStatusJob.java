package com.retloh.quartz;

import org.springframework.stereotype.Component;

@Component("updateStatusjob")
public class UpdateStatusJob {
	
	public void updateStatus(){
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
	}

}
