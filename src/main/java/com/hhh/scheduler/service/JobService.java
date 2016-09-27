package com.hhh.scheduler.service;

import java.util.List;

import com.hhh.scheduler.domain.JobInfo;

public interface JobService {
	
	/**
	 * 获取所有的工作
	 * @return
	 */
	public List<JobInfo> findJobAll();
	
	/**
	 * 取指定的工作
	 * @param id 工作ID
	 * @return
	 */
	public JobInfo findJobById(String id);
	
	/**
	 * 按任务名称查找工作任务
	 * @param name 工作名称
	 * @return
	 */
	public JobInfo findJobByName(String name);
	
	/**
	 * 保存job
	 * @param job
	 * @return
	 */
	public JobInfo saveJob(JobInfo job);
	
	/**
	 * 新增
	 * @param job
	 * @return
	 */
	public JobInfo addJob(JobInfo job);
	
	/**
	 * 删除指定的任务
	 * @param id 任务ID
	 * @return
	 */
	public void deleteJobById(String id);
	
	/**
	 * 按任务的名称删除任务
	 * @param name
	 */
	public void deleteJobByName(String name);
}
