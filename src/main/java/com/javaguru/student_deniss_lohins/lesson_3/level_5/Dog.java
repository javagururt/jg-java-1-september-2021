package com.javaguru.student_deniss_lohins.lesson_3.level_5;

public class Dog {

    private String name;
    private String colour;
    private String newColour;
    private int age;

    void voice(){
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: " + age);
        System.out.println("Dog colour " + colour);

    }
public void happyBirthday(){
        age = age + 1;
}
public  void changeColour(String newColour){
        this.colour = newColour;
}
    public Dog(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
}
