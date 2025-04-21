package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EvaluationFeedbackController
{
    @javafx.fxml.FXML
    private Label scoreLabel;
    @javafx.fxml.FXML
    private TableColumn scoreTableColumn;
    @javafx.fxml.FXML
    private TextField scoreTextField;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn codeTableColumn;
    @javafx.fxml.FXML
    private TextField codeTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label codeLabel;
    @javafx.fxml.FXML
    private TableView addPerformanceScoreTableView;
    @javafx.fxml.FXML
    private Label nameLabel;

    private ObservableList<EmployeePerformance> performanceData = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        scoreTableColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        addPerformanceScoreTableView.setItems(performanceData);
    }
    @FXML
    private void addPerformanceScoreButton(ActionEvent event) {
        try {
            String name = nameTextField.getText();
            String code = codeTextField.getText();
            int score = Integer.parseInt(scoreTextField.getText());

            if (name.isEmpty() || code.isEmpty()) {
                showAlert("Error", "fill all fields!");
                return;
            }

            if (score < 0 || score > 100) {
                showAlert("Error", "Score must  0 and 100");
                return;
            }

            performanceData.add(new EmployeePerformance(name, code, score));
            clearFields();
        } catch (NumberFormatException e) {
            showAlert("Error", "valid score (0-100)");
        }
    }

    private void clearFields() {
        nameTextField.clear();
        codeTextField.clear();
        scoreTextField.clear();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class EmployeePerformance {
        private final String name;
        private final String code;
        private final int score;

        public EmployeePerformance(String name, String code, int score) {
            this.name = name;
            this.code = code;
            this.score = score;
        }

        public String getName() { return name; }
        public String getCode() { return code; }
        public int getScore() { return score; }
    }
}