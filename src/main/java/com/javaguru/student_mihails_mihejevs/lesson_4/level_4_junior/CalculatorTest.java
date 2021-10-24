package com.javaguru.student_mihails_mihejevs.lesson_4.level_4_junior;
/*
Task12
Task13
Task14
Task15
 */

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest testRunner = new CalculatorTest();
        testRunner.shouldReturnSum();
        testRunner.shouldReturnSub();
        testRunner.shouldReturnDiv();
        testRunner.shouldReturnMul();
        testRunner.shouldReturnIsEven();
        testRunner.shouldReturnFirstIsMaxOfTwo();
        testRunner.shouldReturnSecondIsMaxOfTwo();
        testRunner.shouldReturnBothIsEqualOfTwo();
        testRunner.shouldReturnFirstIsMaxOfThree();
        testRunner.shouldReturnSecondIsMaxOfThree();
        testRunner.shouldReturnThirdIsMaxOfThree();
        testRunner.shouldReturnFirstSecondIsEgualMaxOfThree();
        testRunner.shouldReturnSecondThirdIsEgualMaxOfThree();
        testRunner.shouldReturnFirstThirdIsEgualMaxOfThree();
        testRunner.shouldReturnThreeIsEgualMaxOfThree();
    }

    private void shouldReturnSum() {
        Calculator aim = new Calculator();

        int firstNumber = 15;
        int secondNumber = 25;
        int expectedResult = 40;
        int actualResult = aim.sum(firstNumber, secondNumber);

        if (expectedResult==actualResult) {
            System.out.println("shouldReturnSum: SUCCESS");
        } else {
            System.out.println("shouldReturnSum: FAILED");
        }
    }
    private void shouldReturnSub() {
        Calculator aim = new Calculator();

        int firstNumber = 30;
        int secondNumber = 10;
        int expectedResult = 20;
        int actualResult = aim.subtract(firstNumber, secondNumber);

        if (expectedResult==actualResult) {
            System.out.println("shouldReturnSub: SUCCESS");
        } else {
            System.out.println("shouldReturnSub: FAILED");
        }
    }
    private void shouldReturnDiv() {
        Calculator aim = new Calculator();

        int firstNumber = 45;
        int secondNumber = 15;
        int expectedResult = 3;
        int actualResult = aim.divide(firstNumber, secondNumber);

        if (expectedResult==actualResult) {
            System.out.println("shouldReturnDiv: SUCCESS");
        } else {
            System.out.println("shouldReturnDiv: FAILED");
        }
    }
    private void shouldReturnMul() {
        Calculator aim = new Calculator();

        int firstNumber = 8;
        int secondNumber = 4;
        int expectedResult = 32;
        int actualResult = aim.multiply(firstNumber, secondNumber);

        if (expectedResult==actualResult) {
            System.out.println("shouldReturnMul: SUCCESS");
        } else {
            System.out.println("shouldReturnMul: FAILED");
        }
    }
    private void shouldReturnIsEven() {
        Calculator aim = new Calculator();

        int number = 15;
        boolean expectedResult = false;
        boolean actualResult = aim.isEven(number);

        if (expectedResult==actualResult) {
            System.out.println("shouldReturnIsEven: SUCCESS");
        } else {
            System.out.println("shouldReturnIsEven: FAILED");
        }
    }
    private void shouldReturnFirstIsMaxOfTwo() {
        Calculator aim = new Calculator();

        int firstNumber = 35;
        int secondNumber = 10;
        int expectedResult = 35;
        int actualResult = aim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnFirstIsMaxOfTwo: SUCCESS");
        } else {
            System.out.println("shouldReturnFirstIsMaxOfTwo: FAILED");
        }
    }
    private void shouldReturnSecondIsMaxOfTwo() {
        Calculator aim = new Calculator();

        int firstNumber = 15;
        int secondNumber = 25;
        int expectedResult = 25;
        int actualResult = aim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnSecondIsMaxOfTwo: SUCCESS");
        } else {
            System.out.println("shouldReturnSecondIsMaxOfTwo: FAILED");
        }
    }
    private void shouldReturnBothIsEqualOfTwo() {
        Calculator aim = new Calculator();

        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = aim.maxOfTwoNumbers(firstNumber, secondNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnBothIsEqualOfTwo: SUCCESS");
        } else {
            System.out.println("shouldReturnBothIsEqualOfTwo: FAILED");
        }
    }
    private void shouldReturnFirstIsMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 25;
        int secondNumber = 15;
        int thirdNumber = 5;
        int expectedResult = 25;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnFirstIsMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnFirstIsMaxOfThree: FAILED");
        }
    }
    private void shouldReturnSecondIsMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 25;
        int secondNumber = 35;
        int thirdNumber = 15;
        int expectedResult = 35;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnSecondIsMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnSecondIsMaxOfThree: FAILED");
        }
    }
    private void shouldReturnThirdIsMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 35;
        int secondNumber = 25;
        int thirdNumber = 45;
        int expectedResult = 45;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnThirdIsMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnThirdIsMaxOfThree: FAILED");
        }
    }
    private void shouldReturnFirstSecondIsEgualMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 55;
        int secondNumber = 55;
        int thirdNumber = 25;
        int expectedResult = 55;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnFirstSecondIsEqualMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnFirstSecondIsEqualMaxOfThree: FAILED");
        }
    }
    private void shouldReturnSecondThirdIsEgualMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 15;
        int secondNumber = 65;
        int thirdNumber = 65;
        int expectedResult = 65;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnSecondThirdIsEqualMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnSecondThirdIsEqualMaxOfThree: FAILED");
        }
    }
    private void shouldReturnFirstThirdIsEgualMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 75;
        int secondNumber = 35;
        int thirdNumber = 75;
        int expectedResult = 75;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnFirstThirdIsEqualMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnFirstThirdIsEqualMaxOfThree: FAILED");
        }
    }
    private void shouldReturnThreeIsEgualMaxOfThree() {
        Calculator aim = new Calculator();

        int firstNumber = 100;
        int secondNumber = 100;
        int thirdNumber = 100;
        int expectedResult = 100;
        int actualResult = aim.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

        if (expectedResult == actualResult) {
            System.out.println("shouldReturnThreeIsEqualMaxOfThree: SUCCESS");
        } else {
            System.out.println("shouldReturnThreeIsEqualMaxOfThree: FAILED");
        }
    }
}
