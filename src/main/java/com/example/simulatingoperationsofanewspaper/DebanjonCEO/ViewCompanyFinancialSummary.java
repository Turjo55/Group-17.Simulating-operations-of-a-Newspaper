package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class ViewCompanyFinancialSummary {

    private String budgetId;
    private String description;
    private double amount;
    private Str date;

    public String getBudgetId() {
        return budgetId;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Str getDate() {
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

    public void setDate(Str date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ViewCompanyFinancialSummary{" +
                "budgetId='" + budgetId + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }



    public ViewCompanyFinancialSummary(String budgetId, String description, double amount, Str date) {
        this.budgetId = budgetId;
        this.description = description;
        this.amount = amount;
        this.date = date;


    }
}
