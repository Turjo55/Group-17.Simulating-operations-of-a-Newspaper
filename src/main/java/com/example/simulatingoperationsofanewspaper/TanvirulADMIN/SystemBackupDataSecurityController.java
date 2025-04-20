package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class SystemBackupDataSecurityController {
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private TextField backupTextField;
    @FXML
    private TableColumn<SystemBackup, String> palceTableColumn;
    @FXML
    private ComboBox<String> TypeComboBox;
    @FXML
    private TextField placeTextField;
    @FXML
    private TableColumn<SystemBackup, String> typeTableColumn;
    @FXML
    private TableColumn<SystemBackup, LocalDate> dateTableColumn;
    @FXML
    private TableColumn<SystemBackup, String> backupTableColumn;
    @FXML
    private TableView<SystemBackup> backupTableView;

    private final ObservableList<SystemBackup> backupList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Setup ComboBox options
        TypeComboBox.setItems(FXCollections.observableArrayList("Full", "Incremental", "Differential"));

        // Setup table columns
        palceTableColumn.setCellValueFactory(new PropertyValueFactory<>("place"));
        typeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        backupTableColumn.setCellValueFactory(new PropertyValueFactory<>("backup"));

        // Bind list to table
        backupTableView.setItems(backupList);
    }

    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        String place = placeTextField.getText();
        String type = TypeComboBox.getValue();
        LocalDate date = dateDatePicker.getValue();
        String backup = backupTextField.getText();

        if (place.isEmpty() || type == null || date == null || backup.isEmpty()) {
            System.out.println("Please fill in all fields.");
            return;
        }

        SystemBackup systemBackup = new SystemBackup(place, type, date, backup);
        backupList.add(systemBackup);

        // Clear input fields
        placeTextField.clear();
        TypeComboBox.getSelectionModel().clearSelection();
        dateDatePicker.setValue(null);
        backupTextField.clear();
    }
}
