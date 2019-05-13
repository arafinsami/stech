package com.stech.command;

import javax.validation.Valid;

import com.stech.entity.Education;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileEducationCommand {

	@Valid
	private Education education;
}
