package com.stech.enums;

public enum Status {

	ACTIVATED("ACTIVATED"),
    INACTIVE("Inactive");

    private String label;

    Status(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
