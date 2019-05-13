package com.stech.enums;

public enum Assignment {

	VERIFIED("Varified"), UNVERIFIED("Un Varified");

	private String label;

	Assignment(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
