package com.stech.command;

import javax.validation.Valid;

import com.stech.entity.CompanyInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCompanyInfoCommand {

	@Valid
	private CompanyInfo companyInfo;
}
