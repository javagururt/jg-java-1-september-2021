package com.javaguru.student_vitalijs_usakovs.lesson_4.homework;

public class Calculator {
    int number1 = 10;
    int number2 = 5;
    int number3 = 46;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }


    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int substraction(int number1, int number2) {
        return number1 - number2;
    }

    public int division(int number1, int number2) {
        return number1 / number2;
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public boolean isEvenNumber1(int number1) {
        if (number1 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEvenNumber2(int number2) {
        if (number2 % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else if (number1 < number2) {
            return number2;
        } else {
            return number1 + number2;
        }
    }
    //////////////////////////////////////////////////////////////////////////

   /* public int maxOfThreeNumbers(int number1, int number2, int number3) {
        int number1 >number2 && number3;
        int number2 >number1 && number3;
        int number3 >number1 && number2;
        int number1 = number2 > number3;
        int number1 = number3 > number2;
        int number2 = number3 > number1;
        int number1 = number2 = number3;
        return int result;*/
}


