package com.javaguru.teacher.lesson_10_interfaces.lessoncode.uservalidation;

class User {

    private String nickname;
    private int age;

    public User(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
