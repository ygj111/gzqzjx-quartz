package com.hhh.config;

//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.filter.logging.Slf4jLogFilter;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableConfigurationProperties(DruidSettings.class)
@EnableTransactionManagement
public class DruidConfig {
	@Autowired
	private DruidSettings druidSettings;
	
	@Bean
	public DruidDataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		
		// 数据库连接
		druidDataSource.setDriverClassName(druidSettings.getDriver());
		druidDataSource.setUrl(druidSettings.getUrl());
		druidDataSource.setUsername(druidSettings.getUser());
		druidDataSource.setPassword(druidSettings.getPassword());
		
		// 数据池配置
		druidDataSource.setMaxActive(druidSettings.getMaxActive());
		druidDataSource.setInitialSize(druidSettings.getInitialSize());
		druidDataSource.setMaxWait(druidSettings.getMaxWait());
		druidDataSource.setMinIdle(druidSettings.getMinIdle());
		druidDataSource.setTimeBetweenEvictionRunsMillis(druidSettings.getTimeBetweenEvictionRunsMillis());
		druidDataSource.setValidationQuery(druidSettings.getValidationQuery());
		druidDataSource.setTestWhileIdle(Boolean.parseBoolean(druidSettings.getTestWhileIdle()));
		
		return druidDataSource;
	}
	
	/**
	 * 日志过滤
	 * @return
	 */
	@Bean
	public Slf4jLogFilter logFilter() {
		Slf4jLogFilter logFilter =new Slf4jLogFilter();
		logFilter.setStatementExecutableSqlLogEnable(true);
		return logFilter;
	}
}
