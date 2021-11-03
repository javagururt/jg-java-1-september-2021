package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        int length = array.length;
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
    }
}
