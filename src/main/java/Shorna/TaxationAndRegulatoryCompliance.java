package Shorna;

import Shorna.java.TaxData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class TaxationAndRegulatoryCompliance {

    @FXML
    private Label TaxationAndRegulatoryComplianceLabel;

    @FXML
    private Text corporateTaxLabel;

    @FXML
    private Text deadlineNotificationLabel;

    @FXML
    private Text payrollTaxLabel;

    @FXML
    private Text vatLabel;

    private TaxData taxData;

    @FXML
    public void initialize() {
        taxData = new TaxData(0.0, 0.0, 0.0, "N/A");
        updateLabels();
    }

    @FXML
    void handleModuleSelection(ActionEvent event) {
        // Simulated data loading
        taxData = new TaxData(15000.0, 8000.0, 5000.0, "April 30, 2025");
        updateLabels();
    }

    @FXML
    void handleCalculateTaxes(ActionEvent event) {
        // Simulate calculation logic
        taxData.setCorporateTax(taxData.getCorporateTax() * 1.05);
        taxData.setPayrollTax(taxData.getPayrollTax() * 1.03);
        taxData.setVat(taxData.getVat() * 1.02);
        updateLabels();
    }

    @FXML
    void handleFileTaxes(ActionEvent event) {
        System.out.println("Taxes filed successfully.");
    }

    @FXML
    void handleGenerateReport(ActionEvent event) {
        System.out.println("Generated tax report:");
        System.out.println(taxData);
    }

    private void updateLabels() {
        corporateTaxLabel.setText("Corporate Tax: $" + taxData.getCorporateTax());
        payrollTaxLabel.setText("Payroll Tax: $" + taxData.getPayrollTax());
        vatLabel.setText("VAT: $" + taxData.getVat());
        deadlineNotificationLabel.setText("Upcoming Tax Deadline: " + taxData.getTaxDeadline());
    }

    public TaxationAndRegulatoryCompliance(Label taxationAndRegulatoryComplianceLabel, Text corporateTaxLabel, Text deadlineNotificationLabel, Text payrollTaxLabel, Text vatLabel, TaxData taxData) {
        TaxationAndRegulatoryComplianceLabel = taxationAndRegulatoryComplianceLabel;
        this.corporateTaxLabel = corporateTaxLabel;
        this.deadlineNotificationLabel = deadlineNotificationLabel;
        this.payrollTaxLabel = payrollTaxLabel;
        this.vatLabel = vatLabel;
        this.taxData = taxData;
    }

    public Label getTaxationAndRegulatoryComplianceLabel() {
        return TaxationAndRegulatoryComplianceLabel;
    }

    public void setTaxationAndRegulatoryComplianceLabel(Label taxationAndRegulatoryComplianceLabel) {
        TaxationAndRegulatoryComplianceLabel = taxationAndRegulatoryComplianceLabel;
    }

    public Text getCorporateTaxLabel() {
        return corporateTaxLabel;
    }

    public void setCorporateTaxLabel(Text corporateTaxLabel) {
        this.corporateTaxLabel = corporateTaxLabel;
    }

    public Text getDeadlineNotificationLabel() {
        return deadlineNotificationLabel;
    }

    public void setDeadlineNotificationLabel(Text deadlineNotificationLabel) {
        this.deadlineNotificationLabel = deadlineNotificationLabel;
    }

    public Text getPayrollTaxLabel() {
        return payrollTaxLabel;
    }

    public void setPayrollTaxLabel(Text payrollTaxLabel) {
        this.payrollTaxLabel = payrollTaxLabel;
    }

    public Text getVatLabel() {
        return vatLabel;
    }

    public void setVatLabel(Text vatLabel) {
        this.vatLabel = vatLabel;
    }

    public TaxData getTaxData() {
        return taxData;
    }

    public void setTaxData(TaxData taxData) {
        this.taxData = taxData;
    }

    @Override
    public String toString() {
        return "TaxationAndRegulatoryCompliance{" +
                "TaxationAndRegulatoryComplianceLabel=" + TaxationAndRegulatoryComplianceLabel +
                ", corporateTaxLabel=" + corporateTaxLabel +
                ", deadlineNotificationLabel=" + deadlineNotificationLabel +
                ", payrollTaxLabel=" + payrollTaxLabel +
                ", vatLabel=" + vatLabel +
                ", taxData=" + taxData +
                '}';
    }
}
