package com.javaguru.student_Jegor_Rutkovsky.lesson_5.level_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
import java.util.Random;
//Task_31 - Task_41
@CodeReview(approved = true)
class ArrayUtil {
    public int[] createArray(int arrayLength){
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array){
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(99);
        }
    }
    public void printArrayToConsole(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public int findMaxNumber(int[] array){
        int maxNumOfArray = array[0];
        for (int arr : array) {
            if (maxNumOfArray <= arr) {
                maxNumOfArray = arr;
            }
        }
        return maxNumOfArray;
    }
    public int findMinNumber(int[] array){
        int minNumOfArray = array[0];
        for (int arr : array) {
            if (minNumOfArray >= arr) {
                minNumOfArray = arr;
            }
        }
        return minNumOfArray;
    }
}
