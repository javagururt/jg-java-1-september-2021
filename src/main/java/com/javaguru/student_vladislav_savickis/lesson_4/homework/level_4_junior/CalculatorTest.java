package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_4_junior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
    }

    public void sumTest() {
        int firstNumber = 60;
        int secondNumber = 9;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 69) {
            System.out.println("Sum test = OK");
        } else {
            System.err.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 15;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Subtract test = OK");
        } else {
            System.err.println("Subtract test = FAIL");
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
            System.err.println("Multiply test = FAIL");
        }
    }

    public void divideTest(){
        int firstNumber = 15;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.divide(firstNumber, secondNumber);
        if (result == 3) {
            System.out.println("Divide test = OK");
        } else {
            System.err.println("Divide test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 4;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Number is even test = OK");
        } else {
            System.err.println("Number is even test = FAIL");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("First number is larger than second number test = OK");
        } else {
            System.err.println("First number is larger than second test number = FAIL");
        }
        if (result == 11){
            System.out.println("Second number is larger than first number test = OK");
        } else {
            System.err.println("Second number is larger than first number test = FAIL");
        }
        if (result == 5) {
            System.out.println("Two numbers are equal test = OK");
        } else {
            System.err.println("Two numbers are equal test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 9;
        int secondNumber = 11;
        int thirdNumber = 11;
        Calculator calculator = new Calculator();
        int victim = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (victim == 10) {
            System.out.println("First number is larger than second and third number test = OK");
        }
        else {
            System.err.println("First number is larger than second and third number test = FAIL");
        }
        if (victim == 8) {
            System.out.println("Second number is larger than first and third number test = OK");
        } else {
            System.err.println("Second number is larger than first and third number test = FAIL");
        }
        if (victim == 9) {
            System.out.println("Third number is larger than first and second number test = OK");
        } else {
            System.err.println("Third number is larger than first and second number test = FAIL");
        }
        if (victim == 1) {
            System.out.println("Three numbers are equal test = OK");
        } else {
            System.err.println("Three numbers are equal test = FAIL");
        }
        if (victim == 5) {
            System.out.println("First and second numbers are larger than third number test = OK");
        } else {
            System.err.println("First and second numbers are larger than third number test = FAIL");
        }
        if (victim == 7) {
            System.out.println("First and third numbers are larger than second number test = OK");
        } else {
            System.err.println("First and third numbers are larger than second number test = FAIL");
        }
        if (victim == 11) {
            System.out.println("Second and third numbers are larger than first number test = OK");
        } else {
            System.err.println("Second and third numbers are larger than first number test = FAIL");
        }
    }
}
