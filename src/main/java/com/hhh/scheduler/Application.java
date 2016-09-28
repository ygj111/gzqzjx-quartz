package com.hhh.scheduler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.hhh.config.DruidConfig;
import com.hhh.config.QuartzConfiguration;
import com.hhh.config.WsConfiguration;
import com.hhh.scheduler.domain.JobInfo;
import com.hhh.scheduler.service.QuartzManager;
import com.hhh.scheduler.service.WsClient;

@SpringBootApplication
@Import({DruidConfig.class, QuartzConfiguration.class,WsConfiguration.class})
public class Application {
	
    private final static String DEFAULT_JOB_GROUP_NAME = "hhh_Quartz_Default_Group";  
    private final static String DEFAULT_TRIGGER_GROUP_NAME = "hhh_Quartz_Default_TriggerGroup";
    
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * 启动工作任务
	 * @param manager
	 * @return
	 */
	@Bean
	CommandLineRunner lookup(final QuartzManager manager){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				/**********************工程，企业，企业用户同步信息放在一个job里面(SyncInfoJob)*****************************/
//				JobInfo job = new JobInfo();
//				job.setName("sync_info_job");
//				job.setGroupName(DEFAULT_JOB_GROUP_NAME);
//				job.setTriggerName("sync_info_job_trigger");
//				job.setTriggerGroupName(DEFAULT_TRIGGER_GROUP_NAME);
//				job.setJobClass("com.hhh.scheduler.job.SyncInfoJob");
//				job.setCronExpression("10/15 * * * * ?");
//				manager.addJob(job);
				/**********************工程，企业，企业用户同步信息放在一个job里面(SyncInfoJob)*****************************/
				
				/**********************工程，企业，企业用户同步信息分开三个job*****************************/
				JobInfo projectJob = new JobInfo();
				projectJob.setName("sync_project_info_job");
				projectJob.setGroupName(DEFAULT_JOB_GROUP_NAME);
				projectJob.setTriggerName("sync_project_info_job_trigger");
				projectJob.setTriggerGroupName(DEFAULT_TRIGGER_GROUP_NAME);
				projectJob.setJobClass("com.hhh.scheduler.job.SyncProjectInfoJob");
				projectJob.setCronExpression("10/15 * * * * ?");
				manager.addJob(projectJob);
				
				JobInfo unitJob = new JobInfo();
				unitJob.setName("sync_unit_info_job");
				unitJob.setGroupName(DEFAULT_JOB_GROUP_NAME);
				unitJob.setTriggerName("sync_unit_info_job_trigger");
				unitJob.setTriggerGroupName(DEFAULT_TRIGGER_GROUP_NAME);
				unitJob.setJobClass("com.hhh.scheduler.job.SyncUnitInfoJob");
				unitJob.setCronExpression("10/15 * * * * ?");
				manager.addJob(unitJob);
				
				JobInfo unitUserJob = new JobInfo();
				unitUserJob.setName("sync_unit_user_info_job");
				unitUserJob.setGroupName(DEFAULT_JOB_GROUP_NAME);
				unitUserJob.setTriggerName("sync_unit_user_info_job_trigger");
				unitUserJob.setTriggerGroupName(DEFAULT_TRIGGER_GROUP_NAME);
				unitUserJob.setJobClass("com.hhh.scheduler.job.SyncUnitUserInfoJob");
				unitUserJob.setCronExpression("10/15 * * * * ?");
				manager.addJob(unitUserJob);
				/**********************工程，企业，企业用户同步信息分开三个job*****************************/
				manager.startJobs();
			}
		};
	}
	
}
