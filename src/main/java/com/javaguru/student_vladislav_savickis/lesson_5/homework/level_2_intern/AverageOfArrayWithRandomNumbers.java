package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_2_intern;

import java.util.Random;

class AverageOfArrayWithRandomNumbers {
    public static void main(String[] args) {
        int sumOfArray;

        Random random = new Random();
        int[] numbers = new int[3];
        for (int i=0; i<3; i++) {
            numbers[i] = random.nextInt(100);
        }
        sumOfArray = (numbers[0] + numbers[1] + numbers[2]) / 3;
        System.out.println("Average of (" + numbers[0] + " + " + numbers[1] + " + " + numbers[2] + ") =");
        System.out.println(sumOfArray);
    }
}
