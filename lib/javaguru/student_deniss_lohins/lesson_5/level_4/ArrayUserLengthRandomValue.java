package com.javaguru.student_deniss_lohins.lesson_5.level_4;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Random;
import java.util.Scanner;
@CodeReview(approved = true)
class ArrayUserLengthRandomValue {
    public static void main(String[] args) {
        ArrayUserLengthRandomValue runner = new ArrayUserLengthRandomValue();
        int[] array = runner.randomFill();
        runner.printResults(array);
    }

    private int[] randomFill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter array size: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
        }
        return array;
    }

    private void printResults(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}
