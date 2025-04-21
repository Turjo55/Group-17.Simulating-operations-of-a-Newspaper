package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import com.example.simulatingoperationsofanewspaper.TanvirulADMIN.UserComplaints;
import com.example.simulatingoperationsofanewspaper.TanvirulHRM.Complaints;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class HandlingUserComplaintsController {
    @FXML
    private TableColumn<String, Complaints> statusTableColumn;
    @FXML
    private TableColumn<String, Complaints> nameTableColumn;
    @FXML
    private TextField notesTextField;
    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private TableColumn<String, Complaints> notesTableColumn;
    @FXML
    private TextField statusTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TableColumn<String, Complaints> typeTableColumn;
    @FXML
    private TextField complaintsTextField;
    @FXML
    private TableColumn<String, Complaints> complaintsTableColumn;
    @FXML
    private TableView<Complaints> userComplaintsTableView;

    private final ObservableList<Complaints> complaintsList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        typeComboBox.setItems(FXCollections.observableArrayList("Harassment", "Overwork", "Other"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("complaintType"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        notesTableColumn.setCellValueFactory(new PropertyValueFactory<>("notes"));
        complaintsTableColumn.setCellValueFactory(new PropertyValueFactory<>("complaintDetails"));
        userComplaintsTableView.setItems(complaintsList);
    }

    @FXML
    public void buttonOnClick(ActionEvent event) {
        String name = nameTextField.getText();
        String type = typeComboBox.getValue() != null ? typeComboBox.getValue().toString() : "";
        String status = statusTextField.getText();
        String notes = notesTextField.getText();
        String complaintDetails = complaintsTextField.getText();

        if (name.isEmpty() || type.isEmpty() || status.isEmpty() || notes.isEmpty() || complaintDetails.isEmpty()) {
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