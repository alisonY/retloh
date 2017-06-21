package com.retloh.quartz;

import java.util.ArrayList;
import java.util.List;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.TriggerKey;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchedulerJob {

	// schedulerFactoryBean 由spring创建注入
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mvc.xml");

	Scheduler scheduler = (Scheduler) ctx.getBean("myScheduler");
	// 这里获取任务信息数据
	/*List<ScheduledJob> jobList = new ArrayList<ScheduledJob>();
	 * for (ScheduledJob job : jobList) {
	 * 
	 * TriggerKey triggerKey = TriggerKey.triggerKey("", "");
	 * 
	 * //获取trigger，即在spring配置文件中定义的 bean id="myTrigger" CronTrigger trigger =
	 * (CronTrigger) scheduler.getTrigger(triggerKey);
	 * 
	 * //不存在，创建一个 if (null == trigger) { JobDetail jobDetail =
	 * JobBuilder.newJob(QuartzJobFactoryImpl.class).withIdentity(job.getJobName
	 * (), job.getJobGroup()).build();
	 * jobDetail.getJobDataMap().put("scheduleJob", job);
	 * 
	 * //表达式调度构建器 CronScheduleBuilder scheduleBuilder =
	 * CronScheduleBuilder.cronSchedule(job.getCronExpression());
	 * 
	 * //按新的cronExpression表达式构建一个新的trigger trigger =
	 * TriggerBuilder.newTrigger().withIdentity(job.getJobName(),
	 * job.getJobGroup()).withSchedule(scheduleBuilder).build();
	 * scheduler.scheduleJob(jobDetail, trigger); } else { //
	 * Trigger已存在，那么更新相应的定时设置 //表达式调度构建器 CronScheduleBuilder scheduleBuilder =
	 * CronScheduleBuilder.cronSchedule(job.getCronExpression());
	 * 
	 * //按新的cronExpression表达式重新构建trigger trigger =
	 * trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(
	 * scheduleBuilder).build();
	 * 
	 * //按新的trigger重新设置job执行 scheduler.rescheduleJob(triggerKey, trigger); } }
	 */
}
