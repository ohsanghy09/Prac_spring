package com.example.demo.model;

public class SelectId_User {
    private String member_id;

    // 기본 생성자
    public SelectId_User() {}

    // 매개변수가 있는 생성자
    public SelectId_User(String member_id) {

        this.member_id = member_id;
    }

    // Getter 및 Setter
    public String getMember_id() {

        return member_id;
    }

}
