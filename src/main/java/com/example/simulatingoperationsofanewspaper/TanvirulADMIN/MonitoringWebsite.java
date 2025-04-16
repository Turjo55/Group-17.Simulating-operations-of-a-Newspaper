package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import java.time.LocalDate;
import java.time.LocalTime;

public class MonitoringWebsite {
    private  int pageViews;
    private String visitorType;
    private LocalTime visitTime;
    private LocalDate visitDate;

    public MonitoringWebsite(int pageViews, String visitorType, LocalTime visitTime, LocalDate visitDate) {
        this.pageViews = pageViews;
        this.visitorType = visitorType;
        this.visitTime = visitTime;
        this.visitDate = visitDate;
    }

    public int getPageViews() {
        return pageViews;
    }

    public void setPageViews(int pageViews) {
        this.pageViews = pageViews;
    }

    public String getVisitorType() {
        return visitorType;
    }

    public void setVisitorType(String visitorType) {
        this.visitorType = visitorType;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "MonitoringWebsite{" +
                "pageViews=" + pageViews +
                ", visitorType='" + visitorType + '\'' +
                ", visitTime=" + visitTime +
                ", visitDate=" + visitDate +
                '}';
    }
}
