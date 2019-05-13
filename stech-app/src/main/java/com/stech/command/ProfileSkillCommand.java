package com.stech.command;

import javax.validation.Valid;

import com.stech.entity.Skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileSkillCommand {

	@Valid
	private Skill skill;
}
