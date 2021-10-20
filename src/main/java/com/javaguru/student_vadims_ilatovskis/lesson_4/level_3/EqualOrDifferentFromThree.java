package com.javaguru.student_vadims_ilatovskis.lesson_4.level_3;

import java.util.Scanner;

//Task_8
public class EqualOrDifferentFromThree {
    public static void main(String[] args) {
        System.out.println("Please enter first number!");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber > secondNumber && firstNumber < thirdNumber) {
            System.out.println("All numbers are different");
        } else if (secondNumber > firstNumber && secondNumber < thirdNumber) {
            System.out.println("All numbers are different");
        } else if (thirdNumber > firstNumber && thirdNumber < secondNumber){
            System.out.println("All numbers are different");}
        else{System.out.println("Neither all are equal or different");
        }

    }
}
