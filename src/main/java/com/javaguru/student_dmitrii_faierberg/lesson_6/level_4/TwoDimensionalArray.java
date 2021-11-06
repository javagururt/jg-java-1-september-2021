package com.javaguru.student_dmitrii_faierberg.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        fillWithRandomNumbers(arr);

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillWithRandomNumbers(int[][] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = random.nextInt(30);
            }
        }
    }

    public int sumAllTheElementsOfArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
