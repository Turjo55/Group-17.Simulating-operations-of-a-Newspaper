package Shorna.java;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Expense {

    private final StringProperty category;
        private final DoubleProperty amount;

        public Expense(String category, double amount) {
            this.category = new SimpleStringProperty(category);
            this.amount = new SimpleDoubleProperty(amount);
        }

        public StringProperty categoryProperty() {
            return category;
        }

        public DoubleProperty amountProperty() {
            return amount;
        }

        public String getCategory() {
            return category.get();
        }

        public double getAmount() {
            return amount.get();
        }

        public void setCategory(String category) {
            this.category.set(category);
        }

        public void setAmount(double amount) {
            this.amount.set(amount);
        }
    }


