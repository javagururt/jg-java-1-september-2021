package com.javaguru.student_nikita_simans.homework.lesson_3;

public class Robot {
    int legacy;
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is ROBO " + legacy);
    }
    public Robot(int legacy) {
        this.legacy = legacy;
    }
}
