package com.javaguru.student_jekaterina_ola.lesson_3.level_5.Task_18;

public class DogDemo {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Cookie", 1, "Grey");
        String dogName = firstDog.getDogName();
        int dogAge = firstDog.getDogAge();
        String dogColour = firstDog.getDogColour();
        System.out.println("Dog Age = " + firstDog.dogAge);
        System.out.println("Dog name = " + firstDog.dogName);
        System.out.println("Dog colour = " + firstDog.dogColour);

        firstDog.happyBirthday();
        System.out.println("Today I'm one year older!");
        System.out.println("I'm " + firstDog.dogAge + " years old now.");

        firstDog.changeColour("White");
        System.out.println("My new colour is " + firstDog.getDogColour() + ".");

        firstDog.dogVoice();
    }
}