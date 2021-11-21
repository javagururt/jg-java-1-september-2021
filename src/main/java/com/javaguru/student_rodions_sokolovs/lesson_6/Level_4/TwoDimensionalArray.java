package com.javaguru.student_rodions_sokolovs.lesson_6.Level_4;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

import java.util.Random;
@CodeReview(approved = true)
@CodeReviewComment(teacher = "Лучше называть методы с маленькой буквы")
public class TwoDimensionalArray {

    public int[][] Arrayrandom(int c, int a) {
        int[][] array = new int[c][a];
        return array;
    }

    public void Random(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
    }
    public int Sum(int [][] array){
        int sum = 0;
        for (int i=0; i<array.length;i++){
            for (int j=0; j<array[i].length;j++){
                sum=sum + array[i][j];
            }
        }
        return sum;
    }

}
