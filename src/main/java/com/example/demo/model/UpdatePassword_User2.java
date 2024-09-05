package com.example.demo.model;

public class UpdatePassword_User {
    private String member_id;
    private String email;

    // 기본 생성자
    public UpdatePassword_User() {}

    // 매개변수가 있는 생성자
    public UpdatePassword_User(String member_id, String email) {
        this.member_id = member_id;
        this.email = email;
    }

    // Getter 및 Setter
    public String getMember_id() {

        return member_id;
    }

    public String getEmail() {
        return email;
    }

}
