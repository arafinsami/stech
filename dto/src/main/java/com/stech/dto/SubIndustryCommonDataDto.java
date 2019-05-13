package com.stech.dto;

import com.stech.entity.SubIndustryCommonData;
import com.stech.enums.Industry;

import lombok.Data;

@Data
public class SubIndustryCommonDataDto {

	private Long id;
	private Industry industry;
	private String subIndustry;

	public static SubIndustryCommonDataDto select(SubIndustryCommonData data) {

		SubIndustryCommonDataDto dto = new SubIndustryCommonDataDto();
		dto.setId(data.getId());
		dto.setIndustry(data.getIndustry());
		dto.setSubIndustry(data.getSubIndustry());
		return dto;
	}
}
