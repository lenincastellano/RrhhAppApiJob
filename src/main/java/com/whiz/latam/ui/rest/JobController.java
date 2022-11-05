package com.whiz.latam.ui.rest;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whiz.latam.service.JobService;
import com.whiz.latam.shared.dto.EmployeeJobDto;
import com.whiz.latam.ui.model.request.JobRequestModel;
import com.whiz.latam.ui.model.response.EmployeeJobResponseModel;

@RestController
@RequestMapping("/v1/jobs")
public class JobController {

	@Autowired
	JobService employeeService;

	@Autowired
	ModelMapper modelMapper;

	@GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeJobResponseModel> createEmployee(@Valid @RequestBody JobRequestModel jobId) {

		List<EmployeeJobDto> employeeJobDto = employeeService.getEmployees(jobId.getJob_id());
		
		EmployeeJobResponseModel employeeResponseModel = new EmployeeJobResponseModel();
		
		employeeResponseModel.setEmployees(employeeJobDto);	
		
		return ResponseEntity.status(HttpStatus.OK).body(employeeResponseModel);
	}
}
