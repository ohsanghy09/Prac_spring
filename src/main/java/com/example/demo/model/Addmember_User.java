package com.example.demo.model;

public class Addmember_User {
    private String member_id;

    private String password;

    private String email;

    private String name;

    private String birth;

    private String gender;

    // 기본 생성자
    public Addmember_User() {}

    // 매개변수가 있는 생성자
    public Addmember_User(String member_id, String password, String email, String name, String birth, String gender) {
        this.member_id = member_id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
    }

    // Getter 및 Setter

    public String getMember_id() {

        return member_id;
    }
    public String getPassword() {

        return password;
    }
    public String getEmail() {

        return email;
    }
    public String getName() {

        return name;
    }
    public String getBirth() {

        return birth;
    }
    public String getGender() {

        return gender;
    }

}
