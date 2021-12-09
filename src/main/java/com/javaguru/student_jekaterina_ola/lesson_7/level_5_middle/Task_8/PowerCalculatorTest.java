package com.javaguru.student_jekaterina_ola.lesson_7.level_5_middle.Task_8;

public class PowerCalculatorTest {
    public static void main (String[] args){
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testPower();
    }

    public void testPower(){
        PowerCalculator testPowerNumber = new PowerCalculator();
        int result = testPowerNumber.power(2, 3);
        if (result == 8){
            System.out.println("testPowerNumber - OK");
        } else {
            System.out.println("testPowerNumber - FAIL");
        }
    }
}
