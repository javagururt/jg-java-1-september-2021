package com.javaguru.student_vitalijs_usakovs.lesson_2.Homework.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class task_2 {
        public static void main(String[] args){
            System.out.println("Hi, Please enter your lucky number: ");
            Scanner input = new Scanner(System.in);
            double firstDoubleNumber = input.nextDouble();
            System.out.println("And now enter random number: ");
            double secondDoubleNumber = input.nextDouble();

            double summResult = firstDoubleNumber + secondDoubleNumber;
            double substractResult = firstDoubleNumber - secondDoubleNumber;
            double divideResult = firstDoubleNumber / secondDoubleNumber;
            double multiplyResult = firstDoubleNumber * secondDoubleNumber;

            System.out.println("Summ Result :" + summResult);
            System.out.println("Subtract Result : " + substractResult);
            System.out.println("Divide Result : " + divideResult);
            System.out.println("Multiply Result : " + multiplyResult);
        }

    }