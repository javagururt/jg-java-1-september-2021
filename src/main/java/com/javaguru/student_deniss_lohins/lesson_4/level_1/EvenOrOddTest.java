package com.javaguru.student_deniss_lohins.lesson_4.level_1;

class EvenOrOddTest {

    public static void main(String[] args) {
        EvenOrOddTest testRunner = new EvenOrOddTest();
        testRunner.shouldReturnEven();
        testRunner.shouldReturnOdd();
    }



    private void shouldReturnEven(){
        EvenOrOdd victim = new EvenOrOdd();
         int inputNumber = 47390;


         if (victim.isEven(inputNumber)){
             System.out.println("shouldReturnEven: Sucess!");
         }else{
             System.err.println("shouldReturnEven: FAILED!");
         }
    }
    private void shouldReturnOdd(){
        EvenOrOdd victim = new EvenOrOdd();

        int inputNumber = 456871;



        if (victim.isEven(inputNumber)){
            System.err.println("shouldReturnOdd: FAILED!");
        }else{
            System.out.println("shouldReturnOdd: Sucess!");
        }
    }
}
