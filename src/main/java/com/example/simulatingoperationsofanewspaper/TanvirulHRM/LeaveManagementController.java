package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class LeaveManagementController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private ComboBox selectDaysComboBox;
    @javafx.fxml.FXML
    private TableColumn daysTableCol;
    @javafx.fxml.FXML
    private TableColumn deptTablecolumn;
    @javafx.fxml.FXML
    private TableView leaveApplicationTableView;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn idTableCol;
    @javafx.fxml.FXML
    private ComboBox selectDeptComboBox;
    @javafx.fxml.FXML
    private TableColumn nameTablecolumn;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;
    @javafx.fxml.FXML
    private TableColumn reasonTablecolumn;
    @javafx.fxml.FXML
    private TableColumn statusTablecolumn;

    private ObservableList<LeaveApplication> leaveApplications = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        selectDaysComboBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9","10");
        selectDeptComboBox.getItems().addAll("HR", "Finance", "Editorial", "Marketing", "IT", "Administration");
        nameTablecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTableCol.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
        daysTableCol.setCellValueFactory(new PropertyValueFactory<>("days"));
        deptTablecolumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        reasonTablecolumn.setCellValueFactory(new PropertyValueFactory<>("reason"));
        statusTablecolumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        leaveApplicationTableView.setItems(leaveApplications);

    }

    @FXML
    public void applyForLeaveButtonONClickk(ActionEvent actionEvent) {
        try {
            String name = nameTextField.getText();
            String employeeId = idTextField.getText();
            int days = Integer.parseInt((String) selectDaysComboBox.getValue());
            String department = (String) selectDeptComboBox.getValue();
            String reason = reasonTextArea.getText();

            if (name.isEmpty() || employeeId.isEmpty() || reason.isEmpty() ||
                    selectDaysComboBox.getValue() == null || selectDeptComboBox.getValue() == null) {
                showAlert("Error", "Please fill all fields!");
                return;
            }

            LeaveApplication newApplication = new LeaveApplication(
                    name, employeeId, days, department, reason, "Pending");

            leaveApplications.add(newApplication);
            clearFields();

        } catch (NumberFormatException e) {
            showAlert("Error", "Please select valid number of days");
        } catch (Exception e) {
            showAlert("Error", "An error occurred:");
        }
    }

    private void clearFields() {
        nameTextField.clear();
        idTextField.clear();
        selectDaysComboBox.getSelectionModel().clearSelection();
        selectDeptComboBox.getSelectionModel().clearSelection();
        reasonTextArea.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class LeaveApplication {
        private final String name;
        private final String employeeId;
        private final int days;
        private final String department;
        private final String reason;

        public LeaveApplication(String name, String employeeId, int days,
                                String department, String reason, String status) {
            this.name = name;
            this.employeeId = employeeId;
            this.days = days;
            this.department = department;
            this.reason = reason;
        }

        public String getName() { return name; }
        public String getEmployeeId() { return employeeId; }
        public int getDays() { return days; }
        public String getDepartment() { return department; }
        public String getReason() { return reason; }
    }
}