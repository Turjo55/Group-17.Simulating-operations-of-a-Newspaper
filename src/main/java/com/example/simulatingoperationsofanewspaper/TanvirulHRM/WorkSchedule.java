package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import java.time.LocalDate;

public class WorkSchedule {
    private String employeeName;
    private int employeeCode;
    private String shift;
    private LocalDate deadline;

    public WorkSchedule(String employeeName, int employeeCode, String shift, LocalDate deadline) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.shift = shift;
        this.deadline = deadline;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "WorkSchedule{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeCode=" + employeeCode +
                ", shift='" + shift + '\'' +
                ", deadline=" + deadline +
                '}';
    }
}
