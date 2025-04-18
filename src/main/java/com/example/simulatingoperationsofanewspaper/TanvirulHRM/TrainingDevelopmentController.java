package com.example.simulatingoperationsofanewspaper.TanvirulHRM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
public class TrainingDevelopmentController
{
    @FXML
    private TextField idTextField;
    @FXML
    private TextField titleTextField;
    @FXML
    private TableColumn titleTableColumn;
    @FXML
    private TableColumn idTableColumn;
    @FXML
    private TableColumn nameTableColumn;
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private ComboBox typeComboBox;
    @FXML
    private TextField nameTextField;
    @FXML
    private TableColumn typeTableColumn;
    @FXML
    private TableColumn dateTableColumn;
    private ObservableList<Training> trainings = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        typeComboBox.getItems().addAll("Workshop", "Seminar", "Course");
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        titleTableColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        ChoiceBox<Training> trainingTable = null;
        trainingTable.setItems(trainings);
    }

    @FXML
    private void addButtonOnClick() {
        try {
            Training newTraining = new Training(
                    nameTextField.getText(),
                    idTextField.getText(),
                    titleTextField.getText(),
                    dateDatePicker.getValue(),
                    (String) typeComboBox.getValue()  // Removed unnecessary cast
            );
            trainings.add(newTraining);
            clearFields();
        } catch (Exception e) {
            showAlert("Error", "Please fill all fields correctly");
        }
    }

    private void clearFields() {
        nameTextField.clear();
        idTextField.clear();
        titleTextField.clear();
        dateDatePicker.setValue(null);
        typeComboBox.getSelectionModel().clearSelection();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
        public static class Training {
        private final String name;
        private final String id;
        private final String title;
        private final LocalDate date;
        private final String type;

        public Training(String name, String id, String title, LocalDate date, String type) {
            this.name = name;
            this.id = id;
            this.title = title;
            this.date = date;
            this.type = type;
        }

        public String getName() { return name; }
        public String getId() { return id; }
        public String getTitle() { return title; }
        public LocalDate getDate() { return date; }
        public String getType() { return type; }
    }
}