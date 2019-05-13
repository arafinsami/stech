package com.stech.enums;

public enum EducationBoard {

    DHAKA("DHAKA"),
    COMILLA("COMILLA"),
    BORISHAL("BORISHAL"),
    KHULNA("KHULNA"),
    RAJSHAHI("RAJSHAHI"),
    SYLHET("SYLHET"),
    CHITTAGONG("CHITTAGONG");

    private String label;

    EducationBoard(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
