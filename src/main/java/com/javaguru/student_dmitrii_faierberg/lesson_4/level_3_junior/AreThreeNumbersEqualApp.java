package com.javaguru.student_dmitrii_faierberg.lesson_4.level_3_junior;

import java.util.Scanner;

class AreThreeNumbersEqualApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        /*if (areFirstSecondEqual(firstNumber, secondNumber) &&
            areSecondThirdEqual(secondNumber, thirdNumber))
            System.out.println("All numbers are equal");
        else if (areFirstSecondEqual(firstNumber, secondNumber) ||
                areSecondThirdEqual(secondNumber, thirdNumber) ||
                areFirstThirdEqual(firstNumber, thirdNumber))
            System.out.println("Neither all are equal or different");
        else
            System.out.println("All numbers are different");*/

        if (firstNumber == secondNumber && secondNumber == thirdNumber) System.out.println("All numbers are equal");
        else if (firstNumber != secondNumber && secondNumber != thirdNumber) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
/*
    // Можно ли так делать?
    public static boolean areFirstSecondEqual(int firstNumber, int secondNumber){
        if (firstNumber == secondNumber) return true;
        else return false;
    }
    public static boolean areSecondThirdEqual(int seconNumber, int thirdNumber){
        if (seconNumber == thirdNumber) return true;
        else return false;
    }
    public static boolean areFirstThirdEqual(int firstNumber, int thirdNumber){
        if (firstNumber == thirdNumber) return true;
        else return false;
    }*/
}
