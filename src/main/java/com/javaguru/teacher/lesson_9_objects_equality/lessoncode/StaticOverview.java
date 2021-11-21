package com.javaguru.teacher.lesson_9_objects_equality.lessoncode;

class StaticOverview {

    public static void main(String[] args) {
        Person firstPerson = new Person("Vasya", 20);
        Person secondPerson = new Person("Borja", 30);

        System.out.println(firstPerson);
        System.out.println(secondPerson);

        System.out.println("Def age = " + Person.DEFAULT_AGE);
        int age = PersonConstants.DEFAULT_AGE;
    }
}
