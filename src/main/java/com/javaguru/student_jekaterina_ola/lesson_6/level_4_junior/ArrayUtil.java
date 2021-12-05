package com.javaguru.student_jekaterina_ola.lesson_6.level_4_junior;

//Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.

public class ArrayUtil {
    public int[] sortBubble(int[] myArr) {

        boolean ifArrayIsSorted = false;
        while (!ifArrayIsSorted) {
            ifArrayIsSorted = true;

            for (int i = 1; i < myArr.length; i++) {
                if (myArr[i] < myArr[i - 1]) {
                    int tempBubble = myArr[i - 1];
                    myArr[i - 1] = myArr[i];
                    myArr[i] = tempBubble;
                    ifArrayIsSorted = false;
                }
            }
        }
        return myArr;
    }
}
