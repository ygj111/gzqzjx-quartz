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
				JobInfo job = new JobInfo();
				job.setName("sync_project_info_job");
				job.setGroupName(DEFAULT_JOB_GROUP_NAME);
				job.setTriggerName("sync_project_info_job_trigger");
				job.setTriggerGroupName(DEFAULT_TRIGGER_GROUP_NAME);
				job.setJobClass("com.hhh.scheduler.job.SyncInfoJob");
				job.setCronExpression("10/15 * * * * ?");
				manager.addJob(job);
				manager.startJobs();
			}
		};
	}
	
//	@Bean
//	CommandLineRunner lookup(final WsClient client){
//		return new CommandLineRunner() {
//			@Override
//			public void run(String... args) throws Exception {
//				client.syncProjectInfo();
//				client.syncUnitInfo();
//				client.syncUnitUserInfo();
//			}
//		};
//	}
}
