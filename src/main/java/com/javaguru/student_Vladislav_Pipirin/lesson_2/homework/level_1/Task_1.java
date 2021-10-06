package com.javaguru.student_Vladislav_Pipirin.lesson_2.homework.level_1;

import com.javaguru.teacher.review.CodeReview;

import java.util.Scanner;

//Написать консольную программу, которая запрашивает у пользователя два целых числа и
//выводит на консоль результаты: сложения, вычитания, умножения и деления.
@CodeReview(approved = true)
public class Task_1 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Введите первое число: ");
        int firstNumber = input.nextInt();
        System.out.println(" Введите второе число: ");
        int secondNumber = input.nextInt();
        int sumNumber = firstNumber + secondNumber;
        int subtractNumber = firstNumber - secondNumber;
        int multiplyNumber = firstNumber * secondNumber;
        int divideNumber = firstNumber / secondNumber;
        System.out.println("Сумма: " + sumNumber);
        System.out.println("Вычитание: " + subtractNumber);
        System.out.println("Умножение: " + multiplyNumber);
        System.out.println("Деление: " + divideNumber);


    }

}

