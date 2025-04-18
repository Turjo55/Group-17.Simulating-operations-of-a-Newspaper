package Shorna;

import Shorna.java.AuditLog;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AuditingAndFraudDetection {

    @FXML
    private Label AuditingAndFraudDetectionLabel;

    @FXML
    private TableView<AuditLog> auditLogsTable;

    @FXML
    private TableColumn<AuditLog, String> colTransactionId;

    @FXML
    private TableColumn<AuditLog, String> colDate;

    @FXML
    private TableColumn<AuditLog, Double> colAmount;

    @FXML
    private TableColumn<AuditLog, String> colStatus;

    @FXML
    void handleFlagSuspicious(ActionEvent event) {
        // TODO: Implement logic to flag suspicious transactions
        System.out.println("Flag Suspicious Transactions clicked.");
    }

    @FXML
    void handleGenerateReport(ActionEvent event) {
        // TODO: Implement logic to generate compliance report
        System.out.println("Generate Compliance Report clicked.");
    }

    @FXML
    void handleInternalReview(ActionEvent event) {
        // TODO: Implement logic to show internal review options
        System.out.println("Internal Review Options clicked.");
    }

    @FXML
    void handleViewAuditLogs(ActionEvent event) {
        // Example: Load dummy data into the table
        ObservableList<AuditLog> logs = FXCollections.observableArrayList(
                new AuditLog("TXN001", "2025-04-01", 2500.0, "Completed"),
                new AuditLog("TXN002", "2025-04-02", 1250.5, "Flagged"),
                new AuditLog("TXN003", "2025-04-03", 500.75, "Completed")
        );

        // Set cell value factories
        colTransactionId.setCellValueFactory(new PropertyValueFactory<>("transactionId"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        auditLogsTable.setItems(logs);
    }

    public AuditingAndFraudDetection(Label auditingAndFraudDetectionLabel, TableView<AuditLog> auditLogsTable, TableColumn<AuditLog, String> colTransactionId, TableColumn<AuditLog, String> colDate, TableColumn<AuditLog, Double> colAmount, TableColumn<AuditLog, String> colStatus) {
        AuditingAndFraudDetectionLabel = auditingAndFraudDetectionLabel;
        this.auditLogsTable = auditLogsTable;
        this.colTransactionId = colTransactionId;
        this.colDate = colDate;
        this.colAmount = colAmount;
        this.colStatus = colStatus;
    }

    public Label getAuditingAndFraudDetectionLabel() {
        return AuditingAndFraudDetectionLabel;
    }

    public void setAuditingAndFraudDetectionLabel(Label auditingAndFraudDetectionLabel) {
        AuditingAndFraudDetectionLabel = auditingAndFraudDetectionLabel;
    }

    public TableView<AuditLog> getAuditLogsTable() {
        return auditLogsTable;
    }

    public void setAuditLogsTable(TableView<AuditLog> auditLogsTable) {
        this.auditLogsTable = auditLogsTable;
    }

    public TableColumn<AuditLog, String> getColTransactionId() {
        return colTransactionId;
    }

    public void setColTransactionId(TableColumn<AuditLog, String> colTransactionId) {
        this.colTransactionId = colTransactionId;
    }

    public TableColumn<AuditLog, String> getColDate() {
        return colDate;
    }

    public void setColDate(TableColumn<AuditLog, String> colDate) {
        this.colDate = colDate;
    }

    public TableColumn<AuditLog, Double> getColAmount() {
        return colAmount;
    }

    public void setColAmount(TableColumn<AuditLog, Double> colAmount) {
        this.colAmount = colAmount;
    }

    public TableColumn<AuditLog, String> getColStatus() {
        return colStatus;
    }

    public void setColStatus(TableColumn<AuditLog, String> colStatus) {
        this.colStatus = colStatus;
    }

    @Override
    public String toString() {
        return "AuditingAndFraudDetection{" +
                "AuditingAndFraudDetectionLabel=" + AuditingAndFraudDetectionLabel +
                ", auditLogsTable=" + auditLogsTable +
                ", colTransactionId=" + colTransactionId +
                ", colDate=" + colDate +
                ", colAmount=" + colAmount +
                ", colStatus=" + colStatus +
                '}';
    }
}
