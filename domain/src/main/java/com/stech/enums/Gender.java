package com.stech.enums;

public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    UNKNOWN("Unknown");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
