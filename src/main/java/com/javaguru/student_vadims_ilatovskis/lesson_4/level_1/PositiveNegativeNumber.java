package com.javaguru.student_vadims_ilatovskis.lesson_4.level_1;

import java.util.Scanner;
// Task_1
class PositiveNegativeNumber {
    public static void main(String[] args) {
        System.out.println("Hello, please enter integer number and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0)
        {System.out.println("Your number is positive number");}
        else if (number < 0)
        {System.out.println("Your number is negative number");}

    }
}
