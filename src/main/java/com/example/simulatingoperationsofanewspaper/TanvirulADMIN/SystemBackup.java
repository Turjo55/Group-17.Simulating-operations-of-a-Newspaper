package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class SystemBackup {
    private String place;
    private String type;
    private LocalDate date;
    private String backup;

    public SystemBackup(String place, String type, LocalDate date, String backup) {
        this.place = place;
        this.type = type;
        this.date = date;
        this.backup = backup;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }

    @Override
    public String toString() {
        return "SystemBackup{" +
                "place='" + place + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", backup='" + backup + '\'' +
                '}';
    }
}

