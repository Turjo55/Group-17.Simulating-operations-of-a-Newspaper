package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ManagingAdvertisementsController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn topicTableColumn;
    @javafx.fxml.FXML
    private TableView ManagingAdvertisementsTableView;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TextField topicTextField;

    private final ObservableList<Advertisements> advertisements = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        topicTableColumn.setCellValueFactory(new PropertyValueFactory<>("topic"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        ManagingAdvertisementsTableView.setItems(advertisements);
    }

    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String topic = topicTextField.getText();
        LocalDate date = dateDatePicker.getValue();

        if (name.isEmpty() || topic.isEmpty() || date == null) {
            System.out.println("fill in all fields.");
            return;
        }
        nameTextField.clear();
        topicTextField.clear();
        dateDatePicker.setValue(null);
    }
}