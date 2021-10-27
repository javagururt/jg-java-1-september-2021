package com.javaguru.student_Olga_T.lesson_4.level_3.tasks_8_10;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class CompareNumbers {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        //task 8:
        System.out.println("Task 8.");
        System.out.println("Please enter first number:");
        int userInputNumber1 = inputNumber.nextInt();
        System.out.println("Please enter second number:");
        int userInputNumber2 = inputNumber.nextInt();
        System.out.println("Please enter third number:");
        int userInputNumber3 = inputNumber.nextInt();

        if (userInputNumber1 == userInputNumber2 && userInputNumber2 == userInputNumber3) {
            System.out.println("All numbers: " + userInputNumber1 + ", " + userInputNumber2 + ", " + userInputNumber3 + " are equal.");
        } else if (userInputNumber1 != userInputNumber2 && userInputNumber2 != userInputNumber3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different.");
        }


        //task 9 - FOR TRAINING PORPOISES ("increasing" if the numbers are in increasing order):
        System.out.println("Task 9. increasing");
        System.out.println("Please enter first number:");
        int a = inputNumber.nextInt();
        System.out.println("Please enter second number:");
        int b = inputNumber.nextInt();
        System.out.println("Please enter third number:");
        int c = inputNumber.nextInt();
        int tempA = a;
        int tempB = b;
        int tempC = c;
        if (a > b && a < c && b < c) { //879
            a = tempB;
            b = tempA;
        }
        if (a > c && a >= b && b >= c) { //987
            a = tempC;
            c = tempA;
        }
        if (a > b && a >= c && b < c) { //978
            a = tempB;
            b = tempC;
            c = tempA;
        }
        if (a < b && a > c && b > c) { //451
            a = tempC;
            c = tempB;
            b = tempA;
        }
        if (a < b && a < c && b > c) { //154
            b = tempC;
            c = tempB;
        }

        System.out.println(a + ", " + b + ", " + c + ".");


        //task 9 - FOR TRAINING PORPOISES ("decreasing" if the numbers are in decreasing order):
        System.out.println("Task 9. decreasing");
        System.out.println("Please enter first number:");
        int d = inputNumber.nextInt();
        System.out.println("Please enter second number:");
        int e = inputNumber.nextInt();
        System.out.println("Please enter third number:");
        int f = inputNumber.nextInt();
        int tempD = d;
        int tempE = e;
        int tempF = f;

        if (d >= f && d > e && e < f) { //979
            e = tempF;
            f = tempE;
        }
        if (d < e && d < f && e <= f) { //799, 789
            d = tempF;
            f = tempD;
        }
        if (d < e && d < f && e > f) { //193
            d = tempE;
            e = tempF;
            f = tempD;
        }
        if (d > e && d > f && e < f) { //913
            e = tempF;
            f = tempE;
        }
        if (d > e && d < f && e < f) { //319
            d = tempF;
            e = tempD;
            f = tempE;
        }

        System.out.println(d + ", " + e + ", " + f + ".");


        //task 9 (increasing, decreasing, neither increasing or decreasing order):
        System.out.println("Task 9. increasing, decreasing, neither increasing or decreasing order");
        System.out.println("Please enter first number:");
        int numberOne = inputNumber.nextInt();
        System.out.println("Please enter second number:");
        int numberTwo = inputNumber.nextInt();
        System.out.println("Please enter third number:");
        int numberThree = inputNumber.nextInt();
        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("The numbers are in increasing order.");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("The numbers are in decreasing order.");
        } else {
            System.out.println("Neither increasing or decreasing order.");
        }


        //task 10
        System.out.println("Task 10:");
        System.out.println("Please enter first number:");
        int number1 = inputNumber.nextInt();
        System.out.println("Please enter second number:");
        int number2 = inputNumber.nextInt();
        System.out.println("Please enter third number:");
        int number3 = inputNumber.nextInt();
        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        System.out.println("The largest number is: " + largest + ".");

    }
}



