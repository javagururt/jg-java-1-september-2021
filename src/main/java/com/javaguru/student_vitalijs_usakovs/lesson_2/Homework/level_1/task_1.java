package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_1 {
    public static void main(String[] args){
        System.out.println("Hi, Please enter your lucky number: ");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("And now enter random number: ");
        int secondNumber = input.nextInt();

        int summResult = firstNumber + secondNumber;
        int substractResult = firstNumber - secondNumber;
        int divideResult = firstNumber / secondNumber;
        int multiplyResult = firstNumber * secondNumber;

        System.out.println("Summ Result :" + summResult);
        System.out.println("Subtract Result : " + substractResult);
        System.out.println("Divide Result : " + divideResult);
        System.out.println("Multiply Result : " + multiplyResult);
    }

}
