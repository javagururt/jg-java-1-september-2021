package com.javaguru.student_nikita_simans.homework.lesson_7.Level_5;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.returnOneIsPowerIsZero();
        test.returnFractionIfPowerIsNegative();
        test.returnIntegerIfPowerIsPositive();
    }

    public void returnOneIsPowerIsZero() {
        PowerCalculator target = new PowerCalculator();
        if (target.power(6, 0) == 1.0) {
            System.out.println("returnOneIsPowerIsZero test OK");
        } else {
            System.out.println("returnOneIsPowerIsZero FAIL");
        }

    }

    public void returnFractionIfPowerIsNegative() {
        PowerCalculator target = new PowerCalculator();
        if (target.power(3, -2) == 1.0 / 9) {
            System.out.println("returnOneIsPowerIsZero test OK");
        } else {
            System.out.println("returnOneIsPowerIsZero FAIL");
        }

    }

    public void returnIntegerIfPowerIsPositive() {
        PowerCalculator target = new PowerCalculator();
        if (target.power(3, 2) == 9) {
            System.out.println("returnOneIsPowerIsZero test OK");
        } else {
            System.out.println("returnOneIsPowerIsZero FAIL");
        }

    }
}
