package com.javaguru.student_nikita_simans.homework.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ArrayUtil {
    public int[] createArray(int arrayLength);

    public void fillArrayWithRandomNumbers(int[] array);

    public void printArrayToConsole(int[] array);

    public int findMaxNumber(int[] array);

    public int findMinNumber(int[] array);
}
