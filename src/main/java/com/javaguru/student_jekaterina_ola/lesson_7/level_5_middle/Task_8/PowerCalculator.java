package com.javaguru.student_jekaterina_ola.lesson_7.level_5_middle.Task_8;

import com.javaguru.teacher.codereview.CodeReview;

//для возведения заданного числа в указанную степень.
//        Название метода, список параметров и тип возвращаемого значения
//Математическую операцию реализовать с использованием цикла.
//        Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
@CodeReview(approved = true)
public class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.power(7, 5);
    }

    public int power(int number, int powerNumber) {
        int result = 1;
        for (int i = 1; i <= powerNumber; i++) {
            result = result * number;
        }
        System.out.println(number + " ^ " + powerNumber + " = " + result + ".");
        return result;
    }
}