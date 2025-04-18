package Shorna.java;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Budget {

    private final StringProperty department;
        private final DoubleProperty allocatedBudget;

        public Budget(String department, double allocatedBudget) {
            this.department = new SimpleStringProperty(department);
            this.allocatedBudget = new SimpleDoubleProperty(allocatedBudget);
        }

        public StringProperty departmentProperty() {
            return department;
        }

        public DoubleProperty allocatedBudgetProperty() {
            return allocatedBudget;
        }

        public String getDepartment() {
            return department.get();
        }

        public double getAllocatedBudget() {
            return allocatedBudget.get();
        }

        public void setDepartment(String department) {
            this.department.set(department);
        }

    @Override
    public String toString() {
        return "Budget{" +
                "department=" + department +
                ", allocatedBudget=" + allocatedBudget +
                '}';
    }

    public void setAllocatedBudget(double allocatedBudget) {
            this.allocatedBudget.set(allocatedBudget);
        }

    public Budget(StringProperty department, DoubleProperty allocatedBudget) {
        this.department = department;
        this.allocatedBudget = allocatedBudget;
    }

}


