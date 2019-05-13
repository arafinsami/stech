package com.stech.dto;

import java.io.Serializable;

import com.poiji.annotation.ExcelCellName;
import com.stech.entity.SubIndustryCommonData;
import com.stech.enums.Industry;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IndustryImportDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@ExcelCellName("industry")
	private String industry;

	@ExcelCellName("subIndustry")
	private String subIndustry;

	public SubIndustryCommonData toImportData() {

		SubIndustryCommonData commonData = new SubIndustryCommonData();
		commonData.setIndustry(Industry.resolveFromLabel(industry));
		commonData.setSubIndustry(subIndustry);
		return commonData;
	}
}
