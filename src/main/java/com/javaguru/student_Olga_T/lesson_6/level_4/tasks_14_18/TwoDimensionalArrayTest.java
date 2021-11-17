package com.javaguru.student_Olga_T.lesson_6.level_4.tasks_14_18;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.shouldReturnSumOfArray();

    }

    public void shouldReturnSumOfArray() {
        int[][] twoArray = {{1, 2, 3,}, {5, 2, 4}, {9, 1, 0}};
        TwoDimensionalArray testArray = new TwoDimensionalArray();
        if (testArray.sumDoubleArray(twoArray) == 27) {
            System.out.println("shouldReturnSumOfArray OK");
        } else {
            System.out.println("shouldReturnSumOfArray FAIL");
        }
    }

}

