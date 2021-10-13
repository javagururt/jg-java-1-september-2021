package com.javaguru.student_nikita_simans.homework.lesson_3;

public class Dog {
    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(dogName + " " + dogAge + " " + dogColor);
        }
    }
    public void happyBirthday() {
        dogAge++;
        System.out.println(dogName + " " + dogAge);

    }
    public void changeColor(String newColor) {
        dogColor = newColor;
    }
}
