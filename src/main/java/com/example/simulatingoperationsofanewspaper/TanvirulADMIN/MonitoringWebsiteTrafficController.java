package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class MonitoringWebsiteTrafficController
{
    @javafx.fxml.FXML
    private TableColumn pageViewTableColumn;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn visitorsTypeTableColumn;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TextField pageViewTextField;
    @javafx.fxml.FXML
    private TableColumn timeTableColumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private ComboBox visitorsComboBox;
    @javafx.fxml.FXML
    private TableView MonitoringWebsiteTrafficTableView;

    private ObservableList<TrafficData> trafficData = FXCollections.observableArrayList();
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("");

    @FXML
    public void initialize() {
        visitorsComboBox.getItems().addAll("Regular Visitor", "Subscriber", "Guest");
        pageViewTableColumn.setCellValueFactory(new PropertyValueFactory<>("pageViews"));
        visitorsTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("visitorType"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        MonitoringWebsiteTrafficTableView.setItems(trafficData);
        addSampleData();
    }

    @FXML
    public void addButtonOnClick(ActionEvent actionEvent) {
        try {
            int pageViews = Integer.parseInt(pageViewTextField.getText());
            String visitorType = (String) visitorsComboBox.getValue();
            String time = timeTextField.getText();
            String date = dateDatePicker.getValue().toString();
            TrafficData newData = new TrafficData(pageViews, visitorType, time, date);
            trafficData.add(newData);

        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    private void addSampleData() {
        trafficData.add(new TrafficData(75, "Subscriber", "14:15", LocalDate.now().toString()));
    }

    private void clearInputFields() {
        pageViewTextField.clear();
        visitorsComboBox.getSelectionModel().clearSelection();
        timeTextField.clear();
        dateDatePicker.setValue(null);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class TrafficData {
        private final int pageViews;
        private final String visitorType;
        private final String time;
        private final String date;

        public TrafficData(int pageViews, String visitorType, String time, String date) {
            this.pageViews = pageViews;
            this.visitorType = visitorType;
            this.time = time;
            this.date = date;
        }

        public int getPageViews() { return pageViews; }
        public String getVisitorType() { return visitorType; }
        public String getTime() { return time; }
        public String getDate() { return date; }
    }
}