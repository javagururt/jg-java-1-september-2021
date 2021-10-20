package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_3_junior;

import java.util.Scanner;

class Task_9 {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner scanner1 = new Scanner(System.in);
        int firstNumber = scanner1.nextInt();
        System.out.println("Enter second number");
        Scanner scanner2 = new Scanner(System.in);
        int secondNumber = scanner2.nextInt();
        System.out.println("Enter third number");
        Scanner scanner3 = new Scanner(System.in);
        int thirdNumber = scanner3.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing");
        }
        else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("Decreasing");
        }
        else {System.out.println("Neither increasing or decreasing order");}
    }
}
