package com.javaguru.teacher.lesson_9_objects_equality.lessoncode.passbyvalue;

class Dog {

    private int age;
    private String name;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
