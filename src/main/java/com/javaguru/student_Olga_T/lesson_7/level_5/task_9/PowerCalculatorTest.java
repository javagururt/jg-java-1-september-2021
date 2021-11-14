package com.javaguru.student_Olga_T.lesson_7.level_5.task_9;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testPower();
    }

    public void testPower() {
        PowerCalculator testPowerOfNumber = new PowerCalculator();
        int result = testPowerOfNumber.power(4, 4);
        if (result == 256) {
            System.out.println("testPowerOfNumber TEST OK");
        } else {
            System.out.println("testPowerOfNumber FAIL");
        }
    }
}


