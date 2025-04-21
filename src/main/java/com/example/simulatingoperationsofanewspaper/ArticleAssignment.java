package com.example.simulatingoperationsofanewspaper;

import java.io.Serializable;
import java.time.LocalDate;

public class ArticleAssignment implements Serializable {
    private String topic;
    private String description;
    private LocalDate deadline;
    private String priority;
    private String assignedJournalist;
    private String status;
    private String assignedBy;

    public ArticleAssignment(String topic, String description, LocalDate deadline,
            String priority, String assignedJournalist,
            String status, String assignedBy) {
        this.topic = topic;
        this.description = description;
        this.deadline = deadline;
        this.priority = priority;
        this.assignedJournalist = assignedJournalist;
        this.status = status;
        this.assignedBy = assignedBy;
    }

    // Getters and Setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getAssignedJournalist() {
        return assignedJournalist;
    }

    public void setAssignedJournalist(String assignedJournalist) {
        this.assignedJournalist = assignedJournalist;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAssignedBy() {
        return assignedBy;
    }

    public void setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
    }

    @Override
    public String toString() {
        return topic + " - " + status + " (" + priority + ")";
    }
}