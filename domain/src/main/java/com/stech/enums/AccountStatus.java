package com.stech.enums;

public enum AccountStatus {

    PENDING_VERIFICATION("Pending Verification"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    LOCKED("Locked");

    private String label;

    AccountStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
