package com.javaguru.teacher.lesson_6.lessoncode;

class PersonDemo {

    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Vasya");

        Person secondPerson = new Person();
        secondPerson.setName("Vasya");

        if (firstPerson.equals(secondPerson)) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("FAILURE");
        }
    }
}
