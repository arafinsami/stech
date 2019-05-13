package com.stech.enums;

public enum Services {

	S1("S1"),
	S2("S2"),
	S3("S3");

	private String label;

	Services(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
