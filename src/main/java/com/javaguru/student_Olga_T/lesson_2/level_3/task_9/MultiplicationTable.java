package com.javaguru.student_Olga_T.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Please enter number: ");
        Scanner number = new Scanner(System.in);
        int inputNumber = number.nextInt();

        System.out.println("Inputed number is: " + inputNumber);
        System.out.println("Multiplication Table for number " + inputNumber + " is here:");
        System.out.println(inputNumber + " x 1 = " + inputNumber);
        System.out.println(inputNumber + " x 2 = " + inputNumber * 2);
        System.out.println(inputNumber + " x 3 = " + inputNumber * 3);
        System.out.println(inputNumber + " x 4 = " + inputNumber * 4);
        System.out.println(inputNumber + " x 5 = " + inputNumber * 5);
        System.out.println(inputNumber + " x 6 = " + inputNumber * 6);
        System.out.println(inputNumber + " x 7 = " + inputNumber * 7);
        System.out.println(inputNumber + " x 8 = " + inputNumber * 8);
        System.out.println(inputNumber + " x 9 = " + inputNumber * 9);
        System.out.println(inputNumber + " x 10 = " + inputNumber * 10);
    }
}
