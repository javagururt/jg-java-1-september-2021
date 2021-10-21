package com.javaguru.student_vadim_babchenok.lesson4_home.task_10;

import java.util.Scanner;

/*Написать программу, которая запрашивает у пользователя
        три целых числа и выводит на консоль наибольшее из них.

        PS: перед решением этой задачи распишите на бумаге
        или в комментарии все возможные варианты (комбинации).
        Это поможет вам правильно написать программу!
        Нельзя пользоваться классом Math.*/
public class TheGreatestValue {
    public static void main(String[] args) {
        System.out.println("Enter three numbers and press start!");
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        System.out.println("Please enter second int number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third int number:");
        int thirdNumber = input.nextInt();
        String result;

        if (firstNumber > secondNumber && firstNumber > thirdNumber ) {
            result = "value " + firstNumber + " more than others";
        } else if ( secondNumber > firstNumber && secondNumber > thirdNumber ) {
            result = "value " + secondNumber + " more than others";
        } else {
            result = "value " + thirdNumber + " more than others";
        }

        System.out.println(result);
    }

}
