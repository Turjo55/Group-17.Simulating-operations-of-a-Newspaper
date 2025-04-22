package com.example.simulatingoperationsofanewspaper.maliha;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Article implements Serializable {
    private String title;
    private String content;
    private String author;
    private LocalDateTime submissionDate;
    private String status; // Draft, Submitted, Under Review, Approved, Rejected
    private List<String> images; // List of image paths
    private String category;
    private String editorComments;
    private String feedback;
    private String priority;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.submissionDate = LocalDateTime.now();
        this.status = "Draft";
        this.images = new ArrayList<>();
        this.category = "";
        this.editorComments = "";
        this.feedback = "";
        this.priority = "Medium";
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(LocalDateTime submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getImages() {
        return images;
    }

    public void addImage(String imagePath) {
        this.images.add(imagePath);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEditorComments() {
        return editorComments;
    }

    public void setEditorComments(String editorComments) {
        this.editorComments = editorComments;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", submissionDate=" + submissionDate +
                ", status='" + status + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}