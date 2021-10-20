package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_4;

class Calculator {


    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber){
        //    System.out.println("The greatest is First number");
            return firstNumber;
        } else if(firstNumber < secondNumber){
        //    System.out.println("The greatest is Second number");
            return secondNumber;
        } else
        //    System.out.println("Numbers are equal");
            return firstNumber - secondNumber;
    }

    public int maxOfThreeNumbers(int firstNum, int secondNum, int thirdNum){
        if (firstNum > secondNum && firstNum > thirdNum){
        //    System.out.println("The greatest number is: " + firstNum);
            return firstNum;
        } else if (firstNum == secondNum && firstNum > thirdNum){
        //    System.out.println("The greatest number is: " + firstNum);
            return firstNum - secondNum;
        } else if (firstNum == thirdNum && firstNum > secondNum){
        //    System.out.println("The greatest number is: " + firstNum);
            return firstNum - thirdNum;
        } else if (secondNum > firstNum && secondNum > thirdNum){
        //    System.out.println("The greatest number is: " + secondNum);
            return secondNum;
        } else if (firstNum == secondNum && secondNum > thirdNum){
        //    System.out.println("The greatest number is: " + secondNum);
            return secondNum - firstNum;
        } else if (secondNum == thirdNum && secondNum > firstNum){
        //    System.out.println("The greatest number is: " + secondNum);
            return secondNum - thirdNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
        //    System.out.println("The greatest number is: " + thirdNum);
            return thirdNum;
        } else if (firstNum == thirdNum && thirdNum > secondNum){
        //    System.out.println("The greatest number is: " + thirdNum);
            return thirdNum - firstNum;
        } else if (secondNum == thirdNum && thirdNum > firstNum){
        //    System.out.println("The greatest number is: " + thirdNum);
            return thirdNum - firstNum;
        } else
        //    System.out.println("Numbers are equal");
            return firstNum + secondNum + thirdNum - firstNum - secondNum - thirdNum;

    }
}
