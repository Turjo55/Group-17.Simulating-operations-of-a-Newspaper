package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManagingUserAccountsController
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TableColumn idTableColumn;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableView ManagingUserAccountsTableView;
    @javafx.fxml.FXML
    private TextField statusTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn roleTableColumn;
    @javafx.fxml.FXML
    private TextField roleTextField;

    private ObservableList<UserAccount> userAccounts = FXCollections.observableArrayList();
    @FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        roleTableColumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        ManagingUserAccountsTableView.setItems(userAccounts);
    }
    @FXML
    private void addButtonOnClick(ActionEvent event) {
        try {
            if (nameTextField.getText().isEmpty() || idTextField.getText().isEmpty() ||
                    roleTextField.getText().isEmpty() || statusTextField.getText().isEmpty()) {
                showAlert("Error", "All fields must be filled");
                return;
            }
            UserAccount newAccount = new UserAccount(
                    nameTextField.getText(),
                    idTextField.getText(),
                    roleTextField.getText(),
                    statusTextField.getText()
            );

            userAccounts.add(newAccount);
            clearFields();

        } catch (Exception e) {
            showAlert("Error", "Error adding user: " + e.getMessage());
        }
    }
    private void clearFields() {
        nameTextField.clear();
        idTextField.clear();
        roleTextField.clear();
        statusTextField.clear();
    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static class UserAccount {
        private final String name;
        private final String id;
        private final String role;
        private final String status;
        public UserAccount(String name, String id, String role, String status) {
            this.name = name;
            this.id = id;
            this.role = role;
            this.status = status;
        }
        public String getName() { return name; }
        public String getId() { return id; }
        public String getRole() { return role; }
        public String getStatus() { return status; }
    }
}