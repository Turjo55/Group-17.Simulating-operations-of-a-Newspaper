package Shorna;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PayrollAndEmployeeCompensationManagement
{
    @javafx.fxml.FXML
    private TableColumn colEmpId;
    @javafx.fxml.FXML
    private TableColumn colBonuses;
    @javafx.fxml.FXML
    private TableView employeeTable;
    @javafx.fxml.FXML
    private Label PayrollAndEmployeeCompensationManagementTextField;
    @javafx.fxml.FXML
    private TableColumn colEmpName;
    @javafx.fxml.FXML
    private TableColumn colBasic;
    @javafx.fxml.FXML
    private TableColumn colDeductions;

    @javafx.fxml.FXML
    public void initialize() {

        colEmpId.setCellValueFactory(new PropertyValueFactory<>("empId"));
        colEmpName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colBasic.setCellValueFactory(new PropertyValueFactory<>("basic"));
        colDeductions.setCellValueFactory(new PropertyValueFactory<>("deductions"));
        colBonuses.setCellValueFactory(new PropertyValueFactory<>("bonuses"));
         ObservableList<Employee> employees = FXCollections.observableArrayList();
         employees.addAll(
                new Employee("E001", "Alice", 5000.00, 200.00, 300.00),
                new Employee("E002", "Bob", 4500.00, 150.00, 400.00)
         );


         employeeTable.setItems(employees);
    }

    @javafx.fxml.FXML
    public void handleModifyPayroll(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSelectPayroll(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleApprovePayroll(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleHoldPayroll(ActionEvent actionEvent) {
    }

    public PayrollAndEmployeeCompensationManagement(TableColumn colEmpId, TableColumn colBonuses, TableView employeeTable, Label payrollAndEmployeeCompensationManagementTextField, TableColumn colEmpName, TableColumn colBasic, TableColumn colDeductions) {
        this.colEmpId = colEmpId;
        this.colBonuses = colBonuses;
        this.employeeTable = employeeTable;
        PayrollAndEmployeeCompensationManagementTextField = payrollAndEmployeeCompensationManagementTextField;
        this.colEmpName = colEmpName;
        this.colBasic = colBasic;
        this.colDeductions = colDeductions;
    }

    public TableColumn getColEmpId() {
        return colEmpId;
    }

    public void setColEmpId(TableColumn colEmpId) {
        this.colEmpId = colEmpId;
    }

    public TableColumn getColBonuses() {
        return colBonuses;
    }

    public void setColBonuses(TableColumn colBonuses) {
        this.colBonuses = colBonuses;
    }

    public TableView getEmployeeTable() {
        return employeeTable;
    }

    public void setEmployeeTable(TableView employeeTable) {
        this.employeeTable = employeeTable;
    }

    public Label getPayrollAndEmployeeCompensationManagementTextField() {
        return PayrollAndEmployeeCompensationManagementTextField;
    }

    public void setPayrollAndEmployeeCompensationManagementTextField(Label payrollAndEmployeeCompensationManagementTextField) {
        PayrollAndEmployeeCompensationManagementTextField = payrollAndEmployeeCompensationManagementTextField;
    }

    public TableColumn getColEmpName() {
        return colEmpName;
    }

    public void setColEmpName(TableColumn colEmpName) {
        this.colEmpName = colEmpName;
    }

    public TableColumn getColBasic() {
        return colBasic;
    }

    public void setColBasic(TableColumn colBasic) {
        this.colBasic = colBasic;
    }

    public TableColumn getColDeductions() {
        return colDeductions;
    }

    public void setColDeductions(TableColumn colDeductions) {
        this.colDeductions = colDeductions;
    }

    @Override
    public String toString() {
        return "PayrollAndEmployeeCompensationManagement{" +
                "colEmpId=" + colEmpId +
                ", colBonuses=" + colBonuses +
                ", employeeTable=" + employeeTable +
                ", PayrollAndEmployeeCompensationManagementTextField=" + PayrollAndEmployeeCompensationManagementTextField +
                ", colEmpName=" + colEmpName +
                ", colBasic=" + colBasic +
                ", colDeductions=" + colDeductions +
                '}';
    }
}