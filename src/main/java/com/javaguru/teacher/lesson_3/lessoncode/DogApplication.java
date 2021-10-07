package com.javaguru.teacher.lesson_3.lessoncode;

class DogApplication {

    public static void main(String[] args) {
        Dog firstDog = new Dog();

        System.out.println("Dog name = " + firstDog.name); // null - by default (String)
        System.out.println("Dog age = " + firstDog.age); // 0 - by default (int)

        firstDog.name = "Rex";
        firstDog.age = 1;

        System.out.println("Dog name = " + firstDog.name); // Rex
        System.out.println("Dog age = " + firstDog.age); // 1

    }
}
