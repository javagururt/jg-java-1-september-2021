package com.javaguru.student_deniss_lohins.lesson_5.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        int arrayLength = 5;
        boolean result = false;
        int[] expectedArray = new int[arrayLength];
        ArrayUtil victim = new ArrayUtil();
        if (Arrays.equals(victim.createArray(arrayLength), expectedArray)) {
            result = true;
        }
        ArrayUtilTest.checkResults(result, "shouldCreateArray");
    }


    public void shouldFillArrayWithRandomNumbers() {
        int arrayLength = 5;
        boolean result = false;
        int[] expectedArray = new int[arrayLength];
        ArrayUtil victim = new ArrayUtil();
        int[] obtainedResult = victim.createArray(arrayLength);
        victim.fillArrayWithRandomNumbers(obtainedResult);
        if (Arrays.equals(obtainedResult, expectedArray)) {
            result = true;
        }
        ArrayUtilTest.checkResults(!result, "shouldFillArrayWithRandomNumbers");
    }


    public static void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.err.println(testName + " = FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {5, 10, -1, 100, 82};
        ArrayUtilTest.checkResults(victim.findMaxNumber(array) == 100, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil victim = new ArrayUtil();
        int[] array = {5, 10, -1, 100, 82};
        ArrayUtilTest.checkResults(victim.findMinNumber(array) == -1, "shouldFindMinNumber");
    }
}
