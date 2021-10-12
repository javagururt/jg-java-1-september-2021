package com.javaguru.student_ruslan_pankratov.lesson_3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

// Task 18 - 22
@CodeReview(approved = true)
class Dog {
    private final String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println("Кличка собаки: " + name);
        System.out.println("Возраст собаки: " + age);
        System.out.println("Цвет собаки: " + color);
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

    void happyBirthday() {
        age++;
    }
}


