package com.javaguru.student_Olga_T.lesson_4.level_1.tasks_1_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class CheckNumber {
    public static void main(String[] args) {


        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Please enter number:");
        int userInputNumber = inputNumber.nextInt();
        if (userInputNumber > 0) {
            System.out.println("Your number " + userInputNumber + " is positive.");
        } else if (userInputNumber == 0) {
            System.out.println("Your number " + userInputNumber + " is null.");
        } else {
            System.out.println("Your number " + userInputNumber + " is negative.");
        }

        System.out.println("Please enter number from 1 to 7:");
        int userInputNumberIf = inputNumber.nextInt();

        if (userInputNumberIf == 1) {
            System.out.println("Monday");
        }
        if (userInputNumberIf == 2) {
            System.out.println("Tuesday");
        }
        if (userInputNumberIf == 3) {
            System.out.println("Wednesday");
        }
        if (userInputNumberIf == 4) {
            System.out.println("Thursday");
        }
        if (userInputNumberIf == 5) {
            System.out.println("Friday");
        }
        if (userInputNumberIf == 6) {
            System.out.println("Saturday");
        }
        if (userInputNumberIf == 7) {
            System.out.println("Sunday");
        }


        System.out.println("Please enter number from 1 to 7:");
        int userInputNumberSwitch = inputNumber.nextInt();

        switch (userInputNumberSwitch) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No such day of the week.");
                break;
        }

        System.out.println("Please enter number:");
        int userInputNumberEvenOrOdd = inputNumber.nextInt();
        if (userInputNumberEvenOrOdd % 2 == 0) {
            System.out.println("Your number " + userInputNumberEvenOrOdd + " is even.");
        } else {
            System.out.println("Your number " + userInputNumberEvenOrOdd + " is odd.");
        }

    }
}



