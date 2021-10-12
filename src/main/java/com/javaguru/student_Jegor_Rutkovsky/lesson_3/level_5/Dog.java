package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_5;

public class Dog {
    int dogAge;
    String dogName;
    public Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }
    public void voice(){
        System.out.println(dogName);
    }
    public int getAge(){
        return this.dogAge;
    }
    public void happyBirthday(){
        this.dogAge = this.dogAge + 1;
    }
}
