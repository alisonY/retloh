package com.retloh.quartz;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

/**
 * 触发器
 * 
 *
 */

public class CronTrigger extends CronTriggerFactoryBean{

	@Override
	public void afterPropertiesSet() throws ParseException {
		// TODO Auto-generated method stub
		super.afterPropertiesSet();
	}

	@Override
	public JobDataMap getJobDataMap() {
		// TODO Auto-generated method stub
		return super.getJobDataMap();
	}

	@Override
	public org.quartz.CronTrigger getObject() {
		// TODO Auto-generated method stub
		return super.getObject();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return super.getObjectType();
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return super.isSingleton();
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		super.setBeanName(beanName);
	}

	@Override
	public void setCalendarName(String calendarName) {
		// TODO Auto-generated method stub
		super.setCalendarName(calendarName);
	}

	@Override
	public void setCronExpression(String cronExpression) {
		// TODO Auto-generated method stub
		super.setCronExpression(cronExpression);
	}

	@Override
	public void setDescription(String description) {
		// TODO Auto-generated method stub
		super.setDescription(description);
	}

	@Override
	public void setGroup(String group) {
		// TODO Auto-generated method stub
		super.setGroup(group);
	}

	@Override
	public void setJobDataAsMap(Map<String, ?> jobDataAsMap) {
		// TODO Auto-generated method stub
		super.setJobDataAsMap(jobDataAsMap);
	}

	@Override
	public void setJobDataMap(JobDataMap jobDataMap) {
		// TODO Auto-generated method stub
		super.setJobDataMap(jobDataMap);
	}

	@Override
	public void setJobDetail(JobDetail jobDetail) {
		// TODO Auto-generated method stub
		super.setJobDetail(jobDetail);
	}

	@Override
	public void setMisfireInstruction(int misfireInstruction) {
		// TODO Auto-generated method stub
		super.setMisfireInstruction(misfireInstruction);
	}

	@Override
	public void setMisfireInstructionName(String constantName) {
		// TODO Auto-generated method stub
		super.setMisfireInstructionName(constantName);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		super.setPriority(priority);
	}

	@Override
	public void setStartDelay(long startDelay) {
		// TODO Auto-generated method stub
		super.setStartDelay(startDelay);
	}

	@Override
	public void setStartTime(Date startTime) {
		// TODO Auto-generated method stub
		super.setStartTime(startTime);
	}

	@Override
	public void setTimeZone(TimeZone timeZone) {
		// TODO Auto-generated method stub
		super.setTimeZone(timeZone);
	}

}
