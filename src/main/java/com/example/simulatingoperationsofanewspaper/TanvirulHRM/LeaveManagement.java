package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

public class LeaveManagement {
    private String employeeName;
    private String employeeId;
    private int leaveDays;
    private String department;
    private String reason;
    private String status;

    public LeaveManagement(String employeeName, String employeeId, int leaveDays, String department, String reason, String status) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.leaveDays = leaveDays;
        this.department = department;
        this.reason = reason;
        this.status = status;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LeaveManagement{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", leaveDays=" + leaveDays +
                ", department='" + department + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
