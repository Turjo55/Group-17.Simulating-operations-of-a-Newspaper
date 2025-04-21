package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class WorkSchedulesController
{
    @javafx.fxml.FXML
    private TableView workHoursTableView;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn deadlineTableColumn;
    @javafx.fxml.FXML
    private TableColumn codeTableColumn;
    @javafx.fxml.FXML
    private DatePicker deadlineDatePicker;
    @javafx.fxml.FXML
    private TextField codeTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox shiftComboBox;
    @javafx.fxml.FXML
    private TableColumn shiftTableColumn;


    @FXML
    public void initialize() {
        shiftComboBox.getItems().addAll("Morning", "Afternoon", "Night");
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        deadlineTableColumn.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        shiftTableColumn.setCellValueFactory(new PropertyValueFactory<>("shift"));
    }

    @FXML
    private void handleAddSchedule(ActionEvent event) {
        String name = nameTextField.getText();
        String code = codeTextField.getText();
        LocalDate deadline = deadlineDatePicker.getValue();

        if (name.isEmpty() || code.isEmpty() || deadline == null) {
            showAlert("Error", "fill all fields!");
            return;
        }
    }
    private void clearFields() {
        nameTextField.clear();
        codeTextField.clear();
        deadlineDatePicker.setValue(null);
        shiftComboBox.setValue(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class WorkSchedule {
        private final String name;
        private final String code;
        private final LocalDate deadline;
        private final String shift;
        private final String scheduleDetails;

        public WorkSchedule(String name, String code, LocalDate deadline, String shift) {
            this.name = name;
            this.code = code;
            this.deadline = deadline;
            this.shift = shift;
            this.scheduleDetails = String.format( name, shift, deadline.toString());
        }

        public String getName() { return name; }
        public String getCode() { return code; }
        public LocalDate getDeadline() { return deadline; }
        public String getShift() { return shift; }
        public String getScheduleDetails() { return scheduleDetails; }
    }
}
