package com.javaguru.student_dmitrii_faierberg.lesson_5.level_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Random;
@CodeReview(approved = true)
class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[3];
        Random randomGenerator = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(10);
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2]);

        int sum = array[0] + array[1] + array[2];
        System.out.println("Sum: " + sum);

        double average = (double) sum / array.length;
        System.out.println("Average: " + average);

        for (int i = 0; i < array.length; i++){
            array[i] += 2;
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
