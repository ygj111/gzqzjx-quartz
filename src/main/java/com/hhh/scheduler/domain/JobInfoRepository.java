package com.hhh.scheduler.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobInfoRepository extends JpaRepository<JobInfo, String> {

	public JobInfo findByName(String name);
	
	public void deleteByName(String name);
}
