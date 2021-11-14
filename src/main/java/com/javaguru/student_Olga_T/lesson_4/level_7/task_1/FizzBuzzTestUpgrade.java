package com.javaguru.student_Olga_T.lesson_4.level_7.task_1;

class FizzBuzzTestUpgrade {

    public static void main(String[] args) {
        FizzBuzzTestUpgrade fizzBuzzTest = new FizzBuzzTestUpgrade();
        fizzBuzzTest.fizzTest1();
        fizzBuzzTest.buzzTest2();
        fizzBuzzTest.fizzBuzzTest3();
        fizzBuzzTest.anotherNumberTest4();
    }

    public void fizzTest1() {
        FizzBuzz detect = new FizzBuzz();
        summaryTest(detect.detect(9).equals("Fizz"), "fizzTest1");
    }

    public void buzzTest2() {
        FizzBuzz detect = new FizzBuzz();
        summaryTest(detect.detect(10).equals("Buzz"), "buzzTest2");
    }

    public void fizzBuzzTest3() {
        FizzBuzz detect = new FizzBuzz();
        summaryTest(detect.detect(30).equals("FizzBuzz"), "fizzBuzzTest3");
    }

    public void anotherNumberTest4() {
        FizzBuzz detect = new FizzBuzz();
        summaryTest(detect.detect(1).equals("1"), "anotherNumberTest4");
    }

    private void summaryTest(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

}
