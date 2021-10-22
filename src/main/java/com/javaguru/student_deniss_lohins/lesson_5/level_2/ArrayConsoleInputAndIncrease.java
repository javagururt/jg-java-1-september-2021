package com.javaguru.student_deniss_lohins.lesson_5.level_2;

import java.util.Scanner;

class ArrayConsoleInputAndIncrease {
    public static void main(String[] args) {
        int[] array = new int[3];
        ArrayConsoleInputAndIncrease.manualFill(array);
        ArrayConsoleInputAndIncrease.printResults(array);
        ArrayConsoleInputAndIncrease.increaseEachValueOfArray(array);
        System.out.println("");
        ArrayConsoleInputAndIncrease.printResults(array);
    }

    static void printResults(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    static void increaseEachValueOfArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + array[i];
        }
    }
    static void manualFill(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Please enter array[" + i + "] value :");
            array[i] = sc.nextInt();
        }
    }
}
