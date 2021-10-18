package com.javaguru.student_deniss_lohins.lesson_4.level_2;

import java.util.Scanner;

class NumberComparisonSmallestOne {

    private int firstNumber;
    private int secondNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber < secondNumber){
            System.out.println("Smallest number is: " + firstNumber);
        }else if(firstNumber > secondNumber){
            System.out.println("Smallest number is: " + secondNumber);
        }else{
            System.out.println("Both numbers are equal!");
        }
    }
}
