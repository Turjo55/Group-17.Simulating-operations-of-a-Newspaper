package Shorna;

import Shorna.java.Budget;
import Shorna.java.Expense;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class BudgetingAndExpenseManagement {

    @FXML
    private Label BudgetingAndExpenseManagementLabel;

    @FXML
    private TableColumn<Budget, String> deptColumn;

    @FXML
    private TableColumn<Budget, Double> budgetColumn;

    @FXML
    private TableColumn<Expense, String> categoryColumn;

    @FXML
    private TableColumn<Expense, Double> amountColumn;

    @FXML
    private Text budgetPane;

    @FXML
    private Text expensePane;

    @FXML
    private Text summaryPane;

    @FXML
    private TableView<Budget> budgetTable;

    @FXML
    private TableView<Expense> expenseTable;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextArea summaryArea;

    private final ObservableList<Budget> budgetData = FXCollections.observableArrayList();
    private final ObservableList<Expense> expenseData = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Link table columns to model properties
        deptColumn.setCellValueFactory(data -> data.getValue().departmentProperty());
        budgetColumn.setCellValueFactory(data -> data.getValue().allocatedBudgetProperty().asObject());

        categoryColumn.setCellValueFactory(data -> data.getValue().categoryProperty());
        amountColumn.setCellValueFactory(data -> data.getValue().amountProperty().asObject());

        budgetTable.setItems(budgetData);
        expenseTable.setItems(expenseData);
    }

    @FXML
    void handleLogin(ActionEvent event) {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        if ("admin".equals(user) && "admin123".equals(pass)) {
            summaryArea.setText("Login successful. Accessing budget and expense data...");
        } else {
            summaryArea.setText("Invalid login credentials.");
        }
    }

    @FXML
    void handleBudgetManagement(ActionEvent event) {
        budgetData.clear();
        budgetData.addAll(
                new Budget("HR", 20000),
                new Budget("IT", 50000),
                new Budget("Marketing", 30000)
        );

        expenseData.clear();
        expenseData.addAll(
                new Expense("Software", 15000),
                new Expense("Salaries", 30000),
                new Expense("Ads", 8000)
        );

        summaryArea.setText("Budget and expense data loaded.");
    }

    @FXML
    void handleRequestFunds(ActionEvent event) {
        summaryArea.setText("Request for additional funds submitted for review.");
    }


    public BudgetingAndExpenseManagement(Label budgetingAndExpenseManagementLabel, TableColumn<Budget, String> deptColumn, TableColumn<Budget, Double> budgetColumn, TableColumn<Expense, String> categoryColumn, TableColumn<Expense, Double> amountColumn, Text budgetPane, Text expensePane, Text summaryPane, TableView<Budget> budgetTable, TableView<Expense> expenseTable, TextField usernameField, TextField passwordField, TextArea summaryArea) {
        BudgetingAndExpenseManagementLabel = budgetingAndExpenseManagementLabel;
        this.deptColumn = deptColumn;
        this.budgetColumn = budgetColumn;
        this.categoryColumn = categoryColumn;
        this.amountColumn = amountColumn;
        this.budgetPane = budgetPane;
        this.expensePane = expensePane;
        this.summaryPane = summaryPane;
        this.budgetTable = budgetTable;
        this.expenseTable = expenseTable;
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.summaryArea = summaryArea;
    }

    public Label getBudgetingAndExpenseManagementLabel() {
        return BudgetingAndExpenseManagementLabel;
    }

    public void setBudgetingAndExpenseManagementLabel(Label budgetingAndExpenseManagementLabel) {
        BudgetingAndExpenseManagementLabel = budgetingAndExpenseManagementLabel;
    }

    public TableColumn<Budget, String> getDeptColumn() {
        return deptColumn;
    }

    public void setDeptColumn(TableColumn<Budget, String> deptColumn) {
        this.deptColumn = deptColumn;
    }

    public TableColumn<Budget, Double> getBudgetColumn() {
        return budgetColumn;
    }

    public void setBudgetColumn(TableColumn<Budget, Double> budgetColumn) {
        this.budgetColumn = budgetColumn;
    }

    public TableColumn<Expense, String> getCategoryColumn() {
        return categoryColumn;
    }

    public void setCategoryColumn(TableColumn<Expense, String> categoryColumn) {
        this.categoryColumn = categoryColumn;
    }

    public TableColumn<Expense, Double> getAmountColumn() {
        return amountColumn;
    }

    public void setAmountColumn(TableColumn<Expense, Double> amountColumn) {
        this.amountColumn = amountColumn;
    }

    public Text getBudgetPane() {
        return budgetPane;
    }

    public void setBudgetPane(Text budgetPane) {
        this.budgetPane = budgetPane;
    }

    public Text getExpensePane() {
        return expensePane;
    }

    public void setExpensePane(Text expensePane) {
        this.expensePane = expensePane;
    }

    public Text getSummaryPane() {
        return summaryPane;
    }

    public void setSummaryPane(Text summaryPane) {
        this.summaryPane = summaryPane;
    }

    public TableView<Budget> getBudgetTable() {
        return budgetTable;
    }

    public void setBudgetTable(TableView<Budget> budgetTable) {
        this.budgetTable = budgetTable;
    }

    public TableView<Expense> getExpenseTable() {
        return expenseTable;
    }

    public void setExpenseTable(TableView<Expense> expenseTable) {
        this.expenseTable = expenseTable;
    }

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public TextArea getSummaryArea() {
        return summaryArea;
    }

    public void setSummaryArea(TextArea summaryArea) {
        this.summaryArea = summaryArea;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
    }

    public ObservableList<Budget> getBudgetData() {
        return budgetData;
    }

    public ObservableList<Expense> getExpenseData() {
        return expenseData;
    }

    @Override
    public String toString() {
        return "BudgetingAndExpenseManagement{" +
                "BudgetingAndExpenseManagementLabel=" + BudgetingAndExpenseManagementLabel +
                ", deptColumn=" + deptColumn +
                ", budgetColumn=" + budgetColumn +
                ", categoryColumn=" + categoryColumn +
                ", amountColumn=" + amountColumn +
                ", budgetPane=" + budgetPane +
                ", expensePane=" + expensePane +
                ", summaryPane=" + summaryPane +
                ", budgetTable=" + budgetTable +
                ", expenseTable=" + expenseTable +
                ", usernameField=" + usernameField +
                ", passwordField=" + passwordField +
                ", summaryArea=" + summaryArea +
                ", budgetData=" + budgetData +
                ", expenseData=" + expenseData +
                '}';
    }
}
