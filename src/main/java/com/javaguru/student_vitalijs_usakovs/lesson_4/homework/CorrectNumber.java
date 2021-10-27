package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class CorrectNumber {
    int number;

    public static void main(String[] args) {
        System.out.println("Please enter correct number : ");
        Scanner input = new Scanner(System.in);
        int correctNumber = input.nextInt();

        switch (correctNumber){
            case 46:
            System.out.println("You've entered number " + correctNumber + ". It is correct number.");
            break;
            case 0:
            System.out.println("The number you have entered is 0. Please try again.");
            break;
            default:
            System.out.println("The number you have entered is not correct. Please try again.");
            break;
        }
    }
}
