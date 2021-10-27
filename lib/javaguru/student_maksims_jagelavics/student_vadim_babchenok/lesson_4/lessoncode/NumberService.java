package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

class NumberService {

    int maxOf(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    int maxOfTernary(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }
}

