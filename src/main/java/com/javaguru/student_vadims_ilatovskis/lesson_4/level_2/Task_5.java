package com.javaguru.student_vadims_ilatovskis.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {
        System.out.println("Please enter first integer number and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number end press 'Enter'");
        int secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println("The number " + firstNumber + " is bigger");}
        else if (secondNumber > firstNumber) {
            System.out.println("The number " + secondNumber + " is bigger");}


    }
}
