package com.javaguru.student_vladislav_savickis.lesson_2.Task_9;

import java.util.Scanner;

public class multiplyTable {
    public static void main(String[] args) {
            System.out.println("Bonjour! Please enter int number: ");
            Scanner input = new Scanner(System.in);
            int firstNumber = input.nextInt();
        System.out.println("Multiplying table for number ");
            for (int i = 1; i < 11; i++) {
                int multiplyResult = firstNumber * i;
                System.out.println(firstNumber + " * " + i + " = " + multiplyResult);
            }
    }
}
