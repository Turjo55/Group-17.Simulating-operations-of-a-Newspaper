package Shorna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class SubscriptionGrowthAndRetention {

    @FXML
    private Label SubscriptionGrowthRetentionLabel;

    @FXML
    private VBox dashboardPane;

    @FXML
    private VBox subscriptionOptionsBox;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextArea reportArea;

    @FXML
    void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Simulate login validation
        if ("admin".equals(username) && "password".equals(password)) {
            dashboardPane.setVisible(true);
        } else {
            reportArea.setText("Invalid credentials. Please try again.");
        }
    }

    @FXML
    void handleSubscriptionManagement(ActionEvent event) {
        reportArea.setText("Accessing Subscription Management...");
    }

    @FXML
    void handleRenewals(ActionEvent event) {
        reportArea.setText("Displaying subscription renewals...");
    }

    @FXML
    void handleCancellations(ActionEvent event) {
        reportArea.setText("Displaying cancelled subscriptions...");
    }

    @FXML
    void handleNewSubscriptions(ActionEvent event) {
        reportArea.setText("Displaying new subscriptions...");
    }

    @FXML
    void handlePromotionalOffers(ActionEvent event) {
        reportArea.setText("Showing current promotional offers...");
    }

    @FXML
    void handleSendPromotions(ActionEvent event) {
        reportArea.setText("Sending promotional emails/SMS to inactive subscribers...");
    }

    public SubscriptionGrowthAndRetention(Label subscriptionGrowthRetentionLabel, VBox dashboardPane, VBox subscriptionOptionsBox, TextField usernameField, TextField passwordField, TextArea reportArea) {
        SubscriptionGrowthRetentionLabel = subscriptionGrowthRetentionLabel;
        this.dashboardPane = dashboardPane;
        this.subscriptionOptionsBox = subscriptionOptionsBox;
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.reportArea = reportArea;
    }

    public Label getSubscriptionGrowthRetentionLabel() {
        return SubscriptionGrowthRetentionLabel;
    }

    public void setSubscriptionGrowthRetentionLabel(Label subscriptionGrowthRetentionLabel) {
        SubscriptionGrowthRetentionLabel = subscriptionGrowthRetentionLabel;
    }

    public VBox getDashboardPane() {
        return dashboardPane;
    }

    public void setDashboardPane(VBox dashboardPane) {
        this.dashboardPane = dashboardPane;
    }

    public VBox getSubscriptionOptionsBox() {
        return subscriptionOptionsBox;
    }

    public void setSubscriptionOptionsBox(VBox subscriptionOptionsBox) {
        this.subscriptionOptionsBox = subscriptionOptionsBox;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }

    public TextArea getReportArea() {
        return reportArea;
    }

    public void setReportArea(TextArea reportArea) {
        this.reportArea = reportArea;
    }

    @Override
    public String toString() {
        return "SubscriptionGrowthAndRetention{" +
                "SubscriptionGrowthRetentionLabel=" + SubscriptionGrowthRetentionLabel +
                ", dashboardPane=" + dashboardPane +
                ", subscriptionOptionsBox=" + subscriptionOptionsBox +
                ", usernameField=" + usernameField +
                ", passwordField=" + passwordField +
                ", reportArea=" + reportArea +
                '}';
    }
}
