package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class Task_14 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));
    //    System.out.println(numbers[0]+numbers[1]+numbers[2]);

        int sum = 0;
        for (int value  : numbers) {
            sum += value;
        }
        System.out.println(sum / numbers.length);
    }

}
