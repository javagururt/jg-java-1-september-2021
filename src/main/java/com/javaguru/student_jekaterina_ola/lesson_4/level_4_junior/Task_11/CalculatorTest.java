package com.javaguru.student_jekaterina_ola.lesson_4.level_4_junior.Task_11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfTwoNumbersTest(10, 5);
        calculatorTest.maxOfTwoNumbersTest(5, 15);
        calculatorTest.maxOfTwoNumbersTest(10, 10);
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }

    public void evenTest() {
        int number = 1;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Even or Odd test: True");
        } else {
            System.out.println("Even or Odd test: False");
        }
    }

    public void maxOfTwoNumbersTest(int firstNumber, int secondNumber) {
        Calculator calculator = new Calculator();
        String result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        System.out.println("Test result: " + result);
    }

}