package com.example.simulatingoperationsofanewspaper;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class TemporaryLogin {
    @javafx.fxml.FXML
    private TextField userIdField;
    @javafx.fxml.FXML
    private PasswordField passwordField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleEditorLogin(ActionEvent actionEvent) throws IOException {
        LocalDate today = LocalDate.now();
        User u = new User(userIdField.getText(), userIdField.getText(), passwordField.getText(), today);

        FXMLLoader loader = new FXMLLoader();
        Parent personViewParent = null;
        Scene personViewScene = null;
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        loader.setLocation(getClass().getResource("EditorDashboard.fxml"));
        personViewParent = loader.load();
        personViewScene = new Scene(personViewParent);
        EditorDashboard controller = loader.getController();
        controller.initData(u);

        window.setScene(personViewScene);
        window.show();
    }

    @javafx.fxml.FXML
    public void handleJournalistLogin(ActionEvent actionEvent) throws IOException {
        LocalDate today = LocalDate.now();
        User u = new User(userIdField.getText(), userIdField.getText(), passwordField.getText(), today);

        FXMLLoader loader = new FXMLLoader();
        Parent personViewParent = null;
        Scene personViewScene = null;
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        loader.setLocation(getClass().getResource("JournalistDashboard.fxml"));
        personViewParent = loader.load();
        personViewScene = new Scene(personViewParent);
        JournalistDashboard controller = loader.getController();
        controller.initData(u);

        window.setScene(personViewScene);
        window.show();
    }
}