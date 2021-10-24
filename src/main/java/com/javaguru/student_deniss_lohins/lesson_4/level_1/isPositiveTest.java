package com.javaguru.student_deniss_lohins.lesson_4.level_1;

class isPositiveTest {


    public static void main(String[] args) {
        isPositiveTest testRunner = new isPositiveTest();
        //testRunner.shouldReturnError();
        testRunner.shouldReturnPositive();
        testRunner.shouldReturnNegative();
        testRunner.shouldReturnNegativeZerro();
    }

    private void shouldReturnPositive(){

        IsPositive victim = new IsPositive();

        int inputNumber = 10;

        if(victim.isPossitive(inputNumber)){
            System.out.println("ShouldReturnPositive:  Sucess");
        }else{
            System.err.println("ShouldReturnPossitive: FAILED");
        }
    }

    private void shouldReturnNegative(){
        IsPositive victim = new IsPositive();

        int inputNumber = -3;

        if (victim.isPossitive(inputNumber)){
            System.err.println("shouldReturnNegative: FAILED");
        }else{
            System.out.println("shouldReturnNegative: Sucess");
        }
    }


    private void shouldReturnNegativeZerro(){
        IsPositive victim = new IsPositive();

        int inputNumber = 0;

        if (victim.isPossitive(inputNumber)){
            System.err.println("shouldReturnNegativeZerro: FAILED");
        }else{
            System.out.println("shouldReturnNegativeZerro: Sucess");
        }
    }
}
