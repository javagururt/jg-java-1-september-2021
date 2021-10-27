package com.javaguru.student_Olga_T.lesson_4.level_2.tasks_5_7;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class CompareNumbers {
    public static void main(String[] args) {
        Scanner inputUserNumber = new Scanner(System.in);

        //task 5:
        System.out.println("Please enter first number:");
        int userNumberOne = inputUserNumber.nextInt();

        System.out.println("Please enter second number:");
        int userNumberTwo = inputUserNumber.nextInt();

        if (userNumberOne > userNumberTwo) {
            System.out.println("The greatest number is " + userNumberOne + ".");
        }
        if (userNumberOne < userNumberTwo) {
            System.out.println("The greatest number is " + userNumberTwo + ".");
        }

        //task 6:
        System.out.println("Please enter first number:");
        int userNumber3 = inputUserNumber.nextInt();

        System.out.println("Please enter second number:");
        int userNumber4 = inputUserNumber.nextInt();

        if (userNumber3 > userNumber4) {
            System.out.println("The smaller number is " + userNumber4 + ".");
        }
        if (userNumber3 < userNumber4) {
            System.out.println("The smaller number is " + userNumber3 + ".");
        }

        //task 7:
        System.out.println("Please enter first number:");
        int userNumber5 = inputUserNumber.nextInt();

        System.out.println("Please enter second number:");
        int userNumber6 = inputUserNumber.nextInt();

        if (userNumber5 == userNumber6) {
            System.out.println("Numbers are equals.");
        } else {
            System.out.println("Numbers are different.");
        }

    }
}


