package com.javaguru.student_vadim_babchenok.lesson3.level_5;

public class Dog {
    String name;

    //konstruktor
    public Dog(String dogname){
     this.name=dogname;
    }

    public String getName() {
        return this.name;
    }

    public void voice() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.getName());
        }
    }
}