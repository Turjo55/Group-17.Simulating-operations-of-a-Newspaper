package Shorna.java;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class AuditLog {
        private final StringProperty transactionId;
        private final StringProperty date;
        private final DoubleProperty amount;
        private final StringProperty status;

        public AuditLog(String transactionId, String date, double amount, String status) {
            this.transactionId = new SimpleStringProperty(transactionId);
            this.date = new SimpleStringProperty(date);
            this.amount = new SimpleDoubleProperty(amount);
            this.status = new SimpleStringProperty(status);
        }

        public String getTransactionId() {
            return transactionId.get();
        }

        public void setTransactionId(String value) {
            transactionId.set(value);
        }

        public StringProperty transactionIdProperty() {
            return transactionId;
        }

        public String getDate() {
            return date.get();
        }

        public void setDate(String value) {
            date.set(value);
        }

        public StringProperty dateProperty() {
            return date;
        }

        public double getAmount() {
            return amount.get();
        }

        public void setAmount(double value) {
            amount.set(value);
        }

        public DoubleProperty amountProperty() {
            return amount;
        }

        public String getStatus() {
            return status.get();
        }

        public void setStatus(String value) {
            status.set(value);
        }

        public StringProperty statusProperty() {
            return status;
        }
    }


