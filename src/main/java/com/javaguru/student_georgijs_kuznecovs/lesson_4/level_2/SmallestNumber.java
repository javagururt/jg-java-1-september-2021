package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class SmallestNumber {
    public static void main(String[] args) {

        System.out.println("Please enter first number: ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNum = sc.nextInt();

        if (firstNum > secondNum){
            System.out.println("The smallest number is: " + secondNum);
        }else
            System.out.println("The smallest number is: " + firstNum);
    }
}
