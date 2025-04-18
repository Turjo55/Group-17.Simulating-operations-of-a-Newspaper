package Shorna;

import Shorna.java.ContentPromotionModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.time.LocalDate;

public class ContentPromotionAndAudienceEngagement {

    @FXML
    private Label ContentPromotionAudienceEngagementLabel;

    @FXML
    private TextArea emailBodyArea;

    @FXML
    private DatePicker emailScheduleDate;

    @FXML
    private TextField emailSubjectField;

    @FXML
    private DatePicker postDatePicker;

    @FXML
    private TextArea reportArea;

    @FXML
    private TextField socialMediaMessageField;

    private ContentPromotionModel model = new ContentPromotionModel();

    @FXML
    void handleGenerateEngagementReport(ActionEvent event) {
        String report = model.generateEngagementReport();
        reportArea.setText(report);
    }

    @FXML
    void handleScheduleEmailCampaign(ActionEvent event) {
        String subject = emailSubjectField.getText();
        String body = emailBodyArea.getText();
        LocalDate date = emailScheduleDate.getValue();

        if (subject.isEmpty() || body.isEmpty() || date == null) {
            reportArea.setText("Please fill in all email campaign fields.");
        } else {
            model.scheduleEmailCampaign(subject, body, date);
            reportArea.setText("Email campaign scheduled successfully.");
        }
    }

    @FXML
    void handleScheduleSocialMediaPost(ActionEvent event) {
        String message = socialMediaMessageField.getText();
        LocalDate date = postDatePicker.getValue();

        if (message.isEmpty() || date == null) {
            reportArea.setText("Please enter message and select post date.");
        } else {
            model.scheduleSocialMediaPost(message, date);
            reportArea.setText("Social media post scheduled successfully.");
        }
    }

    @FXML
    void handleSelectContentPromotion(ActionEvent event) {
        reportArea.setText("Content promotion module selected.");
    }

    public ContentPromotionAndAudienceEngagement(Label contentPromotionAudienceEngagementLabel, TextArea emailBodyArea, DatePicker emailScheduleDate, TextField emailSubjectField, DatePicker postDatePicker, TextArea reportArea, TextField socialMediaMessageField, ContentPromotionModel model) {
        ContentPromotionAudienceEngagementLabel = contentPromotionAudienceEngagementLabel;
        this.emailBodyArea = emailBodyArea;
        this.emailScheduleDate = emailScheduleDate;
        this.emailSubjectField = emailSubjectField;
        this.postDatePicker = postDatePicker;
        this.reportArea = reportArea;
        this.socialMediaMessageField = socialMediaMessageField;
        this.model = model;
    }

    public Label getContentPromotionAudienceEngagementLabel() {
        return ContentPromotionAudienceEngagementLabel;
    }

    public void setContentPromotionAudienceEngagementLabel(Label contentPromotionAudienceEngagementLabel) {
        ContentPromotionAudienceEngagementLabel = contentPromotionAudienceEngagementLabel;
    }

    public TextArea getEmailBodyArea() {
        return emailBodyArea;
    }

    public void setEmailBodyArea(TextArea emailBodyArea) {
        this.emailBodyArea = emailBodyArea;
    }

    public DatePicker getEmailScheduleDate() {
        return emailScheduleDate;
    }

    public void setEmailScheduleDate(DatePicker emailScheduleDate) {
        this.emailScheduleDate = emailScheduleDate;
    }

    public TextField getEmailSubjectField() {
        return emailSubjectField;
    }

    public void setEmailSubjectField(TextField emailSubjectField) {
        this.emailSubjectField = emailSubjectField;
    }

    public DatePicker getPostDatePicker() {
        return postDatePicker;
    }

    public void setPostDatePicker(DatePicker postDatePicker) {
        this.postDatePicker = postDatePicker;
    }

    public TextArea getReportArea() {
        return reportArea;
    }

    public void setReportArea(TextArea reportArea) {
        this.reportArea = reportArea;
    }

    public TextField getSocialMediaMessageField() {
        return socialMediaMessageField;
    }

    public void setSocialMediaMessageField(TextField socialMediaMessageField) {
        this.socialMediaMessageField = socialMediaMessageField;
    }

    public ContentPromotionModel getModel() {
        return model;
    }

    public void setModel(ContentPromotionModel model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ContentPromotionAndAudienceEngagement{" +
                "ContentPromotionAudienceEngagementLabel=" + ContentPromotionAudienceEngagementLabel +
                ", emailBodyArea=" + emailBodyArea +
                ", emailScheduleDate=" + emailScheduleDate +
                ", emailSubjectField=" + emailSubjectField +
                ", postDatePicker=" + postDatePicker +
                ", reportArea=" + reportArea +
                ", socialMediaMessageField=" + socialMediaMessageField +
                ", model=" + model +
                '}';
    }
}
