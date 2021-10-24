package com.javaguru.teacher.lesson_5.lessoncode;

import java.util.Arrays;
import java.util.Random;

class ArrayExample {

    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] array = new int[10];

        System.out.println(Arrays.toString(array));

        System.out.println();

        service.printArray(array);
        service.fillArrayWithRandomNumbers(array);

        System.out.println();

        service.printArray(array);
    }
}
