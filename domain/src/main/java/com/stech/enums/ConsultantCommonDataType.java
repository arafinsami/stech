package com.stech.enums;

public enum ConsultantCommonDataType {

	DEGREE("Consultant Degree"), SERVICE("Consultant Service"), SPECIALITY("Consultant Speciality");

	private String label;

	ConsultantCommonDataType(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
