package Shorna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class AutomatedNotificationsAlerts {

    @FXML
    private TextArea notificationLog;

    @FXML
    void handlePromotionalNotification(ActionEvent event) {
        notificationLog.appendText("Promotional Email/Text sent to subscribers.\n");
    }

    @FXML
    void handleSubscriptionReminder(ActionEvent event) {
        notificationLog.appendText("Reminder sent for expiring subscriptions.\n");
    }

    @FXML
    void handleAdInquiryNotification(ActionEvent event) {
        notificationLog.appendText("Sales notified about new ad inquiry.\n");
    }

    @FXML
    void handleTrendingContentAlert(ActionEvent event) {
        notificationLog.appendText("Content team alerted about trending articles.\n");
    }

    public AutomatedNotificationsAlerts(TextArea notificationLog) {
        this.notificationLog = notificationLog;
    }

    public TextArea getNotificationLog() {
        return notificationLog;
    }

    public void setNotificationLog(TextArea notificationLog) {
        this.notificationLog = notificationLog;
    }

    @Override
    public String toString() {
        return "AutomatedNotificationsAlerts{" +
                "notificationLog=" + notificationLog +
                '}';
    }
}
