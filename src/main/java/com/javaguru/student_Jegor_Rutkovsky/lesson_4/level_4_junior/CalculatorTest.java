package com.javaguru.student_Jegor_Rutkovsky.lesson_4.level_4_junior;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEventTest();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();

    }
    public void sumTest(){
        int firstNumber = 12;
        int secondNumber = 11;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 23){
            System.out.println("SUM TEST PASSED");
        }
        else {
            System.err.println("SUM TEST FAILED");
        }
    }
    public void subtractionTest(){
        int firstNumber = 20;
        int secondNumber = 10;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 10){
            System.out.println("SUBTRACTION TEST PASSED");
        }
        else {
            System.err.println("SUBTRACTION TEST FAIL");
        }
    }
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 5);
        if (result == 25){
            System.out.println("MULTIPLY TEST PASSED");
        }
        else {
            System.err.println("MULTIPLY TEST FAILED");
        }
    }
    public void divisionTest(){
        Calculator calculator = new Calculator();
        int result = calculator.division(20, 10);
        if (result == 2){
            System.out.println("DIVISION TEST PASSES");
        }
        else {
            System.err.println("DIVISION TEST FAILED");
        }
    }
    public void isEventTest(){
        Calculator calculator = new Calculator();
        boolean result = calculator.isEvent(20, 2);
        if (result){
            System.out.println("isEvent TEST PASSED");
        }
        else {
            System.err.println("isEvent TEST FAILED");
        }
    }
    public void maxOfTwoNumbersTest1(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(20, 10);
        if (result == 20){
            System.out.println("maxOfTwoNumbersFirstNumberBiggest TEST PASSED");
        }
        else {
            System.err.println("maxOfTwoNumbersFirstNumberBiggest TEST FAILED");
        }
    }
    public void maxOfTwoNumbersTest2(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(10, 20);
        if (result == 20){
            System.out.println("maxOfTwoNumbersSecondNumberBiggest TEST PASSED");
        }
        else {
            System.err.println("maxOfTwoNumbersSecondNumberBiggest TEST FAILED");
        }
    }
    public void maxOfTwoNumbersTest3(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfTwoNumbers(10, 10);
        if (result == 10){
            System.out.println("maxOfTwoNumbersEquals TEST PASSED");
        }
        else {
            System.err.println("maxOfTwoNumbersEquals TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest1(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(3,2,1);
        int expected = 3;
        if (result == expected){
            System.out.println("FirstNumberMax TEST PASSED");
        }
        else {
            System.err.println("FirstNumberMax TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest2(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(2,3,1);
        int expected = 3;
        if (result == expected){
            System.out.println("SecondNumberMax TEST PASSED");
        }
        else {
            System.err.println("SecondNumberMax TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest3(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(1,2,3);
        int expected = 3;
        if (result == expected){
            System.out.println("ThirdNumberMax TEST PASSED");
        }
        else {
            System.err.println("ThirdNumberMax TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest4(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(2,2,1);
        int expected = 2;
        if (result == expected){
            System.out.println("FirstTwoNumbersEquals TEST PASSED");
        }
        else {
            System.err.println("FirstTwoNumbersEquals TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest5(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(1,2,2);
        int expected = 2;
        if (result == expected){
            System.out.println("LastTwoNumberEquals TEST PASSED");
        }
        else {
            System.err.println("LastTwoNumbersEquals TEST FAILED");
        }
    }
    public void maxOfThreeNumbersTest6(){
        Calculator calculator = new Calculator();
        int result = calculator.maxOfThreeNumbers(1,1,1);
        int expected = 1;
        if (result == expected){
            System.out.println("AllNumbersEquals TEST PASSED");
        }
        else {
            System.err.println("AllNumbersEquals TEST FAILED");
        }
    }
}
