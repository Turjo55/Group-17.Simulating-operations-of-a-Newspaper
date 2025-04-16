package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PayrollSalariesController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn codeTableColumn;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private Label dateLabel;
    @javafx.fxml.FXML
    private Label salaryLabel;
    @javafx.fxml.FXML
    private TextField codeTextField;
    @javafx.fxml.FXML
    private Label codeLabel;
    @javafx.fxml.FXML
    private TableColumn salaryTableColumn;
    @javafx.fxml.FXML
    private TableView paySalaryTableView;
    @javafx.fxml.FXML
    private Label nameLabel;

    private final ObservableList<Salaries> salaryList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        salaryTableColumn.setCellValueFactory(new PropertyValueFactory<>("basicSalary"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("paymentDate"));

        paySalaryTableView.setItems(salaryList);
    }

    @FXML
    public void paySalaryButton(ActionEvent actionEvent) {
        String codeText = codeTextField.getText();
        String name = nameTextField.getText();
        String salaryText = salaryTextField.getText();
        LocalDate date = dateDatePicker.getValue();

        if (codeText.isEmpty() || name.isEmpty() || salaryText.isEmpty() || date == null) {
            System.out.println("All fields must be filled out.");
            return;
        }

        try {
            int employeeID = Integer.parseInt(codeText);
            double basicSalary = Double.parseDouble(salaryText);

            Salaries newSalary = new Salaries(employeeID, name, basicSalary, 0, 0, date);

            salaryList.add(newSalary);

            codeTextField.clear();
            nameTextField.clear();
            salaryTextField.clear();
            dateDatePicker.setValue(null);

            System.out.println("Salary payment successfully added.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid code or salary amount. Please enter valid numbers.");
        }
    }
}