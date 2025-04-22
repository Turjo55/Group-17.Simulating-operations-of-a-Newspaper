package com.example.simulatingoperationsofanewspaper.maliha;

import java.time.LocalDateTime;

public class MediaFile {
    private String id;
    private String interviewId;
    private String fileName;
    private String fileType; // "Audio", "Video", "Transcript", "Document"
    private String filePath;
    private LocalDateTime uploadDate;
    private String uploadedBy;
    private String description;

    public MediaFile(String id, String interviewId, String fileName, String fileType, String filePath,
            String uploadedBy) {
        this.id = id;
        this.interviewId = interviewId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
        this.uploadedBy = uploadedBy;
        this.uploadDate = LocalDateTime.now();
        this.description = "";
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadedBy() {
        return uploadedBy;
    }

    public void setUploadedBy(String uploadedBy) {
        this.uploadedBy = uploadedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return fileName + " (" + fileType + ")";
    }
}