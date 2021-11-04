package com.javaguru.teacher.lesson_7.lessoncode;

import java.util.Random;

class ArrayUtils {

    boolean exists(int number, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    int[] generateRandomSizeArray() {
        Random random = new Random();
        int size = random.nextInt(100-20) + 20; //20 - 100
        return new int[size];
    }
}
