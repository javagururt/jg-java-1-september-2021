package com.javaguru.student_Olga_T.lesson_4.level_4.tasks_11_15;

class Calculator {
    public float numbersAddition(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public float numbersSubtraction(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public float numbersMultiplication(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }

    public float numbersDivision(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(float firstNumber) {
        if (firstNumber % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public float maxOfTwoNumbers(float firstNumber, float secondNumber) {
        if (firstNumber == secondNumber) {
            return -10000000;
        } else if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public float maxOfThreeNumbers(float firstNumber, float secondNumber, float thirdNumber) {
        float largest = firstNumber;
        if (secondNumber > largest) {
            largest = secondNumber;
        }
        if (thirdNumber > largest) {
            largest = thirdNumber;
        }
        return largest;
    }

}

