package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import java.time.LocalDate;

public class Training {
    private  String employeeName;
    private String employeeId;
    private String trainingTitle;
    private LocalDate trainingDate;
    private String trainingType;

    public Training(String employeeName, String employeeId, String trainingTitle, LocalDate trainingDate, String trainingType) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.trainingTitle = trainingTitle;
        this.trainingDate = trainingDate;
        this.trainingType = trainingType;
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

    public String getTrainingTitle() {
        return trainingTitle;
    }

    public void setTrainingTitle(String trainingTitle) {
        this.trainingTitle = trainingTitle;
    }

    public LocalDate getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(LocalDate trainingDate) {
        this.trainingDate = trainingDate;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    @Override
    public String toString() {
        return "Training{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", trainingTitle='" + trainingTitle + '\'' +
                ", trainingDate=" + trainingDate +
                ", trainingType='" + trainingType + '\'' +
                '}';
    }
}
