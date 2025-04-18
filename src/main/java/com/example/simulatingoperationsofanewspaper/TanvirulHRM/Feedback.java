package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

public class Feedback {
    private String employeeName;
    private int employeeCode;
    private double performanceScore;

    public Feedback(String employeeName, int employeeCode, double performanceScore) {
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.performanceScore = performanceScore;
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

    public double getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(double performanceScore) {
        this.performanceScore = performanceScore;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeCode=" + employeeCode +
                ", performanceScore=" + performanceScore +
                '}';
    }
}
