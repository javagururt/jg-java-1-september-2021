package com.javaguru.student_deniss_lohins.lesson_6.level_3;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public boolean doesArrayContainsExactNumber(int number, int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    public int howManyTimesContainExactNumber(int number, int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                ++result;
            }
        }
        return result;
    }

    void replace(int[] array, int numberToReplace, int newNumber) {
        array[numberToReplace] = newNumber;
    }

    void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }


    void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < (array.length / 2); i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    void sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            {
                int j = i;
                int a = array[i];
                while ((j > 0) && (array[j - 1] > a))   //returns true when both conditions are true
                {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = a;
            }
        }
    }
}
