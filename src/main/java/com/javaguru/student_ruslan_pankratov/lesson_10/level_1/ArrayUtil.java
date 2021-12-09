package com.javaguru.student_ruslan_pankratov.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
