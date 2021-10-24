package com.javaguru.student_deniss_lohins.lesson_4.level_3;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class AscendingOrDescendingOrder {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Please, enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println("increasing");
        }else if(firstNumber > secondNumber && secondNumber > thirdNumber ){
            System.out.println("decreasing");
        }else{
            System.out.println("Neither increasing or decreasing order");
        }

    }
}

