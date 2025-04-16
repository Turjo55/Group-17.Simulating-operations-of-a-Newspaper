package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import java.time.LocalDate;

public class GeneratingSystem {
    private String reportId;
    private String reportType;
    private String reportTitle;
    private LocalDate generationDate;

    public GeneratingSystem(String reportId, String reportType, String reportTitle, LocalDate generationDate) {
        this.reportId = reportId;
        this.reportType = reportType;
        this.reportTitle = reportTitle;
        this.generationDate = generationDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public LocalDate getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(LocalDate generationDate) {
        this.generationDate = generationDate;
    }

    @Override
    public String toString() {
        return "GeneratingSystem{" +
                "reportId='" + reportId + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportTitle='" + reportTitle + '\'' +
                ", generationDate=" + generationDate +
                '}';
    }
}
