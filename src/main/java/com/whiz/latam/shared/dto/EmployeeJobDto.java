package com.whiz.latam.shared.dto;

import com.whiz.latam.io.entity.GenderEntity;
import com.whiz.latam.io.entity.JobEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeJobDto {

	private int id;
	private int genderId;
	private int jobId;
	private String name;
	private String lastName;
	private String birthdate;
	private JobEntity job;
	private GenderEntity gender;
}
