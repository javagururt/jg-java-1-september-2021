package com.javaguru.student_deniss_lohins.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subs(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public boolean isEven(int firstNumber){
        if( firstNumber % 2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return firstNumber;
        }else if(firstNumber < secondNumber){
            return secondNumber;
        }else{
            System.err.println("Both numbers are equal!");
            return -9999;
        }
    }
    public int maxOfTreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else {
            return thirdNumber;
        }
    }
}
