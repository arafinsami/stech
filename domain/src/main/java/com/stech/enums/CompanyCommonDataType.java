package com.stech.enums;

public enum CompanyCommonDataType {

	SERVICE("Company Service"), SPECIALITY("Company Speciality");

	private String label;

	CompanyCommonDataType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
