package com.javaguru.student_dmitrii_faierberg.lesson_5.level_5_middle;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(20);
        }
    }
}
