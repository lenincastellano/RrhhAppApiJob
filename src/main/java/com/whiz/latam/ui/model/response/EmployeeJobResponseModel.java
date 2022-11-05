package com.whiz.latam.ui.model.response;

import java.util.List;

import com.whiz.latam.shared.dto.EmployeeJobDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeJobResponseModel {

	private List<EmployeeJobDto> employees;

}
