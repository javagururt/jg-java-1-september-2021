package com.javaguru.student_mihails_mihejevs.lesson_4.level_1;

import java.util.Scanner;

public class HwTask4 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("Please enter whole number: ");
        Scanner input = new Scanner(System.in);
        int enteredNumber = input.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println("It`s even number");
        } else {
            System.out.println("It`s odd number");
        }
    }
}