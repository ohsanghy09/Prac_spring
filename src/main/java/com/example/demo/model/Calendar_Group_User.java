package com.example.demo.model;

public class Calendar_Group_User {

    private String id;
    private String title;
    private String content;
    private String date;

    // Constructor
    public Calendar_Group_User(String id, String title, String content, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    // Getter and setter

    public String getID() { return id; }
    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }
    public String getdate() {
        return date;
    }

}
