package com.javaguru.student_Olga_T.lesson_6.level_1.task_1;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.shouldBeEven();
        calculatorTest.shouldBeOdd();
    }


    public void shouldBeEven() {
        int number = 60;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("shouldBeEven test = OK");
        } else {
            System.out.println("shouldBeEven test = FAIL");
        }
    }

    public void shouldBeOdd() {
        int number = 61;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (!result) {
            System.out.println("shouldBeOdd test = OK");
        } else {
            System.out.println("shouldBeOdd test = FAIL");
        }
    }


}
