package com.hhh.scheduler.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.hhh.scheduler.service.WsClient;

@DisallowConcurrentExecution
public class SyncUnitUserInfoJob implements Job{
	@Autowired
	private WsClient client;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		client.syncUnitUserInfo();
		System.out.println("-------------同步企业用户信息结束--------------");
	}
}
