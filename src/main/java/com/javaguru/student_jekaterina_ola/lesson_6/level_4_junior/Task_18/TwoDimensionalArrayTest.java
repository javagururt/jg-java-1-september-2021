package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_18;

public class TwoDimensionalArrayTest {
    public static void main (String[] args) {
        TwoDimensionalArrayTest twoDimensionalArrayTest = new TwoDimensionalArrayTest();
        twoDimensionalArrayTest.shouldReturnSumOfArray();
    }

    public void shouldReturnSumOfArray () {
        int[][] twoArray = {{5, 7, 3},{8, 6, 1}, {2, 4, 9}};
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        if (twoDimensionalArray.sumOfDoubleArray(twoArray) == 45) {
            System.out.println("shouldReturnSumOfArray OK");
        } else {
            System.out.println("shouldReturnSumOfArray FAIL");
        }
    }
}
