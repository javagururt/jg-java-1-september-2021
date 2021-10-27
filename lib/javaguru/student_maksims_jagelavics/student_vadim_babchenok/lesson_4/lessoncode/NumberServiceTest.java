package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

class NumberServiceTest {

    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.shouldReturnAnyIfNumbersEqual();
        testRunner.shouldReturnFirstAsMaxNumber();
        testRunner.shouldReturnSecondAsMaxNumber();
    }

    private void shouldReturnAnyIfNumbersEqual() {
        NumberService victim = new NumberService();

        int firstNumber = 10;
        int secondNumber = 10;

        int expected = 10;

        int actual = victim.maxOf(firstNumber, secondNumber);

        if (expected == actual) {
            System.out.println("shouldReturnAnyIfNumbersEqual: SUCCESS");
        } else {
            System.err.println("shouldReturnAnyIfNumbersEqual: FAILED");
        }
    }

    private void shouldReturnFirstAsMaxNumber() {
        NumberService victim = new NumberService();

        int firstNumber = 20;
        int secondNumber = 10;

        int expected = 20;

        int actual = victim.maxOf(firstNumber, secondNumber);

        if (expected == actual) {
            System.out.println("shouldReturnFirstAsMaxNumber: SUCCESS");
        } else {
            System.err.println("shouldReturnFirstAsMaxNumber: FAILED");
        }
    }

    private void shouldReturnSecondAsMaxNumber() {
        NumberService victim = new NumberService();

        int firstNumber = 10;
        int secondNumber = 30;

        int expected = 30;

        int actual = victim.maxOf(firstNumber, secondNumber);

        if (expected == actual) {
            System.out.println("shouldReturnSecondAsMaxNumber: SUCCESS");
        } else {
            System.err.println("shouldReturnSecondAsMaxNumber: FAILED");
        }
    }
}
