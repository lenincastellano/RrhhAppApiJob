package com.whiz.latam.service;

import java.util.List;

import com.whiz.latam.shared.dto.EmployeeJobDto;

public interface JobService {

	List<EmployeeJobDto> getEmployees(int jobId);
}
