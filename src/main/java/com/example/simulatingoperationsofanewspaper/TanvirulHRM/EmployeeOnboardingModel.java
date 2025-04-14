package com.example.simulatingoperationsofanewspaper.TanvirulHRM;

import javafx.beans.property.*;

public class EmployeeOnboardingModel {
    private final StringProperty type = new SimpleStringProperty();
    private final IntegerProperty employeeID = new SimpleIntegerProperty();
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty address = new SimpleStringProperty();
    private final StringProperty contactNumber = new SimpleStringProperty();
    private final StringProperty contract = new SimpleStringProperty();

    public EmployeeOnboardingModel() {
    }
    public EmployeeOnboardingModel(String type, int employeeID, String name, String address, String contactNumber, String contract) {
        setType(type);
        setEmployeeID(employeeID);
        setName(name);
        setAddress(address);
        setContactNumber(contactNumber);
        setContract(contract);
    }

    public StringProperty typeProperty() {
        return type;
    }

    public IntegerProperty employeeIDProperty() {
        return employeeID;
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty addressProperty() {
        return address;
    }

    public StringProperty contactNumberProperty() {
        return contactNumber;
    }

    public StringProperty contractProperty() {
        return contract;
    }

    public String getType() {
        return type.get();
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public int getEmployeeID() {
        return employeeID.get();
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID.set(employeeID);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(String address) {
        this.address.set(address);
    }

    public String getContactNumber() {
        return contactNumber.get();
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber.set(contactNumber);
    }

    public String getContract() {
        return contract.get();
    }

    public void setContract(String contract) {
        this.contract.set(contract);
    }

    @Override
    public String toString() {
        return "EmployeeOnboardingModel{" +
                "type=" + getType() +
                ", employeeID=" + getEmployeeID() +
                ", name=" + getName() +
                ", address=" + getAddress() +
                ", contactNumber=" + getContactNumber() +
                ", contract=" + getContract() +
                '}';
    }
}