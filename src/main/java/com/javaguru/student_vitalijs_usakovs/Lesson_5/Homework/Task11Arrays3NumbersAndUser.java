package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import java.util.Arrays;
import java.util.Scanner;

class Task11Arrays3NumbersAndUser {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Please enter first number - ");
        Scanner input0 = new Scanner(System.in);
        int number0 = input0.nextInt();

        System.out.println("Please enter second number - ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();

        System.out.println("Please enter third number - ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();

        System.out.println("Numbers are : " + number0 + ", " + number1 + ", " + number2 + ".");

    }
}
