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
        int result = 0;

        if (firstNumber == secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("First and second numbers are larger than third");
                result = firstNumber;
                return result;
            }
        }
        if (firstNumber == thirdNumber) {
            if (firstNumber > secondNumber) {
                System.out.println("First and third numbers are larger than second");
                result = firstNumber;
                return result;
            }
        }
        if(secondNumber == thirdNumber) {
            if (secondNumber > firstNumber) {
                System.out.println("Second and third numbers are larger than first");
                result = secondNumber;
                return result;
            }
        }
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            result = firstNumber;
            return result;
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            result = secondNumber;
            return result;
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            result = thirdNumber;
            return result;
        }
        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("Numbers are equal");
        }
        return result;
    }
}
