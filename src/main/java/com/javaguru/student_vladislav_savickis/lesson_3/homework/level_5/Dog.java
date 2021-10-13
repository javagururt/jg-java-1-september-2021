package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_5;

class Dog {
    private String name;
    private int age;
    String color;

    Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("Dog name: " + name);
        //System.out.println("Dog age: " + age);
        System.out.println("Dog color: " + color);
    }

    /*public void happyBirthday() {
        age=age+1;
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: " + this.age);
    }*/

    public void changeColor(String newColor) {
        color=newColor;
        System.out.println("Dog name: " + name);
        System.out.println("Dog color: " + color);
    }
}
