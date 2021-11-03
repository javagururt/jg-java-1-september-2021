package com.javaguru.student_jekaterina_ola.lesson_4.level_4_junior.Task_11;
// Task 11-12-13-14-15

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    // return true - если число чётное (делится на 2 без остатка); иначе false

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return "firstNumber";
        } else if (firstNumber < secondNumber){
            return "secondNumber";
        } else {
            return "equal";
        }
    }
}


