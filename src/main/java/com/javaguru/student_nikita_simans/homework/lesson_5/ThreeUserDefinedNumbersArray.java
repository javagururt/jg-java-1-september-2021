package com.javaguru.student_nikita_simans.homework.lesson_5;

import java.util.Scanner;

public class ThreeUserDefinedNumbersArray {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second number: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter third number: ");
        numbers[2] = scanner.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

    }
}
