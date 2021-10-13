package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_5;

public class Dog {
    int dogAge;
    String dogName;
    String dogColour;
    String newColour;
    public Dog(String dogName, int dogAge, String dogColour){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }
    public void voice(){
        System.out.print(dogName+ " ");
        System.out.print(dogAge+ " ");
        System.out.println(dogColour);
    }
    public void changeColor(String newColour) {
        this.dogColour = newColour;
    }
    public int getAge(){
        return this.dogAge;
    }
    public void happyBirthday(){
        this.dogAge = this.dogAge + 1;
        System.out.println("Today is dog's birthday");
    }

}
