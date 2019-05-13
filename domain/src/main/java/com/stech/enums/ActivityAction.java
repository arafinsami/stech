package com.stech.enums;

public enum ActivityAction {

    VIEW("View"),
    SIGNUP("SIGNUP"),
    SAVE("Save"),
    CREATE("Create"),
    UPDATE("Update"),
    SEND("Send"),
    ACCEPT("Accept"),
    DENY("Deny Invitation"),
    DELETE("Delete"),
    CANCEL("Cancel"),
    CONFIRM("Confirm"),
    CHANGE_PASSWORD("Password Change"),
    ACCOUNT_ACTIVATE("Account Activate"),
    LOGIN("Login"),
    LOGOUT("Logout"),
    PROFILE_CREATED("PROFILE CREATED");

    private String label;

    ActivityAction(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
