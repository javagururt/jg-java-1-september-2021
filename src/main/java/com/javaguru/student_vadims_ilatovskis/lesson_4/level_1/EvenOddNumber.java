package com.javaguru.student_vadims_ilatovskis.lesson_4.level_1;

import java.util.Scanner;
//task_4
class EvenOddNumber {
    public static void main(String[] args) {
        System.out.println("Hello, please enter integer number and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0){System.out.println("Your number is even number");}
        else if (number % 2 != 0){System.out.println("Your number is odd number");}

    }
}
