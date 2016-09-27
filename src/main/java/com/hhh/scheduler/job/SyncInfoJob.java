package com.hhh.scheduler.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.hhh.scheduler.service.WsClient;

@DisallowConcurrentExecution
public class SyncInfoJob implements Job{
	@Autowired
	private WsClient client;
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
			System.out.println("-----------------从监督系统同步信息开始----------------");
			client.syncProjectInfo();
			client.syncUnitInfo();
			client.syncUnitUserInfo();
			System.out.println("-----------------从监督系统同步信息结束----------------");
	}

}
