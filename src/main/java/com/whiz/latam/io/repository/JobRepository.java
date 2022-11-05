package com.whiz.latam.io.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.whiz.latam.io.entity.EmployeeEntity;
import com.whiz.latam.io.entity.JobEntity;

public interface JobRepository extends CrudRepository<EmployeeEntity, Long> {

	List<EmployeeEntity> findByJob(JobEntity job);
	
}
