package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmployeeComplaintsController {

    @FXML
    private TableColumn<Complaints, String> statusTableColumn;
    @FXML
    private TableView<Complaints> employeeComplaintsTableView;
    @FXML
    private TableColumn<Complaints, String> nameTableColumn;
    @FXML
    private TextField notesTextField;
    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private TableColumn<Complaints, String> notesTableColumn;
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TableColumn<Complaints, String> typeTableColumn;
    @FXML
    private TextField complaintsTextField;
    @FXML
    private TableColumn<Complaints, String> complaintsTableColumn;

    private final ObservableList<Complaints> complaintsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        typeComboBox.setItems(FXCollections.observableArrayList("Harassment", "Overwork", "Other"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("complaintType"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        notesTableColumn.setCellValueFactory(new PropertyValueFactory<>("notes"));
        complaintsTableColumn.setCellValueFactory(new PropertyValueFactory<>("complaintDetails"));
        employeeComplaintsTableView.setItems(complaintsList);
    }

    @FXML
    public void buttonOnClick(ActionEvent event) {
        String name = nameTextField.getText();
        String type = typeComboBox.getValue();
        String status = statusTextField.getText();
        String notes = notesTextField.getText();
        String complaintDetails = complaintsTextField.getText();

        if (name.isEmpty() || type == null || status.isEmpty() || notes.isEmpty() || complaintDetails.isEmpty()) {
            System.out.println("All fields must be filled.");
            return;
        }

        Complaints newComplaint = new Complaints(name, type, status, notes, complaintDetails);
        complaintsList.add(newComplaint);
        nameTextField.clear();
        typeComboBox.setValue(null);
        statusTextField.clear();
        notesTextField.clear();
        complaintsTextField.clear();

        System.out.println("Complaint submitted successfully.");
    }
}
