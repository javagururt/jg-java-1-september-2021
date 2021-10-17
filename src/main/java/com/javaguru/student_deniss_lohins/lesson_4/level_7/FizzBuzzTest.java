package com.javaguru.student_deniss_lohins.lesson_4.level_7;

import java.lang.reflect.Array;
import java.util.Arrays;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest testRunner = new FizzBuzzTest();
        testRunner.BuzzTest();
        testRunner.FizzTest();
        testRunner.FizzBuzzTest();
        testRunner.returnNumber();
    }

    public void FizzTest(){
        int min = -999;
        int max = 999;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInput = randomInt * 3;
        FizzBuzz victim = new FizzBuzz();
        String testResult = victim.detect(testInput);
        if(testResult == "Fizz"){
            System.out.println("Fizz test = OK");
        }else{
            System.err.println("Fizz test = FAIL");
        }
    }

    public void BuzzTest(){
        int min = -999;
        int max = 999;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInput = randomInt * 5;
        FizzBuzz victim = new FizzBuzz();
        String testResult = victim.detect(testInput);
        if(testResult == "Buzz"){
            System.out.println("Buzz test = OK");
        }else{
            System.err.println("Buzz test = FAIL");
        }
    }

    public void FizzBuzzTest(){
        int min = -999;
        int max = 999;
        int randomInt = (int)Math.floor(Math.random()*(max-min+1)+min);
        int testInput = randomInt * 3*5;
        FizzBuzz victim = new FizzBuzz();
        String testResult = victim.detect(testInput);
        if(testResult == "FizzBuzz"){
            System.out.println("FizzBuzz test = OK");
        }else{
            System.err.println("FizzBuzz test = FAIL");
        }
    }

    public void returnNumber(){
        FizzBuzz victim = new FizzBuzz();
        int number = 11;
        //String expectedResult = String.valueOf(number);
        String testResult = victim.detect(number);
        if(testResult == String.valueOf(number)){
            System.out.println("Number output test = OK");
        }else{
            System.err.println("Number output test = FAIL");
        }
    }
}
