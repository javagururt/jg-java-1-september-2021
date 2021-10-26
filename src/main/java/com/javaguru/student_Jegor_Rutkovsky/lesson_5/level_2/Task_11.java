package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task_11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second number");
        Scanner scanner2 = new Scanner(System.in);
        numbers[1] = scanner2.nextInt();
        System.out.println("Enter third number");
        Scanner scanner3 = new Scanner(System.in);
        numbers[2] = scanner3.nextInt();

        System.out.println(Arrays.toString(numbers));

    }
}
