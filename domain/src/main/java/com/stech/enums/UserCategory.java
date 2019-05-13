package com.stech.enums;

public enum UserCategory {

    SYSTEM("System Root"),
    SERVICE_PROVIDER_COMPANY("SERVICE PROVIDER COMPANY"),
    SERVICE_PROVIDER_INDIVIDUAL("SERVICE PROVIDER INDIVIDUAL"),
    SERVICE_SEEKER_COMPANY("SERVICE SEEKER COMPANY"),
    SERVICE_SEEKER_INDIVIDUAL("SERVICE SEEKER INDIVIDUAL");
    
    private String label;

    UserCategory(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
