package com.javaguru.student_vladislav_savickis.lesson_4.homework.level_4_junior;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber) {
            if (firstNumber > thirdNumber) {
                return firstNumber;
            }
        }
        if (firstNumber == thirdNumber) {
            if (firstNumber > secondNumber) {
                return  firstNumber;
            }
        }
        if(secondNumber == thirdNumber) {
            if (secondNumber > firstNumber) {
                return secondNumber;
            }
        }
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            return firstNumber;
        }else {
            return 0;
        }
    }
}
