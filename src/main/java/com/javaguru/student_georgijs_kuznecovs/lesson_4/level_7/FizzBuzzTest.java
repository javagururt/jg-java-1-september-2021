package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_7;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzbuzzTest();
        fizzBuzzTest.fizzbuzzFailTest();
    }
    public void fizzTest() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (result.equals("Fizz")){
            System.out.println("Fizz test = OK");
        } else
            System.out.println("Fizz test = FAIL");

    }
    public void buzzTest() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (result.equals("Buzz")){
            System.out.println("Buzz test = OK");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }
    public void fizzbuzzTest() {
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (result.equals("FizzBuzz")){
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }
    public void fizzbuzzFailTest() {
        int number = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.detect(number);

        if (result.equals("" + number)){
            System.out.println("FizzBuzzFail test = OK ");
        } else {
            System.out.println("FizzBuzzFail test = FAIL");
        }
    }
}
