package com.stech.enums;

public enum Participated {

	INDIVIDUAL("Individual"), COMPANY("Company");

	private String label;

	Participated(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
