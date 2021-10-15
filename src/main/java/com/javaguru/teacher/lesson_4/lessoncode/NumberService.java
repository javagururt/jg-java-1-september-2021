package com.javaguru.teacher.lesson_4.lessoncode;

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
