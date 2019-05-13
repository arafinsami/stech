package com.stech.enums;

public enum ProjectDuration {

	YES("Yes"), NO("No");

	private String label;

	ProjectDuration(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
