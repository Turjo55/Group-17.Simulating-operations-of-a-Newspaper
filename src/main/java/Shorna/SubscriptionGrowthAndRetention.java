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
}
