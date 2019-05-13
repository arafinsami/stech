package com.stech.enums;

public enum Budget {

	YES("Yes"), NO("No");

	private String label;

	Budget(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
