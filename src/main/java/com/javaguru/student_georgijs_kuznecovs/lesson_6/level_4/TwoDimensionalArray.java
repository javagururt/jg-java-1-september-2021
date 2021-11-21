package com.javaguru.student_georgijs_kuznecovs.lesson_6.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[5][3];

        int sum = 0;
        for (int j = 0; j < array.length; j++){
            for (int i = 0; i < array[0].length; i++){
                Random randomGenerator = new Random();
                array[j][i] = randomGenerator.nextInt(100);

                System.out.print(" " + array[j][i] + " ");
                sum = sum + array[j][i];
            }
            System.out.println();

        }
        System.out.println(sum);


    }
}
