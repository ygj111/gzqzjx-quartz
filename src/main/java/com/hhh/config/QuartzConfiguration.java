
package com.hhh.config;

import java.io.IOException;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.spi.JobFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.hhh.scheduler.job.SyncInfoJob;

@Configuration
public class QuartzConfiguration {

//	@Bean
//	public Scheduler getScheduler() {
//		SchedulerFactory schedulerFactory = new StdSchedulerFactory();  
//		Scheduler scheduler = null;
//		try {
//			scheduler = schedulerFactory.getScheduler();
//		} catch (SchedulerException e) {
//			e.printStackTrace();
//		}
//		return scheduler;
//	}
	
	@Bean
    public JobFactory jobFactory(ApplicationContext applicationContext)
    {
        AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
        jobFactory.setApplicationContext(applicationContext);
        return jobFactory;
    }

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(JobFactory jobFactory) throws IOException {
        SchedulerFactoryBean factory = new SchedulerFactoryBean();
        // this allows to update triggers in DB when updating settings in config file:
        factory.setOverwriteExistingJobs(true);
//        factory.setDataSource(dataSource);
        factory.setJobFactory(jobFactory);
//        factory.setTriggers(sampleJobTrigger);
        return factory;
    }

    @Bean
    public JobDetailFactoryBean sampleJobDetail() {
        return createJobDetail(SyncInfoJob.class);
    }

    private static JobDetailFactoryBean createJobDetail(Class jobClass) {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(jobClass);
        // job has to be durable to be stored in DB:
        factoryBean.setDurability(true);
        return factoryBean;
    }
}
