package com.javaguru.student_Jegor_Rutkovsky.lesson_3.level_5;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Barry", 5, "Black");
        myDog.voice();
        System.out.println("Dogs age is " +myDog.dogAge);
        myDog.happyBirthday();
        System.out.println("Dogs age is " +myDog.dogAge);
        myDog.getAge();
        myDog.changeColor("White");
        myDog.voice();


        

        }
}
