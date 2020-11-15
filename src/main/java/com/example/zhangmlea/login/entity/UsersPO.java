package com.example.zhangmlea.login.entity;

import java.io.Serializable;

public class UsersPO implements Serializable {

    private String id;
    private String userName;
    private String password;
    private String passWordSalt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassWordSalt() {
        return passWordSalt;
    }

    public void setPassWordSalt(String passWordSalt) {
        this.passWordSalt = passWordSalt;
    }

    @Override
    public String toString() {
        return "UsersPO{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", passWordSalt='" + passWordSalt + '\'' +
                '}';
    }
}
