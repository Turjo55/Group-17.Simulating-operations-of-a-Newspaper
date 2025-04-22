package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDateTime;

public class ResearchSource {
    private String id;
    private String title;
    private String url;
    private String type; // e.g., "Website", "Book", "Interview", "Document"
    private String author;
    private LocalDateTime publicationDate;
    private String content;
    private boolean verified;
    private String verificationNotes;

    public ResearchSource(String id, String title, String url, String type, String author, 
                         LocalDateTime publicationDate, String content) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.type = type;
        this.author = author;
        this.publicationDate = publicationDate;
        this.content = content;
        this.verified = false;
        this.verificationNotes = "";
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public LocalDateTime getPublicationDate() { return publicationDate; }
    public void setPublicationDate(LocalDateTime publicationDate) { this.publicationDate = publicationDate; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public boolean isVerified() { return verified; }
    public void setVerified(boolean verified) { this.verified = verified; }
    public String getVerificationNotes() { return verificationNotes; }
    public void setVerificationNotes(String verificationNotes) { this.verificationNotes = verificationNotes; }

    @Override
    public String toString() {
        return title + " (" + type + ")";
    }
} 