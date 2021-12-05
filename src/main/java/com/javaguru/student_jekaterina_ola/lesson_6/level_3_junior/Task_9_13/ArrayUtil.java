package com.javaguru.student_jekaterina_ola.lesson_6.level_3_junior.Task_9_13;

//Дсодержит ли массив целых чисел указанное число.
//сколько раз содержит массив целых чисел указынное число.
//метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
//метод для замены вхождений указанного числа в массиве целых чисел на другое число.
//метод для переворота массива целых чисел.
//Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.

public class ArrayUtil {

    public int[] fillArrayWithNumbers() {
        int[] array = {9, 2, 7, 5, 3, 15, 1, 7, 7, 7};
        return array;
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array [" + i + "] =" + array[i]);
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
                return arr;
            }
        }
        return arr;
    }

    public int howManyEqualNumbersContainArray(int checkEqualNumbers, int[] array) {
        int equalNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == checkEqualNumbers) {
                equalNumber++;
            }
        }
        return equalNumber;
    }
}




