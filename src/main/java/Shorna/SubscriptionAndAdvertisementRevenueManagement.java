package Shorna;

import Shorna.java.RevenueReport;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SubscriptionAndAdvertisementRevenueManagement {



        @FXML
        private Label advertisementRevenueLabel;

        @FXML
        private Label pendingPaymentsLabel;

        @FXML
        private Label receivedPaymentsLabel;

        @FXML
        private Label subscriptionAndAdvertisementRevenueManagementLabel;

        @FXML
        private Label subscriptionRevenueLabel;

        @FXML
        private DatePicker fromDatePicker;

        @FXML
        private TextField revenueDetailsTextField;

        @FXML
        private DatePicker toDatePicker;

        @FXML
        void advertisementRevenueManagementPointView(ActionEvent event) {
            // Logic to handle advertisement revenue management view
        }

        @FXML
        void subscriptionManagementPointView(ActionEvent event) {
            // Logic to handle subscription management view
        }

        @FXML
        void handleExportCSV(ActionEvent event) {
            // Export logic here
        }

        @FXML
        void handleExportPDF(ActionEvent event) {
            // Export logic here
        }

        @FXML
        void handleGenerateReport(ActionEvent event) {
            LocalDate fromDate = fromDatePicker.getValue();
            LocalDate toDate = toDatePicker.getValue();
            String details = revenueDetailsTextField.getText();

            // Sample placeholder logic for data generation
            RevenueReport report = new RevenueReport(details, 1200.00, 850.00, 300.00, 750.00);

            subscriptionRevenueLabel.setText("Subscription Revenue: $" + report.getSubscriptionRevenue());
            advertisementRevenueLabel.setText("Advertisement Revenue: $" + report.getAdvertisementRevenue());
            pendingPaymentsLabel.setText("Pending Payments: $" + report.getPendingPayments());
            receivedPaymentsLabel.setText("Received Payments: $" + report.getReceivedPayments());
        }

    public SubscriptionAndAdvertisementRevenueManagement(Label advertisementRevenueLabel, Label pendingPaymentsLabel, Label receivedPaymentsLabel, Label subscriptionAndAdvertisementRevenueManagementLabel, Label subscriptionRevenueLabel, DatePicker fromDatePicker, TextField revenueDetailsTextField, DatePicker toDatePicker) {
        this.advertisementRevenueLabel = advertisementRevenueLabel;
        this.pendingPaymentsLabel = pendingPaymentsLabel;
        this.receivedPaymentsLabel = receivedPaymentsLabel;
        this.subscriptionAndAdvertisementRevenueManagementLabel = subscriptionAndAdvertisementRevenueManagementLabel;
        this.subscriptionRevenueLabel = subscriptionRevenueLabel;
        this.fromDatePicker = fromDatePicker;
        this.revenueDetailsTextField = revenueDetailsTextField;
        this.toDatePicker = toDatePicker;
    }

    public Label getAdvertisementRevenueLabel() {
        return advertisementRevenueLabel;
    }

    public void setAdvertisementRevenueLabel(Label advertisementRevenueLabel) {
        this.advertisementRevenueLabel = advertisementRevenueLabel;
    }

    public Label getPendingPaymentsLabel() {
        return pendingPaymentsLabel;
    }

    public void setPendingPaymentsLabel(Label pendingPaymentsLabel) {
        this.pendingPaymentsLabel = pendingPaymentsLabel;
    }

    public Label getReceivedPaymentsLabel() {
        return receivedPaymentsLabel;
    }

    public void setReceivedPaymentsLabel(Label receivedPaymentsLabel) {
        this.receivedPaymentsLabel = receivedPaymentsLabel;
    }

    public Label getSubscriptionAndAdvertisementRevenueManagementLabel() {
        return subscriptionAndAdvertisementRevenueManagementLabel;
    }

    public void setSubscriptionAndAdvertisementRevenueManagementLabel(Label subscriptionAndAdvertisementRevenueManagementLabel) {
        this.subscriptionAndAdvertisementRevenueManagementLabel = subscriptionAndAdvertisementRevenueManagementLabel;
    }

    public Label getSubscriptionRevenueLabel() {
        return subscriptionRevenueLabel;
    }

    public void setSubscriptionRevenueLabel(Label subscriptionRevenueLabel) {
        this.subscriptionRevenueLabel = subscriptionRevenueLabel;
    }

    public DatePicker getFromDatePicker() {
        return fromDatePicker;
    }

    public void setFromDatePicker(DatePicker fromDatePicker) {
        this.fromDatePicker = fromDatePicker;
    }

    public TextField getRevenueDetailsTextField() {
        return revenueDetailsTextField;
    }

    public void setRevenueDetailsTextField(TextField revenueDetailsTextField) {
        this.revenueDetailsTextField = revenueDetailsTextField;
    }

    public DatePicker getToDatePicker() {
        return toDatePicker;
    }

    public void setToDatePicker(DatePicker toDatePicker) {
        this.toDatePicker = toDatePicker;
    }

    @Override
    public String toString() {
        return "SubscriptionAndAdvertisementRevenueManagement{" +
                "advertisementRevenueLabel=" + advertisementRevenueLabel +
                ", pendingPaymentsLabel=" + pendingPaymentsLabel +
                ", receivedPaymentsLabel=" + receivedPaymentsLabel +
                ", subscriptionAndAdvertisementRevenueManagementLabel=" + subscriptionAndAdvertisementRevenueManagementLabel +
                ", subscriptionRevenueLabel=" + subscriptionRevenueLabel +
                ", fromDatePicker=" + fromDatePicker +
                ", revenueDetailsTextField=" + revenueDetailsTextField +
                ", toDatePicker=" + toDatePicker +
                '}';
    }
}




