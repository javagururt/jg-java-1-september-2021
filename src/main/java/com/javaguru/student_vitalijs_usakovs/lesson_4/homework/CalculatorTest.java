package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.substractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenNumber1();
        calculatorTest.isEvenNumber2();
        calculatorTest.maxOfTwoNumbers();
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(calculator.number1, calculator.number2);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void substractionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.substraction(calculator.number1, calculator.number2);
        if (result == 5) {
            System.out.println("Substraction test = OK");
        } else {
            System.out.println("Substraction test = FAIL");
        }
    }

    public void divisionTest() {
        Calculator calculator = new Calculator();
        int result = calculator.division(calculator.number1, calculator.number2);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        int result = calculator.multiplication(calculator.number1, calculator.number2);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void isEvenNumber1() {
        Calculator calculator = new Calculator();
        boolean isTrue = calculator.isEvenNumber1(calculator.number1);
        if (isTrue == true) {
            System.out.println("First number is EVEN.");
        } else {
            System.out.println("First number is NOTEVEN.");
        }
    }

    public void isEvenNumber2() {
        Calculator calculator = new Calculator();
        boolean isTrue = calculator.isEvenNumber2(calculator.getNumber2());
        if (isTrue == true) {
            System.out.println("Second number is EVEN.");
        } else {
            System.out.println("Second number is NOTEVEN.");
        }
    }


    public void maxOfTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(calculator.number1, calculator.number2);
        if (result == calculator.number1) {
            System.out.println("First number is GREATER than the second number");
        } else if (result == calculator.number2) {
            System.out.println("Second number is GREATER than the first number");
        } else {System.out.println("Numbers are EQUAL");
        }
    }
/*
    public void maxOfThreeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(calculator.number1, calculator.number2, calculator.number3);
        */
}