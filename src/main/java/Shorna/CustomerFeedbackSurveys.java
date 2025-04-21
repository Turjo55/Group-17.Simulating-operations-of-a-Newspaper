package Shorna;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CustomerFeedbackSurveys {

    @FXML
    private AnchorPane CustomerFeedbackSurveysLabel;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button handleLogin;

    @FXML
    private ListView<String> feedbackList;

    @FXML
    private TextArea autoResponseText;

    private final ObservableList<String> feedbackData = FXCollections.observableArrayList();

    @FXML
    void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println("Login attempted by: " + username);
        // TODO: Add validation logic here
    }

    @FXML
    void loadFeedbackModule(ActionEvent event) {
        feedbackData.setAll(
                "Great UI, very easy to use.",
                "Response time could be improved.",
                "Love the recent updates!",
                "Email confirmations sometimes delayed."
        );
        feedbackList.setItems(feedbackData);
    }

    @FXML
    void generateInsights(ActionEvent event) {
        // Placeholder logic for generating insights
        StringBuilder insights = new StringBuilder("Feedback Summary:\n");
        for (String feedback : feedbackData) {
            insights.append("- ").append(feedback).append("\n");
        }
        autoResponseText.setText(insights.toString());
    }

    @FXML
    void sendResponseEmails(ActionEvent event) {
        String responseContent = autoResponseText.getText();
        System.out.println("Sending the following response email:\n" + responseContent);
        // TODO: Integrate email sending logic here
    }

    public CustomerFeedbackSurveys(AnchorPane customerFeedbackSurveysLabel, TextField usernameField, PasswordField passwordField, Button handleLogin, ListView<String> feedbackList, TextArea autoResponseText) {
        CustomerFeedbackSurveysLabel = customerFeedbackSurveysLabel;
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.handleLogin = handleLogin;
        this.feedbackList = feedbackList;
        this.autoResponseText = autoResponseText;
    }

    public AnchorPane getCustomerFeedbackSurveysLabel() {
        return CustomerFeedbackSurveysLabel;
    }

    public void setCustomerFeedbackSurveysLabel(AnchorPane customerFeedbackSurveysLabel) {
        CustomerFeedbackSurveysLabel = customerFeedbackSurveysLabel;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }


    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Button getHandleLogin() {
        return handleLogin;
    }

    public void setHandleLogin(Button handleLogin) {
        this.handleLogin = handleLogin;
    }

    public ListView<String> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(ListView<String> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public TextArea getAutoResponseText() {
        return autoResponseText;
    }

    public void setAutoResponseText(TextArea autoResponseText) {
        this.autoResponseText = autoResponseText;
    }

    public ObservableList<String> getFeedbackData() {
        return feedbackData;
    }

    @Override
    public String toString() {
        return "CustomerFeedbackSurveys{" +
                "CustomerFeedbackSurveysLabel=" + CustomerFeedbackSurveysLabel +
                ", usernameField=" + usernameField +
                ", passwordField=" + passwordField +
                ", handleLogin=" + handleLogin +
                ", feedbackList=" + feedbackList +
                ", autoResponseText=" + autoResponseText +
                ", feedbackData=" + feedbackData +
                '}';
    }
}
