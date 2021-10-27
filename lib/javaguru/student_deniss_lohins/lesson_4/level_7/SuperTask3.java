package com.javaguru.student_deniss_lohins.lesson_4.level_7;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

/*Дан класс Calculator и его тест CalculatorTest.
        Найдите способ упростить тесты в CalculatorTest.

        Тесты тоже должны быть написаны как можно лучше и качественнее!
        Дублирование кода - это почти всегда плохая идея в программировании.
        Поэтому от дублирования кода нужно избавляться.

        Подсказка: вынесите в отдельный метод проверку
        результата и замените её вызовом метода в каждом тесте.*/
@CodeReview(approved = true)
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}


class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public int firstNumber = 40;
    public int secondNumber = 5;

    public void sumTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        checkResults(result == 45, "sumTest");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        checkResults(result == 35, "subTest");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        checkResults(result == 200, "mulTest");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        checkResults(result == 8, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        checkResults(result, "isEvenTest1");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(secondNumber);
        checkResults(result != true, "isEvenTest2");
    }

    public void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.err.println(testName + " = FAIL");
        }
    }
}

class SuperTask3 {
}
