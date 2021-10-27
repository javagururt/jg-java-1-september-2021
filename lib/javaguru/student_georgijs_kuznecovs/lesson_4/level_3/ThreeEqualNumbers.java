package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class ThreeEqualNumbers {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = sc.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNum = sc.nextInt();

        if (firstNum == secondNum && secondNum == thirdNum){
            System.out.println("All numbers are equal");
        }else if (firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum){
            System.out.println("All numbers are different");
        }else
            System.out.println("Neither all are equal or different");
    }
}
