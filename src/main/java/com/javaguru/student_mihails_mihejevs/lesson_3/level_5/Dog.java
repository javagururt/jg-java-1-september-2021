package com.javaguru.student_mihails_mihejevs.lesson_3.level_5;

class Dog {

    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String name, int age, String color) {
        this.dogName = name;
        this.dogAge = age;
        this.dogColor = color;
    }
    public void voice() {
        System.out.println(dogName + " " + dogName + " " + dogName);
        System.out.println("Dog name - " + dogName);
        System.out.println(dogName + " age - " + dogAge);
        System.out.println(dogName + " color - " + dogColor);
        }
    public void getName() {
        System.out.println("Dog name - " + dogName);
    }
    public void getAge() {
        System.out.println(dogName + " age - " + dogAge);
    }
    public void happyBirthday() {
        System.out.println("It's dogs birthday!");
        dogAge = dogAge + 1;
    }
    public void changeColor(String newColor) {
        this.dogColor = newColor;
    }
}
