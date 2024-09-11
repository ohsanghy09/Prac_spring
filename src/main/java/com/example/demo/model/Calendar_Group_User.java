package com.example.demo.model;

public class Calendar_Group_User {

    private String id;
    private String groupItem;

    // Constructor
    public Calendar_Group_User(String id, String groupItem) {
        this.id = id;
        this.groupItem = groupItem;
    }

    // Getter and setter

    public String getID() { return id; }
    public String getGroupItem() {
        return groupItem;
    }

    public void setGroupItem(String groupItem) {
        this.groupItem = groupItem;
    }
}
