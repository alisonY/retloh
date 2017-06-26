package com.retloh.quartz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.retloh.model.Common;
import com.retloh.service.CommonServices;

@Component("updateStatusjob")
public class UpdateStatusJob {
	@Autowired
	private CommonServices commonServices;
	
	public void updateStatus(){
		List<Common> common_list = commonServices.getData();
		
		for(Common common:common_list){
			common.setStatus(1);
			commonServices.updateByPrimaryKey(common);
		}
		
		System.out.println("I am called by Quartz jobBean using CronTriggerFactoryBean");
	}

}
