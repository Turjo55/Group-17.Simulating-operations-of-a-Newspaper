package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import java.time.LocalDate;

public class Salaries {
    private int employeeID;
    private String employeeName;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private LocalDate paymentDate;

    public Salaries(int employeeID, String employeeName, double basicSalary, double allowances, double deductions, LocalDate paymentDate) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.paymentDate = paymentDate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Salaries{" +
                "employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", basicSalary=" + basicSalary +
                ", allowances=" + allowances +
                ", deductions=" + deductions +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
