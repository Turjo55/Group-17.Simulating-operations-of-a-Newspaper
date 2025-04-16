package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

public class Complaints {
    private String employeeName;
    private String complaintType;
    private String status;
    private String notes;
    private String complaintDetails;

    public Complaints(String employeeName, String complaintType, String status, String notes, String complaintDetails) {
        this.employeeName = employeeName;
        this.complaintType = complaintType;
        this.status = status;
        this.notes = notes;
        this.complaintDetails = complaintDetails;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getComplaintDetails() {
        return complaintDetails;
    }

    public void setComplaintDetails(String complaintDetails) {
        this.complaintDetails = complaintDetails;
    }

    @Override
    public String toString() {
        return "Complaints{" +
                "employeeName='" + employeeName + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                ", complaintDetails='" + complaintDetails + '\'' +
                '}';
    }
}
