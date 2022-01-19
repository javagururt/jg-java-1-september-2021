package com.javaguru.student_nikita_simans.homework.lesson_7.Level_5;

public class PowerCalculator {
    public double power(int number, int power) {
        double result = 1.00;
        if (power >= 0) {
            for (int i = 0; i < power; i++) {
                result = result * number;
            }
        } else {
            for (int i = 0; i < Math.abs(power); i++) {
                result = result / number;
            }
        }
        return result;
    }
}
