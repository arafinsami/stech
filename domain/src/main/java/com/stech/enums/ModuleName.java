package com.stech.enums;

public enum  ModuleName {

	PDS("PDS"),
	SERVICE_SEEKER_SIGNUP("SERVICE SEEKER SIGNUP"),
	SERVICE_PROVIDER_SIGNUP("SERVICE PROVIDER SIGNUP"),
	PROFILE("PROFILE");

    private String label;

    ModuleName(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
