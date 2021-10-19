package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.greatestTest();
        calculatorTest.greatestTest2();
        calculatorTest.greatestTest3();
        calculatorTest.greatestOfThreeTest();
        calculatorTest.greatestOfThreeTest2();
        calculatorTest.greatestOfThreeTest3();
        calculatorTest.greatestOfThreeTest4();
        calculatorTest.greatestOfThreeTest5();
        calculatorTest.greatestOfThreeTest6();
        calculatorTest.greatestOfThreeTest7();
        calculatorTest.greatestOfThreeTest8();
        calculatorTest.greatestOfThreeTest9();
        calculatorTest.greatestOfThreeTest10();
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
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mult(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void isEvenTest(){
        int number = 9;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if ((result == true && number % 2 == 0) || (result == false && number % 2 != 0)) {
            System.out.println("EvenOdd test = OK");
        }else {
            System.out.println("EvenOdd test = FAIL");
        }
    }

    public void greatestTest(){
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber){
            System.out.println("Greatest number 1 test = OK");
        } else {
            System.out.println("Greatest number 1 test = FAIL");
        }
    }

    public void greatestTest2(){
        int firstNumber = 5;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber){
            System.out.println("Greatest number 2 test = OK");
        } else {
            System.out.println("Greatest number 2 test = FAIL");
        }
    }

    public void greatestTest3(){
        int firstNumber = 10;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 0){
            System.out.println("Equal number test = OK");
        } else {
            System.out.println("Equal number test = FAIL");
        }
    }

    public void greatestOfThreeTest(){  // 1 is greatest
        int firstNum = 10;
        int secondNum = 7;
        int thirdNum = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == firstNum){
            System.out.println("Greatest of three number test = OK");
        }else {
            System.out.println("Greatest of three number test = FAIL");
        }
    }

    public void greatestOfThreeTest2(){     // 1 = 2 and more than 3
        int firstNum = 10;
        int secondNum = 10;
        int thirdNum = 5;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && firstNum > thirdNum){
            System.out.println("Greatest of three number 2 test = OK");
        }else {
            System.out.println("Greatest of three number 2 test = FAIL");
        }
    }

    public void greatestOfThreeTest3(){     // 1 = 3 and more than 2
        int firstNum = 10;
        int secondNum = 5;
        int thirdNum = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && firstNum > secondNum){
            System.out.println("Greatest of three number 3 test = OK");
        }else {
            System.out.println("Greatest of three number 3 test = FAIL");
        }
    }

    public void greatestOfThreeTest4(){     // 2 is greatest
        int firstNum = 15;
        int secondNum = 30;
        int thirdNum = 20;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == secondNum){
            System.out.println("Greatest of three number 4 test = OK");
        }else {
            System.out.println("Greatest of three number 4 test = FAIL");
        }
    }

    public void greatestOfThreeTest5(){     // 2 = 1 and more than 3
        int firstNum = 15;
        int secondNum = 15;
        int thirdNum = 10;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && secondNum > thirdNum){
            System.out.println("Greatest of three number 5 test = OK");
        }else {
            System.out.println("Greatest of three number 5 test = FAIL");
        }
    }

    public void greatestOfThreeTest6(){     // 2 = 3 and more than 1
        int firstNum = 10;
        int secondNum = 15;
        int thirdNum = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && secondNum > firstNum){
            System.out.println("Greatest of three number 6 test = OK");
        }else {
            System.out.println("Greatest of three number 6 test = FAIL");
        }
    }

    public void greatestOfThreeTest7(){     // 3 is greatest
        int firstNum = 15;
        int secondNum = 15;
        int thirdNum = 25;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == thirdNum){
            System.out.println("Greatest of three number 7 test = OK");
        }else {
            System.out.println("Greatest of three number 7 test = FAIL");
        }
    }

    public void greatestOfThreeTest8(){     // 3 = 1 and more than 2
        int firstNum = 15;
        int secondNum = 5;
        int thirdNum = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && thirdNum > secondNum){
            System.out.println("Greatest of three number 8 test = OK");
        }else {
            System.out.println("Greatest of three number 8 test = FAIL");
        }
    }

    public void greatestOfThreeTest9(){     // 3 = 2 and more than 1
        int firstNum = 5;
        int secondNum = 15;
        int thirdNum = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && thirdNum > firstNum){
            System.out.println("Greatest of three number 9 test = OK");
        }else {
            System.out.println("Greatest of three number 9 test = FAIL");
        }
    }

    public void greatestOfThreeTest10(){     // Numbers are equal
        int firstNum = 15;
        int secondNum = 15;
        int thirdNum = 15;
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(firstNum, secondNum, thirdNum);
        if (result == 0 && firstNum == secondNum && secondNum == thirdNum){
            System.out.println("Greatest of three number 10 test = OK");
        }else {
            System.out.println("Greatest of three number 10 test = FAIL");
        }
    }
}
