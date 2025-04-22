package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EditorialFeedback {
    private String id;
    private String articleId;
    private String editorId;
    private String comments;
    private String requiredChanges;
    private LocalDate deadline;
    private String status; // "Pending", "Acknowledged", "Clarification Requested", "Completed"
    private String priority; // "High", "Medium", "Low"
    private LocalDateTime feedbackDate;
    private LocalDateTime lastModifiedDate;
    private boolean isAcknowledged;
    private String clarificationRequest;

    public EditorialFeedback(String id, String articleId, String editorId, String comments,
            String requiredChanges, LocalDate deadline, String priority) {
        this.id = id;
        this.articleId = articleId;
        this.editorId = editorId;
        this.comments = comments;
        this.requiredChanges = requiredChanges;
        this.deadline = deadline;
        this.priority = priority;
        this.status = "Pending";
        this.feedbackDate = LocalDateTime.now();
        this.lastModifiedDate = LocalDateTime.now();
        this.isAcknowledged = false;
        this.clarificationRequest = "";
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

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public String getRequiredChanges() {
        return requiredChanges;
    }

    public void setRequiredChanges(String requiredChanges) {
        this.requiredChanges = requiredChanges;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public LocalDateTime getFeedbackDate() {
        return feedbackDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public boolean isAcknowledged() {
        return isAcknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
        isAcknowledged = acknowledged;
        this.lastModifiedDate = LocalDateTime.now();
    }

    public String getClarificationRequest() {
        return clarificationRequest;
    }

    public void setClarificationRequest(String clarificationRequest) {
        this.clarificationRequest = clarificationRequest;
        this.lastModifiedDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Feedback for Article ID: " + articleId + " - Status: " + status;
    }
}