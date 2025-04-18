package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class NewspaperEditions {
    private String title;
    private String article;
    private LocalDate year;
    private Image picture;

    public NewspaperEditions(String title, String article, LocalDate year, Image picture) {
        this.title = title;
        this.article = article;
        this.year = year;
        this.picture = picture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "NewspaperEditions{" +
                "title='" + title + '\'' +
                ", article='" + article + '\'' +
                ", year=" + year +
                ", picture=" + picture +
                '}';
    }
}
