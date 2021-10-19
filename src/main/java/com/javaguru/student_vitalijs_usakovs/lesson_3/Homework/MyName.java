package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import java.util.Scanner;

class MyName {
    public static void main(String[] args) {
        String myName = "Vitalijs";
        System.out.println("Hi " + myName +"!");


        System.out.println("Hi! What's your name?");
        Scanner input = new Scanner(System.in);
        String hello = input.next();
        String hi = "Hi " + hello + "!";
        System.out.println(hi);

    }
}
