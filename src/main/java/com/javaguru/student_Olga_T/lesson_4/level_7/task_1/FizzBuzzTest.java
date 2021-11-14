package com.javaguru.student_Olga_T.lesson_4.level_7.task_1;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest1();
        fizzBuzzTest.buzzTest2();
        fizzBuzzTest.fizzBuzzTest3();
        fizzBuzzTest.anotherNumberTest4();
    }

    public void fizzTest1() {
        FizzBuzz detect = new FizzBuzz();
        String checkFizz = detect.detect(9);
        if (checkFizz == "Fizz") {
            System.out.println("fizzTest1 OK");
        } else {
            System.out.println("fizzTest1 FAIL");
        }
    }

    public void buzzTest2() {
        FizzBuzz detect = new FizzBuzz();
        String checkBuzz = detect.detect(10);
        if (checkBuzz == "Buzz") {
            System.out.println("buzzTest2 OK");
        } else {
            System.out.println("buzzTest2 FAIL");
        }
    }

    public void fizzBuzzTest3() {
        FizzBuzz detect = new FizzBuzz();
        String checkFizzBuzz = detect.detect(30);
        if (checkFizzBuzz == "FizzBuzz") {
            System.out.println("fizzBuzzTest3 OK");
        } else {
            System.out.println("fizzBuzzTest3 FAIL");
        }
    }

    public void anotherNumberTest4() {
        FizzBuzz detect = new FizzBuzz();
        String checkAnotherNumberTest4 = detect.detect(1);
        if (checkAnotherNumberTest4.equals("1")) {
            System.out.println("anotherNumberTest4 OK");
        } else {
            System.out.println("anotherNumberTest4 FAIL");
        }

    }


}

