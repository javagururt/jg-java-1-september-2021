package com.javaguru.student_dmitrii_faierberg.lesson_6.level_3_junior;

import java.util.Random;

class ArrayUtil {
    public boolean isNumberInArray(int[] array, int number){
        for (int i = 0; i < array.length; i++){
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    public int countHowOftenNumberInArray(int[] array, int number){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number) {
                counter++;
            }
        }
        return counter;
    }

}
