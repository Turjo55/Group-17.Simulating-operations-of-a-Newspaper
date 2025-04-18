package com.example.simulatingoperationsofanewspaper.TanvirulADMIN;

import javafx.scene.image.Image;

import java.time.LocalDate;

public class Advertisements {
    private String advertiserName;
    private LocalDate advertisementDate;
    private String advertisementTopic;
    private Image advertisementImage;

    public Advertisements(String advertiserName, LocalDate advertisementDate, String advertisementTopic, Image advertisementImage) {
        this.advertiserName = advertiserName;
        this.advertisementDate = advertisementDate;
        this.advertisementTopic = advertisementTopic;
        this.advertisementImage = advertisementImage;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }

    public LocalDate getAdvertisementDate() {
        return advertisementDate;
    }

    public void setAdvertisementDate(LocalDate advertisementDate) {
        this.advertisementDate = advertisementDate;
    }

    public String getAdvertisementTopic() {
        return advertisementTopic;
    }

    public void setAdvertisementTopic(String advertisementTopic) {
        this.advertisementTopic = advertisementTopic;
    }

    public Image getAdvertisementImage() {
        return advertisementImage;
    }

    public void setAdvertisementImage(Image advertisementImage) {
        this.advertisementImage = advertisementImage;
    }

    @Override
    public String toString() {
        return "Advertisements{" +
                "advertiserName='" + advertiserName + '\'' +
                ", advertisementDate=" + advertisementDate +
                ", advertisementTopic='" + advertisementTopic + '\'' +
                ", advertisementImage=" + advertisementImage +
                '}';
    }
}
