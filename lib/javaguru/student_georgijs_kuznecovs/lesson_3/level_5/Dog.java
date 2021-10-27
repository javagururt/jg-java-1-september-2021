package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String name = "Sharik";
    int age;
    String color;

    Dog(int dogAge, String dogColor) {
        this.age = dogAge;
        this.color = dogColor;
    }

    void happyBirthday() {
        age++;
    }

    void changeColor(String newColor) {
        this.color = newColor;
    }

    void voice() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: "+ age + " years");
        System.out.println("Dog color: " + color);
    }

}
