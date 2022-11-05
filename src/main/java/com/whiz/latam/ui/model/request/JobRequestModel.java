package com.whiz.latam.ui.model.request;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class JobRequestModel {

	@NotNull
	private int job_id;

}
