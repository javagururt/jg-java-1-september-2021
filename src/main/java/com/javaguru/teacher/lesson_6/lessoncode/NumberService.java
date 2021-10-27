package com.javaguru.teacher.lesson_6.lessoncode;

class NumberService {


    public int power(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }

}
