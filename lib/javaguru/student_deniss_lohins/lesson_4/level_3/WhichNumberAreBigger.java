package com.javaguru.student_deniss_lohins.lesson_4.level_3;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class WhichNumberAreBigger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please, enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Please, enter third number: ");
        int thirdNumber = scanner.nextInt();


        if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
            System.out.println(firstNumber);
        }else if(firstNumber < secondNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber);
        }else if(firstNumber < secondNumber && secondNumber < thirdNumber){
            System.out.println(thirdNumber);
        }else{
            System.out.println("Numbers are equal");
        }

    }
}
