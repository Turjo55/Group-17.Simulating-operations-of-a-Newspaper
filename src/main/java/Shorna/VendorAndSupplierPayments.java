package Shorna;

import Shorna.java.Invoice;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class VendorAndSupplierPayments {

    @FXML
    private Label VendorAndSupplierPaymentsLabel;

    @FXML
    private TableColumn<Invoice, Double> colAmount;

    @FXML
    private TableColumn<Invoice, String> colInvoiceNo;

    @FXML
    private TableColumn<Invoice, String> colStatus;

    @FXML
    private TableColumn<Invoice, String> colVendor;

    @FXML
    private TableView<Invoice> invoiceTable;

    private final ObservableList<Invoice> invoiceList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colVendor.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getVendor()));
        colInvoiceNo.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getInvoiceNo()));
        colAmount.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getAmount()));
        colStatus.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getStatus()));

        invoiceTable.setItems(invoiceList);
    }

    @FXML
    void handleLoadInvoices(ActionEvent event) {
        invoiceList.clear();
        invoiceList.addAll(
                new Invoice("Vendor A", "INV001", 1200.00, "Pending"),
                new Invoice("Vendor B", "INV002", 850.00, "Pending"),
                new Invoice("Vendor C", "INV003", 430.00, "Pending")
        );
    }

    @FXML
    void handleApprove(ActionEvent event) {
        Invoice selected = invoiceTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Approved");
            invoiceTable.refresh();
        }
    }

    @FXML
    void handleModify(ActionEvent event) {
        Invoice selected = invoiceTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setAmount(selected.getAmount() + 100); // Example logic
            invoiceTable.refresh();
        }
    }

    @FXML
    void handleReject(ActionEvent event) {
        Invoice selected = invoiceTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Rejected");
            invoiceTable.refresh();
        }
    }

    @FXML
    void handleGenerateReport(ActionEvent event) {
        System.out.println("Generating report...");
        for (Invoice invoice : invoiceList) {
            System.out.println(invoice.getVendor() + " | " + invoice.getInvoiceNo() + " | " + invoice.getAmount() + " | " + invoice.getStatus());
        }
    }
}
