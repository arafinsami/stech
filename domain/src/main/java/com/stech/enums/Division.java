package com.stech.enums;

public enum Division {

	DHAKA("Dhaka"),
	SYLHET("Sylhet"),
	RAJSHAHI("Rajshahi"),
	CHITAGONG("Chittagong"),
	BARISHAL("Barishal"),
	KHULNA("Khulna");

	Division(String label) {
        this.label = label;
    }

    private String label;

    public String getLabel() {
        return label;
    }
}
