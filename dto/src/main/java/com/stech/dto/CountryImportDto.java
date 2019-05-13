package com.stech.dto;

import java.io.Serializable;

import com.poiji.annotation.ExcelCellName;
import com.stech.entity.CountryInfo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CountryImportDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@ExcelCellName("country")
	private String country;

	@ExcelCellName("division")
	private String division;

	@ExcelCellName("district")
	private String district;

	@ExcelCellName("thana")
	private String thana;

	@ExcelCellName("postcode")
	private String postcode;

	public CountryInfo toImportData() {

		CountryInfo commonData = new CountryInfo();
		commonData.setCountry(country);
		commonData.setDivision(division);
		commonData.setDistrict(district);
		commonData.setThana(thana);
		commonData.setPostCode(postcode);
		return commonData;
	}
}
