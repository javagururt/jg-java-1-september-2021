package com.javaguru.student_nikita_simans.homework.lesson_3;

public class Robot {
    private String name;
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
    public Robot(String robotName) {
        this.name = robotName;
    }
}
