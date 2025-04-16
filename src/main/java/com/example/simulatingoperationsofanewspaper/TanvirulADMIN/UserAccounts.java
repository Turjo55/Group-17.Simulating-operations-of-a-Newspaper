package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

public class UserAccounts {
    private  String username;
    private String userId;
    private String userRole;
    private String accountStatus;

    public UserAccounts(String username, String userId, String userRole, String accountStatus) {
        this.username = username;
        this.userId = userId;
        this.userRole = userRole;
        this.accountStatus = accountStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return "UserAccounts{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", userRole='" + userRole + '\'' +
                ", accountStatus='" + accountStatus + '\'' +
                '}';
    }
}
