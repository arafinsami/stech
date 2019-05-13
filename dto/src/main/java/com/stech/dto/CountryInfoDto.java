package com.stech.dto;

import com.stech.entity.CountryInfo;

import lombok.Data;

@Data
public class CountryInfoDto {

	private Long id;
	private String country;
	private String division;
	private String district;
	private String thana;
	private String postCode;

	public static CountryInfoDto select(CountryInfo info) {

		CountryInfoDto dto = new CountryInfoDto();
		dto.setId(info.getId());
		dto.setCountry(info.getCountry());
		dto.setDivision(info.getDivision());
		dto.setDistrict(info.getDistrict());
		dto.setThana(info.getThana());
		dto.setPostCode(info.getPostCode());
		return dto;
	}
}
