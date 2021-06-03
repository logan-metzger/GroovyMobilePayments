package com.imobile3.groovypayments.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class LoggedInUser {

    final private String displayName;
    final private String userId;
    final private String hoursWorked;

    public LoggedInUser(String userId, String displayName, String hoursWorked) {
        this.userId = userId;
        this.displayName = displayName;
        this.hoursWorked = hoursWorked;
    }

    public String getUserId() {
        return userId;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    public String getHoursWorked() {
        return hoursWorked;
    }
}
