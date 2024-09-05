package com.example.demo.model;

public class FindId_User {
    private String name;
    private String email;

    private String birth;

    // 기본 생성자
    public FindId_User() {}

    // 매개변수가 있는 생성자
    public FindId_User(String name, String email, String birth) {
        this.name = name;
        this.email = email;
        this.birth = birth;
    }

    // Getter 및 Setter
    public String getName() {

        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirth() {
        return birth;
    }

}
