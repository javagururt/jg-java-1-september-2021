package com.javaguru.student_nikita_simans.homework.lesson_6;

import java.util.Arrays;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(array);
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    
    public boolean numberIsInArray(int[] array, int number){
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = true;
            }
        }
        return result;
    }

    public int howManyXInArray(int[] array, int x){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                counter++;
            }
        }
        return counter;
    }

    public void replaceNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }

        }
    }

    public void replaceAllNumbers(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }

        }
    }

    public void revertArray(int[] array) {
        int trueArrayLength = array.length -1;
        int[] referenceArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            array[i] = referenceArray[trueArrayLength];
            trueArrayLength--;
        }
    }

}





























