package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDateTime;

public class ArticleRevision {
    private String id;
    private String articleId;
    private String journalistId;
    private String originalContent;
    private String revisedContent;
    private String changesMade;
    private String revisionNotes;
    private LocalDateTime revisionDate;
    private String status; // "Draft", "Submitted", "Approved", "Rejected"
    private String feedbackId;
    private int versionNumber;

    public ArticleRevision(String id, String articleId, String journalistId, String originalContent,
            String feedbackId) {
        this.id = id;
        this.articleId = articleId;
        this.journalistId = journalistId;
        this.originalContent = originalContent;
        this.revisedContent = originalContent;
        this.changesMade = "";
        this.revisionNotes = "";
        this.revisionDate = LocalDateTime.now();
        this.status = "Draft";
        this.feedbackId = feedbackId;
        this.versionNumber = 1;
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

    public String getJournalistId() {
        return journalistId;
    }

    public void setJournalistId(String journalistId) {
        this.journalistId = journalistId;
    }

    public String getOriginalContent() {
        return originalContent;
    }

    public void setOriginalContent(String originalContent) {
        this.originalContent = originalContent;
    }

    public String getRevisedContent() {
        return revisedContent;
    }

    public void setRevisedContent(String revisedContent) {
        this.revisedContent = revisedContent;
    }

    public String getChangesMade() {
        return changesMade;
    }

    public void setChangesMade(String changesMade) {
        this.changesMade = changesMade;
    }

    public String getRevisionNotes() {
        return revisionNotes;
    }

    public void setRevisionNotes(String revisionNotes) {
        this.revisionNotes = revisionNotes;
    }

    public LocalDateTime getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(LocalDateTime revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    @Override
    public String toString() {
        return "Revision " + versionNumber + " for Article ID: " + articleId + " - Status: " + status;
    }
}