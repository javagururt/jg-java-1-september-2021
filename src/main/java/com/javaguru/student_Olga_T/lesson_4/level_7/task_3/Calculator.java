package com.javaguru.student_Olga_T.lesson_4.level_7.task_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
