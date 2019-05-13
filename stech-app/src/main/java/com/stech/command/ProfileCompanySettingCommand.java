package com.stech.command;

import javax.validation.Valid;

import com.stech.entity.CompanySetting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCompanySettingCommand {

	@Valid
	private CompanySetting companySetting;
}
