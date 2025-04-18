package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.beans.property.StringProperty;

public class SystemBackup {
    private final StringProperty backup;
    private final StringProperty type;
    private final StringProperty date;
    private final StringProperty place;

    public SystemBackup(StringProperty backup, StringProperty type, StringProperty date, StringProperty place) {
        this.backup = backup;
        this.type = type;
        this.date = date;
        this.place = place;
    }

    public String getBackup() {
        return backup.get();
    }

    public StringProperty backupProperty() {
        return backup;
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public String getDate() {
        return date.get();
    }

    public StringProperty dateProperty() {
        return date;
    }

    public String getPlace() {
        return place.get();
    }

    public StringProperty placeProperty() {
        return place;
    }

    @Override
    public String toString() {
        return "SystemBackup{" +
                "backup=" + backup +
                ", type=" + type +
                ", date=" + date +
                ", place=" + place +
                '}';
    }
}
