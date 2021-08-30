package com.nihal.quizapp;

public class User {
    private String name,email,pass,referCode;

    public User() {
    }

    public User(String name, String email, String pass, String referCode) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.referCode = referCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }
}
