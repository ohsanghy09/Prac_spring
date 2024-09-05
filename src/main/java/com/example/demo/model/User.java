package com.example.demo.model;

public class User {
    private String member_id;
    private String password;

    // 기본 생성자
    public User() {}

    // 매개변수가 있는 생성자
    public User(String member_id, String password) {
        this.member_id = member_id;
        this.password = password;
    }

    // Getter 및 Setter
    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
