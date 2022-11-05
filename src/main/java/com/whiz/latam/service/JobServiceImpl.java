package com.whiz.latam.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.whiz.latam.io.entity.EmployeeEntity;
import com.whiz.latam.io.entity.JobEntity;
import com.whiz.latam.io.repository.JobRepository;
import com.whiz.latam.shared.dto.EmployeeJobDto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JobServiceImpl implements JobService {

	private final JobRepository employeeRepository;
	private ModelMapper modelMapper;

	@Override
	public List<EmployeeJobDto> getEmployees(int jobId) {

		JobEntity job = new JobEntity();
		job.setId(jobId);
		
		List<EmployeeEntity> employees = (List<EmployeeEntity>) employeeRepository.findAll();
		List<EmployeeEntity> employesFilterByJob = employees.stream().filter(j-> j.getJob().getId()==jobId).collect(Collectors.toList());
		employesFilterByJob.sort((j,j1)-> j.getLastName().compareTo(j1.getLastName()));
		
		return employesFilterByJob
				.stream()
				.map(employeeJobDto -> modelMapper.map(employeeJobDto, EmployeeJobDto.class))
				.collect(Collectors.toList());		
	}

}
