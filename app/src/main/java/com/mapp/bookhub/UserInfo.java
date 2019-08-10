package com.mapp.bookhub;
public class UserInfo {

    String name;
    String username;
    String password;

    public UserInfo() {

    }

    public UserInfo(UserInfo u) {
        name = u.getName();
        username = u.getUsername();
        password = u.getPassword();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}


