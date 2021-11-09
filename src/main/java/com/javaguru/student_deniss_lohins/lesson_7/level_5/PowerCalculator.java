package com.javaguru.student_deniss_lohins.lesson_7.level_5;

import java.math.BigDecimal;

class PowerCalculator {

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
