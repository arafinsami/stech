package com.stech.command;

import javax.validation.Valid;

import com.stech.entity.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileExperienceCommand {

	@Valid
	private Experience experience;
}
