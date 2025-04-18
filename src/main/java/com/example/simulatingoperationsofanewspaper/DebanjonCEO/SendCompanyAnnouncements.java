package com.example.simulatingoperationsofanewspaper.DebanjonCEO;

public class SendCompanyAnnouncements {

    private Str title;
    private Str message;
    private Str notification;

    public Str getTitle() {
        return title;
    }

    public Str getMessage() {
        return message;
    }

    public Str getNotification() {
        return notification;
    }

    public void setTitle(Str title) {
        this.title = title;
    }

    public void setMessage(Str message) {
        this.message = message;
    }

    public void setNotification(Str notification) {
        this.notification = notification;
    }

    @Override
    public String toString() {
        return "SendCompanyAnnouncements{" +
                "title=" + title +
                ", message=" + message +
                ", notification=" + notification +
                '}';
    }

    public SendCompanyAnnouncements(Str title, Str message, Str notification) {
        this.title = title;
        this.message = message;
        this.notification = notification;



    }
}
