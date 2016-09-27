package com.hhh.scheduler.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.triggers.CronTriggerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hhh.scheduler.domain.JobInfo;

@Component
public class QuartzManager {
    
    @Autowired
    private JobService jobservice;
    @Autowired
    private Scheduler sched;
    
    public JobInfo addJob(JobInfo job){
    	if(jobservice.findJobByName(job.getName()) == null){
			job = jobservice.saveJob(job);
		}
    	return job;
    }
    
    private void addJobToScheduler(JobInfo job) {
    	if(!isValidExpression(job.getCronExpression())){
    		return;
    	}
        try {  
            JobDetailImpl  jobDetail = new JobDetailImpl();
            jobDetail.setName(job.getName());
            jobDetail.setGroup(job.getGroupName());
            @SuppressWarnings("unchecked")
			Class<Job> cls = (Class<Job>) Class.forName(job.getJobClass());
			jobDetail.setJobClass(cls);
            // 触发器  
            CronTriggerImpl trigger = new CronTriggerImpl();
            TriggerKey triggerKey = null;
            triggerKey = new TriggerKey(job.getTriggerName(), job.getTriggerGroupName());
   
            trigger.setKey(triggerKey);
            trigger.setCronExpression(job.getCronExpression());
            sched.scheduleJob(jobDetail, trigger);  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }
    
    public void modifyJobCron(String jobName, String cron) {
    	JobInfo job = jobservice.findJobByName(jobName);
    	if(job == null){
    		return;
    	}
    	JobKey jobKey = new JobKey(jobName, job.getGroupName());
    	try {
			if(sched.checkExists(jobKey)){
				deleteJob(job);
				job.setCronExpression(cron);
				addJobToScheduler(job);
				jobservice.saveJob(job);
			}
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
    }
    
    private void deleteJob(JobInfo job){
    	TriggerKey triggerkey = new TriggerKey(job.getTriggerName(), job.getTriggerGroupName());
    	try {
			sched.pauseTrigger(triggerkey);
			sched.unscheduleJob(triggerkey);
	        JobKey jobkey = new JobKey(job.getName(), job.getTriggerName());
	        sched.pauseJob(jobkey);
	        sched.deleteJob(jobkey); 
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
    }
    
    private boolean isValidExpression(final String cronExpression) {  
        CronTriggerImpl trigger = new CronTriggerImpl();
        try {
			trigger.setCronExpression(cronExpression);
		} catch (ParseException e) {
			e.printStackTrace();
			return false;
		}
        Date date = trigger.computeFirstFireTime(null);  
        return date != null && date.after(new Date());  
    } 
    
    public void startJobs() {  
        try {  
        	List<JobInfo> list = jobservice.findJobAll();
        	for(JobInfo job : list){
        		addJobToScheduler(job);
        	}
            sched.start();  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }
    
    public void shutdownJobs() {  
        try {  
            if (!sched.isShutdown()) {  
                sched.shutdown();  
            }  
        } catch (Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
}
