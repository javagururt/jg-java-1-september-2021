package com.javaguru.teacher.lesson_3.lessoncode;

class SimpleCalculatorApp {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        int operationResult = calculator.multiply(5, 10);
        System.out.println("Operation result: " + operationResult);

        int firstResult = calculator.multiply(10, 10);
        int finalResult = calculator.multiply(firstResult, operationResult);

        System.out.println("Final result: " + finalResult);
    }
}
