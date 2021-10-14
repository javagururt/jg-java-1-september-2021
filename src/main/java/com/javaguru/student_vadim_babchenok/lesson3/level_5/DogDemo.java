package com.javaguru.student_vadim_babchenok.lesson3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Чикита",10,"red");
        dog.voice();  // подать голос и года
        dog.happyBirthday();  //увеличить год собаки
        dog.voice();   // подать голос и года
        dog.color(); // цвет собаки
    }
}
