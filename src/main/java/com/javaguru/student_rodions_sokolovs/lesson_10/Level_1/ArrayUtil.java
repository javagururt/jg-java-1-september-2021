package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
