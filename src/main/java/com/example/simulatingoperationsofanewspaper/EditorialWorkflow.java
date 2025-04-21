package com.example.simulatingoperationsofanewspaper;

import java.io.Serializable;
import java.time.LocalDateTime;

public class EditorialWorkflow implements Serializable {
    private String articleId;
    private String title;
    private String journalist;
    private String status;
    private LocalDateTime lastUpdated;
    private String assignedEditor;
    private String comments;

    public EditorialWorkflow(String articleId, String title, String journalist,
            String status, String assignedEditor) {
        this.articleId = articleId;
        this.title = title;
        this.journalist = journalist;
        this.status = status;
        this.assignedEditor = assignedEditor;
        this.lastUpdated = LocalDateTime.now();
        this.comments = "";
    }

    // Getters and Setters
    public String getArticleId() {
        return articleId;
    }

    public String getTitle() {
        return title;
    }

    public String getJournalist() {
        return journalist;
    }

    public void setJournalist(String journalist) {
        this.journalist = journalist;
        this.lastUpdated = LocalDateTime.now();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.lastUpdated = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public String getAssignedEditor() {
        return assignedEditor;
    }

    public void setAssignedEditor(String assignedEditor) {
        this.assignedEditor = assignedEditor;
        this.lastUpdated = LocalDateTime.now();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
        this.lastUpdated = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return title + " - " + status + " (" + journalist + ")";
    }
}