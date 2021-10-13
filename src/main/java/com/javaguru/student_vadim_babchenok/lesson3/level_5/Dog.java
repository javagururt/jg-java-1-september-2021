package com.javaguru.student_vadim_babchenok.lesson3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name;
    int age;
    //konstruktor
    public Dog(String dogname,int dogage){
     this.name=dogname;
     this.age=dogage;
    }

    public String getName() {
        return this.name;
    }

    public void voice() {
        System.out.println("Собаке по кличке "+ this.name + " целых " + this.age+ " лет!");

    }
}