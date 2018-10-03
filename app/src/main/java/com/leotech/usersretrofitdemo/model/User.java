package com.leotech.usersretrofitdemo.model;

import com.google.gson.annotations.SerializedName;

public class User {


    @SerializedName("id")
    private int userID;


    @SerializedName("name")
    private String fullName;

    private String username;

    private String email;

    private String phone;

    public User(int userID, String fullName, String username, String email, String phone) {
        this.userID = userID;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

