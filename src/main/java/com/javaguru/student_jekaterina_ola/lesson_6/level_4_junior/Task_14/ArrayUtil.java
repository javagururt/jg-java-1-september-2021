package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior.Task_14;

//Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.

public class ArrayUtil {

    public int[] sortBubble(int[] myArray){

        boolean ifArraySorted = false;
        while (!ifArraySorted) {
            ifArraySorted = true;

            for  (int i = 0; i < myArray.length; i++) {
                if (myArray[i] < myArray [i - 1]) {
                    int tempBubble = myArray[i - 1];
                    myArray[i - 1] = myArray[i];
                    myArray[i] = tempBubble;
                    ifArraySorted = false;

                }
            }
        }
        return myArray;
    }
}
