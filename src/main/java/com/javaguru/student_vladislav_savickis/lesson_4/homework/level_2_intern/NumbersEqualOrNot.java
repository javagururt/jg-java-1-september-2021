package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_2_intern;

import java.util.Scanner;

public class NumbersEqualOrNot {
    public static void main(String[] args) {
        System.out.println("Hi! Please enter first int number:");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int secondNumber = input.nextInt();
        if(firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        }
        else {
            System.out.println("Numbers are different");
        }
    }
}
