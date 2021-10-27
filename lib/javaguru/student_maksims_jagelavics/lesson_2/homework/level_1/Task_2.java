package com.javaguru.student_maksims_jagelavics.lesson_2.homework.level_1;

//Написать консольную программу, которая запрашивает у пользователя два вещественных числа
//(числа с запятой) и выводит на консоль результаты: сложения, вычитания, умножения и деления.
//Вещественные числа можно запрашивать с консоли используя объект Scanner
//следующим образом:
//
//    Scanner scanner = new Scanner(System.in);
//    double firstDoubleNumber = scanner.nextDouble();

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Locale;
import java.util.Scanner;
@CodeReview(approved = true)
public class Task_2 {

        public static void main(String[] args) {
            Scanner number = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Please enter first number:");
            double firstDoubleNumber = number.nextDouble();
            System.out.println("Please enter second number:");
            double secondDoubleNumber = number.nextDouble();
            double sumResult = firstDoubleNumber + secondDoubleNumber;
            double subtractResult = firstDoubleNumber - secondDoubleNumber;
            double multiplyResult = firstDoubleNumber * secondDoubleNumber;
            double divideResult = firstDoubleNumber / secondDoubleNumber;
            System.out.println("Sum result: " + sumResult);
            System.out.println("Subtract result: " + subtractResult);
            System.out.println("Multiply result: " + multiplyResult);
            System.out.println("Divide result: " + divideResult);
        }

}
