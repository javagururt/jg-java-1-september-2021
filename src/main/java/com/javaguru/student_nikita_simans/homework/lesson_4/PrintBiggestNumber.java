package com.javaguru.student_nikita_simans.homework.lesson_4;

import java.util.Scanner;

public class PrintBiggestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        int mediator = firstNumber;
        if (secondNumber > mediator) {
            mediator = secondNumber;
        }
        if (thirdNumber > mediator) {
            mediator = thirdNumber;
        }
        System.out.println(mediator);
    }
}
