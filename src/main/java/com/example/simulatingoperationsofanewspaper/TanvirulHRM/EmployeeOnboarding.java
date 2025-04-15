package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeOnboarding {
    @FXML private TableView<EmployeeOnboardingModel> addNewEmployeeTableView;
    @FXML private ComboBox<String> typeComboBox;
    @FXML private TextField employeeIDTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField addressTextField;
    @FXML private TextField contactNumberTextField;
    @FXML private TextField contractTextField;

    @FXML private TableColumn<EmployeeOnboardingModel, String> typeTableColumn;
    @FXML private TableColumn<EmployeeOnboardingModel, Integer> employeeIDTableColumn;
    @FXML private TableColumn<EmployeeOnboardingModel, String> nameTableColumn;
    @FXML private TableColumn<EmployeeOnboardingModel, String> addressTableColumn;
    @FXML private TableColumn<EmployeeOnboardingModel, String> contactNumberTableColumn;
    @FXML private TableColumn<EmployeeOnboardingModel, String> contractTableColumn;

    private ObservableList<EmployeeOnboardingModel> employeeList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Set up ComboBox options
        typeComboBox.setItems(FXCollections.observableArrayList(
                "Full-Time", "Part-Time", "Intern", "Contractor"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        employeeIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        addressTableColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        contractTableColumn.setCellValueFactory(new PropertyValueFactory<>("contract"));

        addNewEmployeeTableView.setItems(employeeList);
    }
    @FXML
    private void addNewEmployeeButtonOnClick() {
        try {
            EmployeeOnboardingModel newEmployee = new EmployeeOnboardingModel(
                    typeComboBox.getValue(),
                    Integer.parseInt(employeeIDTextField.getText()),
                    nameTextField.getText(),
                    addressTextField.getText(),
                    contactNumberTextField.getText(),
                    contractTextField.getText()
            );

            employeeList.add(newEmployee);
            clearInputFields();

        } catch (NumberFormatException e) {
            showAlert("Input Error", "Employee ID must be a number");
        } catch (Exception e) {
            showAlert("Error", "Please fill all fields: " + e.getMessage());
        }
    }

    private void clearInputFields() {
        typeComboBox.getSelectionModel().clearSelection();
        employeeIDTextField.clear();
        nameTextField.clear();
        addressTextField.clear();
        contactNumberTextField.clear();
        contractTextField.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}