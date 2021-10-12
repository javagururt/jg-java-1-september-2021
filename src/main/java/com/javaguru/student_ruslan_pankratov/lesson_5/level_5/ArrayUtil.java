package com.javaguru.student_ruslan_pankratov.lesson_5.level_5;

//Task_31-38
public class ArrayUtil {


    public int[] createArray(int arrayLength) {

        int[] result = new int[arrayLength];
        return result;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public void fillArrayWithRandomNumbers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

    }

}
