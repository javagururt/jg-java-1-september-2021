package com.javaguru.student_deniss_lohins.lesson_4.level_1;

class isPositiveTest {


    public static void main(String[] args) {
        isPositiveTest testRunner = new isPositiveTest();
        //testRunner.shouldReturnError();
        testRunner.shouldReturnPositive();
        testRunner.shouldReturnNegative();
        testRunner.shouldReturnZerro();
    }

    private void shouldReturnPositive(){

        IsPositive victim = new IsPositive();

        int inputNumber = 10;

        int expected = 1;

        int actual = victim.isPossitive(inputNumber);
        if(expected == actual){
            System.out.println("ShouldReturnPositive:  Sucess");
        }else{
            System.err.println("ShouldReturnPossitive: FAILED");
        }
    }

    private void shouldReturnNegative(){
        IsPositive victim = new IsPositive();

        int inputNumber = -3;

        int expected = -1;

        int actual = victim.isPossitive(inputNumber);

        if (expected == actual){
            System.out.println("shouldReturnNegative: Sucess");
        }else{
            System.err.println("shouldReturnNegative: FAILED");
        }
    }

   /* private void shouldReturnError(){
        IsPositive victim = new IsPositive();

        int inputNumber = 99.99;

        int expected = 9;

        int actual = victim.isPossitive(inputNumber);

        if (expected == actual){
            System.out.println("shouldReturnError: Sucess");
        }else{
            System.err.println("shouldReturnError: FAILED");
        }
    }  */

    private void shouldReturnZerro(){
        IsPositive victim = new IsPositive();

        int inputNumber = 0;

        int expected = 0;

        int actual = victim.isPossitive(inputNumber);

        if (expected == actual){

            System.out.println("shouldReturnZerro: Sucess");
        }else{
            System.err.println("shouldReturnZerro: FAILED");
        }
    }
}
