package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class ApprovingOperatingBudget {

    private String budgetId;
    private String description;
    private double amount;
    private int date;

    public String getBudgetId() {
        return budgetId;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public int getDate() {
        return date;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ApprovingOperatingBudget{" +
                "budgetId='" + budgetId + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }

    public ApprovingOperatingBudget(String budgetId, String description, double amount, int date) {
        this.budgetId = budgetId;
        this.description = description;
        this.amount = amount;
        this.date = date;


    }
}
