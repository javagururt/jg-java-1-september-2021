package com.javaguru.student_nikita_simans.homework.lesson_4;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.isFizzTest();
        fizzBuzzTest.isBuzzTest();
        fizzBuzzTest.isFizzBuzzTest();
        fizzBuzzTest.returnNumberTest();
    }
    public void isFizzTest() {
        System.out.println("isFizzTest " + universalTester(9, "Fizz"));
    }
    public void isBuzzTest() {
        System.out.println("isBuzzTest " + universalTester(25, "Buzz"));
    }
    public void isFizzBuzzTest() {
        System.out.println("isFizzBuzzTest " + universalTester(15, "FizzBuzz"));
    }
    public void returnNumberTest() {
        System.out.println("returnNumberTest " + universalTester(4, "4"));
    }


    public String universalTester(int number, String mustType) {
        FizzBuzz target = new FizzBuzz();
        if (target.detect(number).equals(mustType)) {
            return "OK";
        } else {
            return "FAIL";
        }
    }
}
