package com.javaguru.student_vitalijs_usakovs.lesson_3.Homework;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
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
