package com.javaguru.student_jekaterina_ola.lesson_6.level_1_intern;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.shouldBeEven();
        calculatorTest.shouldBeOdd();
    }

    public void shouldBeEven(){
        int number = 2;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Should be Even - OK");
        }else{
            System.out.println("Should be Even - FAIL");
        }
    }
    public void shouldBeOdd(){
        int number = 1;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("Should be Odd - OK");
        }else {
            System.out.println("Should be Odd - FAIL");
        }
    }
}
