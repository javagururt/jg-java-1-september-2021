package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson4_home.task_7;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        два целых числа и выводит на консоль:
        - "Numbers are equals" - если числа равны
        - "Numbers are different" - если числа не равны*/
@CodeReview(approved = true)
public class NumberAntEqual {
    public static void main(String[] args) {
        System.out.println("Enter two numbers and press start!");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int numberTwo = input.nextInt();

        if (number == numberTwo) {
            System.out.println("Numbers are equals");
        }

        else if (number > numberTwo){
            System.out.println("Numbers are different");
        }

        else {
            System.out.println("Numbers are different");
        }



    }
}
