package com.javaguru.student_vadim_babchenok.lesson6Home.level3.task9;


public class ArrayUtil
{
    //метод для проверки содержит ли массив целых чисел указанное число.
    public boolean ArrayContainsNumber(int[] array, int number)
    {
        int length = array.length; // kolichestvo elementov

        for (int i = 0; i < length; i++) {
            if (array[i] == number) return true;
        }

        return false;
    }

    //метод для проверки сколько раз содержит массив целых чисел указанное число.
    public int CountOfNumberInArray(int[] array, int number)
    {
        int length = array.length; // kolichestvo elementov

        int count = 0;

        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                count++;
            }
        }

        return count;
    }

    // метод для замены первого вхождения указанного числа в массиве целых чисел на другое число.
    public void ReplacingAnArrayValue(int[] array, int numberToReplace, int newNumber)//параметры
    {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;

                return;
            }
        }
    }

            //метод для замены вхождений указанного числа в массиве целых чисел на другое число.
    public void replaceAll (int[] arr, int numberToReplace, int newNumber)
    {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
    }

    //метод для переворота массива целых чисел
    public void replaceAllTwo (int[] arr) {
        int length = arr.length;
        arr[0]=arr.length;

        for (int i = 0; i < length; i++) {

        }
    }

}