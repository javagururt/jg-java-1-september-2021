package com.javaguru.student_Olga_T.lesson_3.level_5.tasks_18_22;

public class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 4, "White");
        dog1.voice();
        System.out.println("Now I am " + dog1.getDogsAge() + " years old!");
        dog1.happyBirthday();
        System.out.println("Today I have a Birthday and now I am " + dog1.getDogsAge() + " years old!");
        System.out.println(dog1.dogsName + "!");
        System.out.println("I became older for one year.");
        System.out.println("Hello! My name is " + dog1.getDogsName() + ". I am " + dog1.getDogsAge() + " years old. " + "I am beautiful " + dog1.getDogsColor() + " color dog!");
        String oldDogsColor = dog1.getDogsColor();
        dog1.changeColor("Brown");
        System.out.println("Hello! My name is " + dog1.getDogsName() + ". I am " + dog1.getDogsAge() + " years old. " + "I changed my color from " + oldDogsColor + " to " + dog1.getDogsColor() + " and now I am beautiful " + dog1.getDogsColor() + " color dog!");
    }
}
