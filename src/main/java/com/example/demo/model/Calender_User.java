package com.example.demo.model;

public class Calender_User {
    private String name;
    private String details;
    private String color;
    private String kind;
    private String start;
    private String end;
    private boolean timed;

    // Constructor
    public Calender_User(String name, String details, String color, String kind, String start, String end, boolean timed) {
        this.name = name;
        this.details = details;
        this.color = color;
        this.kind = kind;
        this.start = start;
        this.end = end;
        this.timed = timed;
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isTimed() {
        return timed;
    }

    public void setTimed(boolean timed) {
        this.timed = timed;
    }
}
