package com.javaguru.student_vadims_ilatovskis.lesson_2.homework.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_9 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number and press 'Enter'");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;
        int ten = 10;
        int multiplyResult1 = userNumber * one;
        int multiplyResult2 = userNumber * two;
        int multiplyResult3 = userNumber * three;
        int multiplyResult4 = userNumber * four;
        int multiplyResult5 = userNumber * five;
        int multiplyResult6 = userNumber * six;
        int multiplyResult7 = userNumber * seven;
        int multiplyResult8 = userNumber * eight;
        int multiplyResult9 = userNumber * nine;
        int multiplyResult10 = userNumber * ten;
        System.out.println(userNumber+ " x 1 = " + multiplyResult1);
        System.out.println(userNumber+ " x 2 = " + multiplyResult2);
        System.out.println(userNumber+ " x 3 = " + multiplyResult3);
        System.out.println(userNumber+ " x 4 = " + multiplyResult4);
        System.out.println(userNumber+ " x 5 = " + multiplyResult5);
        System.out.println(userNumber+ " x 6 = " + multiplyResult6);
        System.out.println(userNumber+ " x 7 = " + multiplyResult7);
        System.out.println(userNumber+ " x 8 = " + multiplyResult8);
        System.out.println(userNumber+ " x 9 = " + multiplyResult9);
        System.out.println(userNumber+ " x 10 = " + multiplyResult10);


    }
}
