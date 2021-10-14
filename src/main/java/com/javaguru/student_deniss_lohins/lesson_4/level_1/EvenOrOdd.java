package com.javaguru.student_deniss_lohins.lesson_4.level_1;

class EvenOrOdd {

    int number;

    int dividing(int number){
        int resultOfCalculation = number % 2;
        return resultOfCalculation;
    }

    int isEven(int number){
        if (dividing(number) == 0){
            System.out.println("Number is even");
            return 2;
        }else{
            System.out.println("Number is odd");
            return 1;
        }
    }
}
