package com.hhh.scheduler.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hhh.scheduler.domain.JobInfo;
import com.hhh.scheduler.service.JobService;
import com.hhh.scheduler.service.QuartzManager;

@RestController
@RequestMapping(value="/scheduler")
public class SchedulerController {

	@Autowired
	private QuartzManager manager;
	@Autowired
	private JobService jobservice;
	
	/**
	 * 修改指定job的执行时间规则
	 * @param jobName
	 * @param cron
	 * @return
	 */
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(String jobName, String cron){
		manager.modifyJobCron(jobName, cron);
		return "true";
	}
	
	/**
	 * 获到所有的job列表
	 * @return
	 */
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public List<JobInfo> list(){
		return jobservice.findJobAll();
	}
}
