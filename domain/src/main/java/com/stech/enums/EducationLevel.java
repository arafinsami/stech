package com.stech.enums;

public enum EducationLevel {

    SSC("SSC"),
    HSC("HSC"),
    BSC("BSC"),
    MSC("MSC"),
    PHD("PHD");

    private String label;

    EducationLevel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
