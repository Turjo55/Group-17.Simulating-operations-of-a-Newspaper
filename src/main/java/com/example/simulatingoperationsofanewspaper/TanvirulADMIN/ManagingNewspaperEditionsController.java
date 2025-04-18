package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ManagingNewspaperEditionsController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private TableView ManagingNewspaperEditionsTableView;
    @javafx.fxml.FXML
    private TableColumn titleTableColumn;
    @javafx.fxml.FXML
    private ImageView pictureImageView;
    @javafx.fxml.FXML
    private TextField articleTextField;
    @javafx.fxml.FXML
    private TableColumn articleTableColumn;
    @javafx.fxml.FXML
    private TableColumn yearTableColumn;
    @javafx.fxml.FXML
    private DatePicker yearDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
    }
}