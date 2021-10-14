package com.javaguru.student_vadim_babchenok.lesson3.level_5;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    //polja klassa
    String name;
    int age;
    String color;

    //konstruktor
    public Dog(String dogname,int dogage,String dogcolor){
     this.name=dogname;
     this.age=dogage;
     this.color=dogcolor;
    }

    public String getColor() {
        return color;
    }

    //metod klassa
    public String getName() {
        return this.name;
    }

    //metod klassa
    public void voice() {
        System.out.println("Собаке по кличке "+ this.name + " целых " + this.age+ " лет!");
    }

    //metod klassa
    public void happyBirthday() {
        this.age=this.age+1;
    }

    public void color() {
        System.out.println("Собакa по кличке "+ this.name + "  стала цвета - " + this.color );
    }
}
