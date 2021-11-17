package com.javaguru.student_Olga_T.lesson_5.level_5.tasks_31_34;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class ArrayUtil {
    Random random = new Random();


    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public int[] fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = 1 + random.nextInt(100 - 1); // 1 - 100
        return array;
    }

}
