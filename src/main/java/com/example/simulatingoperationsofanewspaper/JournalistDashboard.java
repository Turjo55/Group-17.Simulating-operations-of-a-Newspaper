package com.example.simulatingoperationsofanewspaper;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class JournalistDashboard {
    @javafx.fxml.FXML
    private BorderPane borderPane;

    private User user;
    @javafx.fxml.FXML
    private Label nameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public void initData(User user) {
        this.user = user;
        nameLabel.setText(user.getName());
    }

    @javafx.fxml.FXML
    public void handlePerformanceAndEngagementTracking(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_PerformanceAndEngagementTracking.fxml"));
        Parent root = loader.load();
        JournalistPerformanceAndEngagementTracking controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleArticleRevisionAndEditorialfeedback(ActionEvent event) {
        // try {
        //     FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_ArticleRevisionAndEditorialFeedback.fxml"));
        //     Parent root = loader.load();
        //     JournalistArticleRevisionAndEditorialFeedback controller = loader.getController();
        //     controller.initData(user);
        //     borderPane.setCenter(root);
        // } catch (IOException e) {
        //     showAlert("Error", "Failed to load article revision interface: " + e.getMessage());
        // }
    }

    @javafx.fxml.FXML
    public void handleResearchAndFactChecking(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_ResearchAndFactChecking.fxml"));
        Parent root = loader.load();
        JournalistResearchAndFactChecking controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleMultimediaCcontentUploadAndManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Journalist_MultimediaContentUploadAndManagement.fxml"));
        Parent root = loader.load();
        JournalistMultimediaContentUploadAndManagement controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleSchedulingAndPublishingmanagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_SchedulingAndPublishingManagement.fxml"));
        Parent root = loader.load();
        JournalistSchedulingAndPublishingManagement controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleCollaborationsWithOtherJournalists(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("Journalist_CollaborationsWithOtherJournalists.fxml"));
        Parent root = loader.load();
        JournalistCollaborationsWithOtherJournalists controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleInterviewAndSourceManagement(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_InterviewAndSourceManagement.fxml"));
        Parent root = loader.load();
        JournalistInterviewAndSourceManagement controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleArticleCreationAndSubmission(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Journalist_ArticleCreationAndSubmission.fxml"));
        Parent root = loader.load();

        JournalistArticleCreationAndSubmission controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TemporaryLogin.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}