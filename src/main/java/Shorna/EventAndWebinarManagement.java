package Shorna;

import Shorna.java.EventData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class EventAndWebinarManagement implements Initializable {

    @FXML
    private Label EventWebinarManagementLabel;

    @FXML
    private TableColumn<EventData, String> eventNameColumn;

    @FXML
    private TableColumn<EventData, Integer> registrationsColumn;

    @FXML
    private TableColumn<EventData, Double> attendanceColumn;

    @FXML
    private TableView<EventData> eventTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("eventName"));
        registrationsColumn.setCellValueFactory(new PropertyValueFactory<>("registrations"));
        attendanceColumn.setCellValueFactory(new PropertyValueFactory<>("attendancePercentage"));

        // Sample data
        eventTable.getItems().addAll(
                new EventData("Webinar on Finance", 150, 87.5),
                new EventData("Marketing Summit", 200, 91.2)
        );
    }

    @FXML
    void handleCreateEvent(ActionEvent event) {
        System.out.println("Create Event button clicked");
    }

    @FXML
    void handlePromoteEvent(ActionEvent event) {
        System.out.println("Promote Event button clicked");
    }

    @FXML
    void handleScheduleEvent(ActionEvent event) {
        System.out.println("Schedule Event button clicked");
    }

    @FXML
    void handleSendFollowUp(ActionEvent event) {
        System.out.println("Send Follow-up Email button clicked");
    }

    @FXML
    void handleSendSurvey(ActionEvent event) {
        System.out.println("Send Post-Event Survey button clicked");
    }

    public EventAndWebinarManagement(Label eventWebinarManagementLabel, TableColumn<EventData, String> eventNameColumn, TableColumn<EventData, Integer> registrationsColumn, TableColumn<EventData, Double> attendanceColumn, TableView<EventData> eventTable) {
        EventWebinarManagementLabel = eventWebinarManagementLabel;
        this.eventNameColumn = eventNameColumn;
        this.registrationsColumn = registrationsColumn;
        this.attendanceColumn = attendanceColumn;
        this.eventTable = eventTable;
    }

    public Label getEventWebinarManagementLabel() {
        return EventWebinarManagementLabel;
    }

    public void setEventWebinarManagementLabel(Label eventWebinarManagementLabel) {
        EventWebinarManagementLabel = eventWebinarManagementLabel;
    }

    public TableColumn<EventData, String> getEventNameColumn() {
        return eventNameColumn;
    }

    public void setEventNameColumn(TableColumn<EventData, String> eventNameColumn) {
        this.eventNameColumn = eventNameColumn;
    }

    public TableColumn<EventData, Integer> getRegistrationsColumn() {
        return registrationsColumn;
    }

    public void setRegistrationsColumn(TableColumn<EventData, Integer> registrationsColumn) {
        this.registrationsColumn = registrationsColumn;
    }

    public TableColumn<EventData, Double> getAttendanceColumn() {
        return attendanceColumn;
    }

    public void setAttendanceColumn(TableColumn<EventData, Double> attendanceColumn) {
        this.attendanceColumn = attendanceColumn;
    }

    public TableView<EventData> getEventTable() {
        return eventTable;
    }

    public void setEventTable(TableView<EventData> eventTable) {
        this.eventTable = eventTable;
    }

    @Override
    public String toString() {
        return "EventAndWebinarManagement{" +
                "EventWebinarManagementLabel=" + EventWebinarManagementLabel +
                ", eventNameColumn=" + eventNameColumn +
                ", registrationsColumn=" + registrationsColumn +
                ", attendanceColumn=" + attendanceColumn +
                ", eventTable=" + eventTable +
                '}';
    }
}
