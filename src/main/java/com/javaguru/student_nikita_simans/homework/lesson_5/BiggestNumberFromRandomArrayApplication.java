package com.javaguru.student_nikita_simans.homework.lesson_5;



public class BiggestNumberFromRandomArrayApplication {
    public static void main(String[] args) {
        BiggestNumberFromRandomArray myArray = new BiggestNumberFromRandomArray();
        myArray.createIntegerArray(5);
        myArray.fillArrayWithRandom();
        myArray.printArray();
        System.out.println("End of Array");
        System.out.println();
        System.out.println("Biggest number:");
        myArray.printBiggestNumberOfArray();
        System.out.println("Smallest number:");
        myArray.printSmallestNumberOfArray();
        System.out.println("Even numbers:");
        myArray.findEvenNumbers();
        System.out.println("Odd numbers:");
        myArray.findOddNumbers();






    }
}
