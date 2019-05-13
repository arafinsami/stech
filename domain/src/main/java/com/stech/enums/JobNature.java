package com.stech.enums;

public enum JobNature {

	PERMANENT("Parmanent"), PART_TIME("Part Time"), LIMITED_TIME("Limited Time");

	private String label;

	JobNature(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
