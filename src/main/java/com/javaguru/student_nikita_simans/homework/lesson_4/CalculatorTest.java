package com.javaguru.student_nikita_simans.homework.lesson_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.subtractionTest();
        calculatorTest.isEvenTest();
        calculatorTest.returnAnyIfEven();
        calculatorTest.returnFirstAsMax();
        calculatorTest.returnSecondAsMax();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.err.println("Sum test = FAIL");
        }
    }
    public void divisionTest() {
        int firstNumber = 6;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Division test = OK");
        } else {
            System.err.println("Division test = FAIL");
        }
    }
    public void multiplicationTest() {
        int firstNumber = 5;
        int secondNumber = 7;
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 35) {
            System.out.println("Multiplication test = OK");
        } else {
            System.err.println("Multiplication test = FAIL");
        }
    }
    public void subtractionTest() {
        int firstNumber = 9;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 6) {
            System.out.println("Subtraction test = OK");
        } else {
            System.err.println("Subtraction test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 26;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result){
            System.out.println("isEven test = OK");
        } else {
            System.err.println("isEven test = FAIL");
        }
    }
    public void returnFirstAsMax() {
        int firstNumber = 5;
        int secondNumber = 1;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("returnFirstAsMax test = OK");
        } else {
            System.err.println("returnFirstAsMax test = FAIL");
        }
    }
    public void returnSecondAsMax() {
        int firstNumber = 1;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("returnSecondAsMax test = OK");
        } else {
            System.err.println("returnSecondAsMax test = FAIL");
        }
    }

    public void returnAnyIfEven() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("returnAnyIfEven test = OK");
        } else {
            System.err.println("returnAnyIfEven test = FAIL");
        }
    }
}
