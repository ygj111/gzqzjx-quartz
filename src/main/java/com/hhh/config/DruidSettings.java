package com.hhh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 数据源配置项
 * @author 3hzl
 *
 */
@Component
@ConfigurationProperties(prefix="datasource")
public class DruidSettings {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int maxActive;
	private int initialSize;
	private int maxWait;
	private int minIdle;
	private int timeBetweenEvictionRunsMillis;
	private String validationQuery;
	private String testWhileIdle;
	private int slowSQLMills;
	private String logSlowSql;
	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaxActive() {
		return maxActive;
	}
	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}
	public int getInitialSize() {
		return initialSize;
	}
	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}
	public int getMaxWait() {
		return maxWait;
	}
	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public String getValidationQuery() {
		return validationQuery;
	}
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}
	public String getTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(String testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public int getSlowSQLMills() {
		return slowSQLMills;
	}
	public void setSlowSQLMills(int slowSQLMills) {
		this.slowSQLMills = slowSQLMills;
	}
	public String getLogSlowSql() {
		return logSlowSql;
	}
	public void setLogSlowSql(String logSlowSql) {
		this.logSlowSql = logSlowSql;
	}
	
	
}
