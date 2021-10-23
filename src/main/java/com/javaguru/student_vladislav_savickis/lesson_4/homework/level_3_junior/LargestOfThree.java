package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_3_junior;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("Hi! Please enter first int number:");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int thirdNumber = input.nextInt();

        int result;

        if (firstNumber == secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("First and second numbers are larger than third");
                result = firstNumber;
                System.out.println("Number " + result + " is largest");
            }
        }
        if (firstNumber == thirdNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("First and third numbers are larger than second");
                result = firstNumber;
                System.out.println("Number " + result + " is largest");
            }
        }
        if(secondNumber == thirdNumber) {
            if (secondNumber > firstNumber) {
                System.out.println("Second and third numbers are larger than first");
                result = secondNumber;
                System.out.println("Number " + result + " is largest");
            }
        }
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            result = firstNumber;
            System.out.println("Number " + result + " is largest");
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            result = secondNumber;
            System.out.println("Number " + result + " is largest");
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            result = thirdNumber;
            System.out.println("Number " + result + " is largest");
        }
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("Numbers are equal");
        }
    }
}
