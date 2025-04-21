package com.example.simulatingoperationsofanewspaper;

import java.time.LocalDateTime;

public class FactCheck {
    private String id;
    private String fact;
    private String status; // "Pending", "Verified", "False", "Unverifiable"
    private String verificationNotes;
    private LocalDateTime verificationDate;
    private String verifiedBy;
    private String sourceId;

    public FactCheck(String id, String fact, String sourceId) {
        this.id = id;
        this.fact = fact;
        this.sourceId = sourceId;
        this.status = "Pending";
        this.verificationNotes = "";
        this.verificationDate = null;
        this.verifiedBy = "";
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVerificationNotes() {
        return verificationNotes;
    }

    public void setVerificationNotes(String verificationNotes) {
        this.verificationNotes = verificationNotes;
    }

    public LocalDateTime getVerificationDate() {
        return verificationDate;
    }

    public void setVerificationDate(LocalDateTime verificationDate) {
        this.verificationDate = verificationDate;
    }

    public String getVerifiedBy() {
        return verifiedBy;
    }

    public void setVerifiedBy(String verifiedBy) {
        this.verifiedBy = verifiedBy;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @Override
    public String toString() {
        return fact + " - " + status;
    }
}