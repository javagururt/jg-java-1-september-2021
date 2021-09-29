package com.javaguru.student_maksims_jagelavics.lesson_2.homework;

import java.util.Locale;
import java.util.Scanner;

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
