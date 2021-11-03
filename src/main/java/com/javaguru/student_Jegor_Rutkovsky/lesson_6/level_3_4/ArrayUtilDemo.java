package com.javaguru.student_Jegor_Rutkovsky.lesson_6.level_3_4;

import com.javaguru.teacher.codereview.CodeReview;

//Task_9 - Task_14
@CodeReview(approved = true)
class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(7);
        arrayUtil.fillArrayWithRandomNumbers(array);
        System.out.print("Array with random numbers: ");
        arrayUtil.printArrayToConsole(array);
        arrayUtil.replaceAllInArray(array, 3, 10);
        System.out.print("If number 3 was found in array, should be replaced to number 10: ");
        arrayUtil.printArrayToConsole(array);
        arrayUtil.overturnArray(array);
        System.out.print("Overturned: ");
        arrayUtil.printArrayToConsole(array);
        System.out.print("Sort Numbers in array: ");
        arrayUtil.sortNumbersInArray(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Find max number in array: " +arrayUtil.findMaxNumber(array));
        System.out.println("Find min number in array: " +arrayUtil.findMinNumber(array));
    }
}
