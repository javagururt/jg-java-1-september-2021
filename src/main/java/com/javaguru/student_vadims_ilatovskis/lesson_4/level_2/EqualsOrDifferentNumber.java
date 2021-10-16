package com.javaguru.student_vadims_ilatovskis.lesson_4.level_2;

import java.util.Scanner;
//Task_7
class EqualsOrDifferentNumber {
    public static void main(String[] args) {
        System.out.println("Please enter first integer number and press 'Enter'");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second integer number and press 'Enter'");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber){
            System.out.println("Numbers are equals");}
        else if (firstNumber != secondNumber){
            System.out.println("Numbers are different");
        }
    }
}
