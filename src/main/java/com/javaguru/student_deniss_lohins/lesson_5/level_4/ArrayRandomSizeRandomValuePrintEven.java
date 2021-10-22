package com.javaguru.student_deniss_lohins.lesson_5.level_4;

import java.util.Random;

class ArrayRandomSizeRandomValuePrintEven {

    public static void main(String[] args) {
        ArrayRandomSizeRandomValuePrintEven runner = new ArrayRandomSizeRandomValuePrintEven();
        int[] array = runner.randomFill();
        runner.printResults(array);
        System.out.println("");
        runner.printEven(array);
    }

    private int[] randomFill() {
        Random randomGenerator = new Random();
        int arrayLength = randomGenerator.nextInt(0, 50);
        int[] array = new int[arrayLength];
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

    private void printEven(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                System.out.println("Array [" + i + "] = " + array[i]);
        }
        }
    }
}
