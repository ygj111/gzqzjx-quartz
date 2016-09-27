package com.hhh.scheduler.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.hhh.config.WsConfiguration;
import com.hhh.scheduler.domain.BasGcRepository;
import com.hhh.scheduler.service.JobService;
import com.hhh.scheduler.service.WsClient;
import com.hhh.webservice.gztd.QueryProjectForPage;
import com.hhh.webservice.gztd.QueryProjectForPageResponse;
import com.mysql.fabric.xmlrpc.Client;

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
