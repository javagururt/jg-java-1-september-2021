package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class TwoDimensionalArray {
    public void fillArrayWithRandomNumbers(int[][] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
    }

    public int sumOfAllArrayNumbers(int[][] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }
}
