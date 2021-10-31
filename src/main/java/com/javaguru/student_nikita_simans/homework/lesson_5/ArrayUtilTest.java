package com.javaguru.student_nikita_simans.homework.lesson_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil createdArray = new ArrayUtil();
        if (createdArray.createArray(10) != null) {
            System.out.println("shouldCreateArray test - OK");
        } else {
            System.out.println("shouldCreateArray test - FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] array = {1,8,3,5,6,9,14,43,0};
        int a = 43;
        if (test.findMaxNumber(array) == a) {
            System.out.println("shouldFindMaxNumber test -- OK");
        } else {
            System.out.println("shouldFindMaxNumber test -- FAIL");
        }


    }
    public void shouldFindMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] array = {1,8,3,5,6,9,14,43,0};
        int a = 0;
        if (test.findMinNumber(array) == a) {
            System.out.println("shouldFindMaxNumber test -- OK");
        } else {
            System.out.println("shouldFindMaxNumber test -- FAIL");
        }
    }
}
