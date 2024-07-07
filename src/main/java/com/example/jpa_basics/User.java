package com.example.jpa_basics;

import jakarta.persistence.*;

@Entity
@Table(name="user_info")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int userId;
@OneToOne(mappedBy = "user")
    private Card card;

@Column(name="user_name")
     private String name;
     private int age;
     private String mobile;

    public User(int userId, String name, int age, String mobile) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    public User(){

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
