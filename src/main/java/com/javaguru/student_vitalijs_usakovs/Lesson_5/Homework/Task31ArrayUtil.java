package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import java.util.Arrays;
import java.util.Random;
//Ne poluchaetsa zapustitj randomgenerator i vivesti eti chisla na konsolj.
class Task31ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
  /*      Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
            {

  */
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public int findMinNumber(int[] array) {
        int minNumber = 999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    //Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указанное число.
    public int ifNumberExist(int[] array) {
        int existNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length == existNumber) {
                existNumber = array[i];
            }
        }
        return existNumber;
    }

}
