package com.example.demo.model;

public class SendEmail_User {
    private String member_id;
    private String email;

    // 기본 생성자
    public SendEmail_User() {}

    // 매개변수가 있는 생성자
    public SendEmail_User(String email, String member_id) {

        this.email = email;
        this.member_id = member_id;
    }

    // Getter 및 Setter
    public String getEmail() {

        return email;
    }
    public String getMember_id() {

        return member_id;
    }

}
