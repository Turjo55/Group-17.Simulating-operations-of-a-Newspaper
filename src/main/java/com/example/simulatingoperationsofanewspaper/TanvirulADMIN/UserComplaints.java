package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

public class UserComplaints {
    private String userName;
    private String complaintType;
    private String complaintStatus;
    private String adminNotes;
    private String complaintDetails;

    public UserComplaints(String userName, String complaintType, String complaintStatus, String adminNotes, String complaintDetails) {
        this.userName = userName;
        this.complaintType = complaintType;
        this.complaintStatus = complaintStatus;
        this.adminNotes = adminNotes;
        this.complaintDetails = complaintDetails;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getAdminNotes() {
        return adminNotes;
    }

    public void setAdminNotes(String adminNotes) {
        this.adminNotes = adminNotes;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    @Override
    public String toString() {
        return "UserComplaints{" +
                "userName='" + userName + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", complaintStatus='" + complaintStatus + '\'' +
                ", adminNotes='" + adminNotes + '\'' +
                ", complaintDetails='" + complaintDetails + '\'' +
                '}';
    }
}
