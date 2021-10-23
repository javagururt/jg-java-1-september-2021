package com.javaguru.student_ruslan_pankratov.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.randomTest();
        twoDimensionalArrayTest.countTest();
    }

    void randomTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();

        int[][] arr = new int[10][10];
        twoDimensionalArray.random(arr);
        boolean result = method(arr);
        boolean expectedResult = true;

        methodBoolean(result, expectedResult, "randomTest");
    }

    void countTest() {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int[][] arr = new int[2][2];
        arr[0][0] = 10;
        arr[0][1] = 10;
        arr[1][0] = 10;
        arr[1][1] = 10;

        int result = twoDimensionalArray.count(arr);
        int expectedResult = 40;

        methodInt(result, expectedResult, "countTest");
    }


    void methodBoolean(boolean result, boolean expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }

    void methodInt(int result, int expectedResult, String name) {
        if (result == expectedResult) {
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIL");
        }
    }

    boolean method(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0) {
                    count += 1;
                }
            }
        }

        if (count == 100) {
            return true;
        } else {
            return false;
        }

    }
}
