package com.javaguru.student_jekaterina_ola.lesson_10.lesson_1_intern.Task_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {
    int[] createArray (int arrayLength);
    void fillArrayWithRandomNumbers (int[] array);
    void printArrayToConsole (int[] array);
    int findMaxNumber (int[] array);
    int findMinNumber (int[] array);

}
