package com.javaguru.student_deniss_lohins.lesson_3.level_x;

class User {

    private String username;
    private String password;
    private boolean isBlocked;
    private int triesToLoginLeft;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        isBlocked = false;
        triesToLoginLeft = 3;
    }

    public void blockUser(){
        isBlocked = true;
    }

    public void resetTriesCounter(){
        triesToLoginLeft = 3;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getTriesToLoginLeft() {
        return triesToLoginLeft;
    }

    public void setTriesToLoginLeft(int triesToLoginLeft) {
        this.triesToLoginLeft = triesToLoginLeft;
    }
}
