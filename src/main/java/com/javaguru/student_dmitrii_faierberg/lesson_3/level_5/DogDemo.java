package com.javaguru.student_dmitrii_faierberg.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Tuzik", 8, "Black");
        dog.voice();
        dog.happyBirthday();
        dog.changeColor("White");
        dog.voice();
    }
}
