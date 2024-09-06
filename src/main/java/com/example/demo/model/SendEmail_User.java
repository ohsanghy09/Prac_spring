package com.example.demo.model;

public class SendEmail_User {
    private String email;

    // 기본 생성자
    public SendEmail_User() {}

    // 매개변수가 있는 생성자
    public SendEmail_User(String email) {

        this.email = email;
    }

    // Getter 및 Setter
    public String getEmail() {

        return email;
    }

}
