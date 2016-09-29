package com.hhh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.hhh.scheduler.service.WsClient;

@Configuration
public class WsConfiguration {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.hhh.webservice.gztd");
		return marshaller;
	}

	@Bean
	public WsClient wsClient(Jaxb2Marshaller marshaller) {
		WsClient client = new WsClient();
		client.setDefaultUri("http://192.168.3.64:8000/webservice/platformService");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}
	
}
