package com.javaguru.student_vadim_babchenok.lesson4_home.task11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest1();
        calculatorTest.subTest2();
        calculatorTest.divTest3();
        calculatorTest.mulTest4();
        calculatorTest.isEven5();
        calculatorTest.maxOfTwoNumbers6();
        calculatorTest.maxOfThreeNumbers7();
    }

    public void sumTest1() {

        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result != 15) {
            System.out.println("Sum test = FAIL");
        } else {
            System.out.println("Sum test = OK");
        }
    }

    public void subTest2() {
        int firstNumber = 30;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 20) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void divTest3() {
        int firstNumber = 100;
        int secondNumber = 2;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void mulTest4() {
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 100) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void isEven5() {
        int firstNumber = 8;
        int secondNumber = 3;
        Calculator calculator = new Calculator();
        boolean result1 = calculator.isEven(firstNumber);
        boolean result2 = calculator.isEven(secondNumber);

        if (result1 == true) {
            System.out.println("Test isEven = OK");
        } else {
            System.out.println("Test isEven = FALSE");
        }

        if (result2 == false) {
            System.out.println("Test isEven = OK");
        } else {
            System.out.println("Test isEven = FALSE");
        }
    }

    public void maxOfTwoNumbers6() {
        int firstNumber = 170;
        int secondNumber = 170;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (result == 170) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbers7() {
        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 30;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  //10 20 30 => 30
        if (result == 30) {  // esli pravilno
            System.out.println("maxOfThreeNumbers test = OK");
        } else {
            System.out.println("maxOfThreeNumbers test = fail");
        }
    }
}