package com.javaguru.student_vitalijs_usakovs.Lesson_5.Homework;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class Task32ArrayUtilTest {

    public static void main(String[] args) {
        Task32ArrayUtilTest test = new Task32ArrayUtilTest();
        test.createArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void createArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Array Length - ");
        int arrayInput = input.nextInt();
        Task31ArrayUtil inputLength = new Task31ArrayUtil();
        inputLength.createArray(arrayInput);

        int[] inputCreateArray = new int[arrayInput];
        inputLength.fillArrayWithRandomNumbers(inputCreateArray);

        inputLength.printArrayToConsole(inputCreateArray);

        System.out.println("Max Number are : " + inputLength.findMaxNumber(inputCreateArray));

        System.out.println("Min Number are : " + inputLength.findMinNumber(inputCreateArray));
    }

    public void shouldFindMaxNumber() {
        Task31ArrayUtil victim = new Task31ArrayUtil();
        int[] array = {12, 23, 46, 92, 88};
        if (victim.findMaxNumber(array) == 92) {
            System.out.println("ShouldFindMaxNumber TEST - OK!");
        } else {
            System.err.println("ShouldFindMaxNumber TEST - FAILED!");
        }
    }

    public void shouldFindMinNumber() {
        Task31ArrayUtil victim = new Task31ArrayUtil();
        int[] array = {12, 23, 46, 92, 88};
        if (victim.findMinNumber(array) == 12) {
            System.out.println("ShouldFindMinNumber TEST - OK!");
        } else {
            System.err.println("ShouldFindMinNumber TEST - FAILED!");
        }
    }
}