package com.javaguru.student_vladislav_savickis.lesson_3.homework.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Amigo", 2, "Black");
        dog.voice();
        /*System.out.println("\n" + "Happy Birthday!" + "\n");
        dog.happyBirthday();*/
        System.out.print("\n");
        dog.changeColor("White");
    }
}
