package com.javaguru.student_dmitrii_faierberg.lesson_5.level_4_junior;

import java.util.Random;
import java.util.Scanner;

class RandArrayWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        fillArrayWithRandomNumbers(array);
        printElements(array);
        System.out.println("Maximum: " + maxNumOfArray(array));
        System.out.println("Minimum: " + minNumOfArray(array));

        printEvenNumbersOfArray(array);
        System.out.println();
        printOddNumbersOfArray(array);

    }

    public static void fillArrayWithRandomNumbers(int[] array){
        Random randomGenerator = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = randomGenerator.nextInt(50);
        }
    }

    public static void printElements(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int maxNumOfArray(int[] array){
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int minNumOfArray(int[] array){
        int min = 100000000;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void printEvenNumbersOfArray(int[] array){
        System.out.print("Even numbers: ");
        for(int num : array){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }

    public static void printOddNumbersOfArray(int[] array){
        System.out.print("Odd numbers: ");
        for(int num : array){
            if (num % 2 != 0){
                System.out.print(num + " ");
            }
        }
    }


}

