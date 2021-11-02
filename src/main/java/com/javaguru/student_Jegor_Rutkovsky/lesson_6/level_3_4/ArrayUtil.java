package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_3_4;

import java.util.Arrays;
import java.util.Random;

//Task_9 - Task_14
class ArrayUtil {

    public void sortNumbersInArray(int[] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                int temp = arr[i];
                if (arr[i] > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void overturnArray(int[] arr){
        for (int i=0; i<arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;   //без гугла не справился
        }
    }

    public void replaceAllInArray(int[] array, int numberToReplace, int newNumber){
        for (int i=0; i < array.length; i++){
            if (array[i] == numberToReplace){
                array[i] = newNumber;
            }
        }
    }

    public boolean findNumberInArray(int[] array, int number){
        for (int j : array) {
            if (number == j) {
                return true;
            }
        }
        return false;
    }

    public int howManySearchNumbersInArray(int[] array, int number){
        int count = 0;
        for (int j: array) {
            if (j == number){
                count++;
            }
        }
        return count;
    }

    public int[] createArray(int arrayLength){
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array){
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(10);
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
