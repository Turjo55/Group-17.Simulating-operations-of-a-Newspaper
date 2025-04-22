package com.example.simulatingoperationsofanewspaper.maliha;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class EditorDashboard {
    @javafx.fxml.FXML
    private BorderPane borderPane;
    @javafx.fxml.FXML
    private Label nameLabel;
    private User user;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public void initData(User user) {
        this.user = user;
        nameLabel.setText(user.getUsername());
    }

    @javafx.fxml.FXML
    public void handleReviewingAndApprovingArticles(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_ReviewingAndApprovingArticles.fxml"));
        Parent root = loader.load();
        EditorReviewingAndApprovingArticles controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleAssigningArticlesToJournalists(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_AssigningArticlesToJournalists.fxml"));
        Parent root = loader.load();
        EditorAssigningArticlesToJournalists controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleEditingAndFormattingArticles(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_EditingAndFormattingArticles.fxml"));
        Parent root = loader.load();
        EditorEditingAndFormattingArticles controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleManagingEditorialWorkflow(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_ManagingEditorialWorkflow.fxml"));
        Parent root = loader.load();
        EditorManagingEditorialWorkflow controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleQualityControlAndComplianceCheck(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_QualityControlAndComplianceCheck.fxml"));
        Parent root = loader.load();
        EditorQualityControlAndComplianceCheck controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleManagingBreakingNewsAndUrgentArticles(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_ManagingBreakingNewsAndUrgentArticles.fxml"));
        Parent root = loader.load();
        EditorManagingBreakingNewsAndUrgentArticles controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleCoordinatingWithOtherDepartments(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_CoordinatingWithOtherDepartments.fxml"));
        Parent root = loader.load();
        EditorCoordinatingWithOtherDepartments controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleSchedulingAndPublishingFinalArticles(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Editor_SchedulingAndPublishingFinalArticles.fxml"));
        Parent root = loader.load();
        EditorSchedulingAndPublishingFinalArticles controller = loader.getController();
        controller.initData(user);
        borderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) throws IOException {
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
}