package com.javaguru.student_nikita_simans.homework.lesson_3;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 12, "red");
        dog.voice();
        dog.happyBirthday();
        dog.voice();
        dog.changeColor("black");
        dog.voice();

    }
}
