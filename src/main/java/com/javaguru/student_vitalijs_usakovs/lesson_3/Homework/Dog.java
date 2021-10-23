package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
/*
Тема: создание класса Dog.
Создать класс собака (Dog) и продемонстрировать его работу с ним в программе.
Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться кличка собаки три раза.
Создать отдельный класс DogDemo, объявить в нём main() метод и продемонстрировать использование класса собака (Dog).
 */
@CodeReview(approved = true)
class Dog {
    String name;
    String bark;
    public Dog(String dogName){
        this.name = dogName;
    }
    public void dogName(){
        System.out.println(this.name);
    }
    public void dogBark(){
        System.out.println("*" + this.name);
    }
}

class DogDemo {
    public static void main(String[] args) {
    System.out.println("Choose Dog name: ");
        Scanner input = new Scanner(System.in);
        String nameDog = input.next();

        Dog myDog = new Dog(nameDog);
        myDog.dogBark();
        myDog.dogBark();
        myDog.dogBark();
    }
}
