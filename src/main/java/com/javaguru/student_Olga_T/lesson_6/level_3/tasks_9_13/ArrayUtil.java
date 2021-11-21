package com.javaguru.student_Olga_T.lesson_6.level_3.tasks_9_13;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] fillArrayWithNumbers() {
        int[] myNewArray = {2, 9, 25, 13, 4, 18, 4, 4, 5, 1, 5};
        return myNewArray;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] = " + array[i]);
        }
    }

    public boolean checkNumber(int checkNumber, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkNumber) {
                return true;
            }
        }
        return false;
    }

    public int howManyEqualNumbersContainArray(int checkEqualNumber, int[] array) {
        int equalNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkEqualNumber) {
                equalNumber++;
            }
        }
        return equalNumber;
    }

    public int[] replace(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return arr;
            }
        }
        return arr;
    }

    public int[] replaceAll(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return arr;
    }

    public int[] reverseNumbers(int[] arr) {
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[arr.length - 1 - i] = arr[i];
        }
        return tempArray;
    }
}
