package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ButtonOnClick(ActionEvent actionEvent) {
    }
}