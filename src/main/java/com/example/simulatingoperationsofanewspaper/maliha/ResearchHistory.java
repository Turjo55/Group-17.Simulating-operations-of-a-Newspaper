package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ResearchHistory {
    private String id;
    private String articleId;
    private LocalDateTime startDate;
    private LocalDateTime lastModified;
    private List<String> sourceIds;
    private List<String> factCheckIds;
    private String notes;
    private String status; // "In Progress", "Completed", "Archived"

    public ResearchHistory(String id, String articleId) {
        this.id = id;
        this.articleId = articleId;
        this.startDate = LocalDateTime.now();
        this.lastModified = LocalDateTime.now();
        this.sourceIds = new ArrayList<>();
        this.factCheckIds = new ArrayList<>();
        this.notes = "";
        this.status = "In Progress";
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public List<String> getSourceIds() {
        return sourceIds;
    }

    public void setSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
    }

    public List<String> getFactCheckIds() {
        return factCheckIds;
    }

    public void setFactCheckIds(List<String> factCheckIds) {
        this.factCheckIds = factCheckIds;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addSource(String sourceId) {
        if (!sourceIds.contains(sourceId)) {
            sourceIds.add(sourceId);
            lastModified = LocalDateTime.now();
        }
    }

    public void addFactCheck(String factCheckId) {
        if (!factCheckIds.contains(factCheckId)) {
            factCheckIds.add(factCheckId);
            lastModified = LocalDateTime.now();
        }
    }

    @Override
    public String toString() {
        return "Research for Article: " + articleId + " - " + status;
    }
}