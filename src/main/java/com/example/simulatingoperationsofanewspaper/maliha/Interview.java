package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Interview {
    private String id;
    private String sourceName;
    private LocalDateTime interviewDateTime;
    private String contactInfo;
    private String interviewNotes;
    private String status; // "Scheduled", "Completed", "Reviewed", "Archived"
    private String linkedArticleId;
    private List<String> mediaFileIds;
    private String transcript;
    private String journalistId;

    public Interview(String id, String sourceName, LocalDateTime interviewDateTime, String journalistId) {
        this.id = id;
        this.sourceName = sourceName;
        this.interviewDateTime = interviewDateTime;
        this.journalistId = journalistId;
        this.contactInfo = "";
        this.interviewNotes = "";
        this.status = "Scheduled";
        this.linkedArticleId = "";
        this.mediaFileIds = new ArrayList<>();
        this.transcript = "";
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getSourceName() { return sourceName; }
    public void setSourceName(String sourceName) { this.sourceName = sourceName; }
    public LocalDateTime getInterviewDateTime() { return interviewDateTime; }
    public void setInterviewDateTime(LocalDateTime interviewDateTime) { this.interviewDateTime = interviewDateTime; }
    public String getContactInfo() { return contactInfo; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
    public String getInterviewNotes() { return interviewNotes; }
    public void setInterviewNotes(String interviewNotes) { this.interviewNotes = interviewNotes; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getLinkedArticleId() { return linkedArticleId; }
    public void setLinkedArticleId(String linkedArticleId) { this.linkedArticleId = linkedArticleId; }
    public List<String> getMediaFileIds() { return mediaFileIds; }
    public void setMediaFileIds(List<String> mediaFileIds) { this.mediaFileIds = mediaFileIds; }
    public String getTranscript() { return transcript; }
    public void setTranscript(String transcript) { this.transcript = transcript; }
    public String getJournalistId() { return journalistId; }
    public void setJournalistId(String journalistId) { this.journalistId = journalistId; }

    public void addMediaFile(String mediaFileId) {
        if (!mediaFileIds.contains(mediaFileId)) {
            mediaFileIds.add(mediaFileId);
        }
    }

    public void removeMediaFile(String mediaFileId) {
        mediaFileIds.remove(mediaFileId);
    }

    @Override
    public String toString() {
        return sourceName + " - " + interviewDateTime.toLocalDate() + " (" + status + ")";
    }
}