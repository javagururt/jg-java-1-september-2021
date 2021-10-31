package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Dog {
    String name;
    int age;

    public Dog(String dogName) {
        this.name = dogName;
    }

    public void dogName() {
        System.out.println(this.name);}

    public void dogBark() {
        System.out.println("*" + this.name);
    }

    public void happyBirthday() {
        System.out.println(this.age);
    }


    public static void main(String[] args) {
        System.out.println("Dog Age is: ");
        Scanner input = new Scanner(System.in);
        int firstAge = input.nextInt();
        int nextYear = firstAge + 1;

        System.out.println("Enter the Dog name: ");
        Scanner name = new Scanner(System.in);
        String nameDog = name.nextLine();

        System.out.println("Write below your dog color : Red, Black or Yellow");
        Scanner color = new Scanner(System.in);
        String dogColor = color.nextLine();

        switch (dogColor){
            case "Red":
            System.out.println(nameDog + " color is red");
            break;
            case "Black":
                System.out.println(nameDog + " color is black");
                break;
            case "Yellow":
                System.out.println(nameDog + " color is yellow");
                break;
            default:
                System.out.println("Please choose correct Dog Collor from the list");
        }

        System.out.println("Today is " + nameDog + " birthday.");
        System.out.println( nameDog + " is " + firstAge + " years old ");
        System.out.println( "Next year it will be " + nextYear + ".");
        System.out.println( "And " + nameDog + " will be the same " + dogColor + " color.");
        System.out.println( "Happy birthday to you " + nameDog);
        Dog myDog = new Dog(nameDog);
        myDog.dogBark();
        myDog.dogBark();
        myDog.dogBark();}



    }
