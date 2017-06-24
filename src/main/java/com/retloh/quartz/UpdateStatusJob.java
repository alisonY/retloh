package com.retloh.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.retloh.service.StatisticsServices;

@Component("updateStatusjob")
public class UpdateStatusJob {
	@Autowired
	private StatisticsServices statisticsServices;
	
	public void updateStatus(){
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
	}

}
