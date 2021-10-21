package com.javaguru.student_vadims_ilatovskis.lesson_4.level_3;

import java.util.Scanner;

//Task_10

class BiggestNumberFromThree {
    public static void main(String[] args) {
        System.out.println("Please enter first integer number!");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second integer number!");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third integer number!");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println("The biggest number is: " +firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println("The biggest number is: " + secondNumber);
        }
        else {
            System.out.println("The biggest number is: " + thirdNumber);
        }
    }
}
