package com.javaguru.student_nikita_simans.homework.lesson_5;



public class BiggestNumberFromRandomArray {
    private int[] myArray;


    public void createIntegerArray(int arrayLength) {
        myArray = new int[arrayLength];
    }

    public void fillArrayWithRandom() {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random()*100);
        }
    }

    public void printArray(){
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void printBiggestNumberOfArray() {
        int biggestNumber = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (biggestNumber < myArray[i]) {
                biggestNumber = myArray[i];
            }
        }
        System.out.println(biggestNumber);
    }
    public void printSmallestNumberOfArray() {
        int smallestNumber = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < smallestNumber) {
                smallestNumber = myArray[i];
            }
        }
        System.out.println(smallestNumber);
    }

    public void findEvenNumbers(){
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                System.out.println(myArray[i]);
            }

        }
    }
    public void findOddNumbers() {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0) {
                System.out.println(myArray[i]);
            }
        }
    }




}
