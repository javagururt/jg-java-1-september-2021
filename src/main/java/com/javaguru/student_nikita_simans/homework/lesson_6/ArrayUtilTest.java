package com.javaguru.student_nikita_simans.homework.lesson_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldReturnTrueIfNumberIsInArray();
        test.shouldReturnFalseIfNumberIsNotInArray();
        test.numberIs3TimesInArray();
        test.numberIs0TimesInArray();
        test.shouldReplaceOnlyFirstNumberEntry();
        test.shouldReplaceAllNumberEntry();
        test.shouldRevertArray();

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
        int[] array = new int[] {1,8,3,5,6,9,14,43,0};
        int a = 43;
        if (test.findMaxNumber(array) == a) {
            System.out.println("shouldFindMaxNumber test -- OK");
        } else {
            System.out.println("shouldFindMaxNumber test -- FAIL");
        }


    }
    public void shouldFindMinNumber() {
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,8,3,5,6,9,14,43,0};
        int a = 0;
        if (test.findMinNumber(array) == a) {
            System.out.println("shouldFindMaxNumber test -- OK");
        } else {
            System.out.println("shouldFindMaxNumber test -- FAIL");
        }
    }

    public void shouldReturnTrueIfNumberIsInArray() {
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,8,3,5,6,9,14,43,0};
        int number = 6;
        if (test.numberIsInArray(array, number)) {
            System.out.println("shouldReturnTrueIfNumberIsInArray test -- OK");
        } else {
            System.out.println("shouldReturnTrueIfNumberIsInArray test -- FAIL");
        }

    }

    public void shouldReturnFalseIfNumberIsNotInArray() {
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,8,3,5,6,9,14,43,0};
        int number = 98;
        if (!test.numberIsInArray(array, number)) {
            System.out.println("shouldReturnFalseIfNumberIsNotInArray test -- OK");
        } else {
            System.out.println("shouldReturnFalseIfNumberIsNotInArray test -- FAIL");
        }

    }

    public void numberIs3TimesInArray(){
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,8,3,5,6,9,6,43,8,0,6};
        int number = 6;
        if (test.howManyXInArray(array, number) == 3) {
            System.out.println("numberIs3TimesInArray test -- OK");
        } else {
            System.out.println("numberIs3TimesInArray test -- FAIL");
        }
    }

    public void numberIs0TimesInArray(){
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,8,3,5,6,9,6,43,8,0,6};
        int number = 76;
        if (test.howManyXInArray(array, number) == 0) {
            System.out.println("numberIs3TimesInArray test -- OK");
        } else {
            System.out.println("numberIs3TimesInArray test -- FAIL");
        }
    }

    public void shouldReplaceOnlyFirstNumberEntry(){
        ArrayUtil test = new ArrayUtil();
        int[] modifiedArray = new int[] {1,3,6,8,5,6,9,14,6};
        test.replaceNumber(modifiedArray,6, 99);
        if (modifiedArray[2] == 99 || modifiedArray[5] == 6 || modifiedArray[8] == 6) {
            System.out.println("shouldReplayOnlyFirstNumberEntry test -- OK");
        } else {
            System.out.println("shouldReplayOnlyFirstNumberEntry test -- FAIL");
        }
    }

    public void shouldReplaceAllNumberEntry(){
        ArrayUtil test = new ArrayUtil();
        int[] modifiedArray = new int[] {1,3,6,8,5,6,9,14,6};
        test.replaceAllNumbers(modifiedArray,6, 99);
        if (modifiedArray[2] == 99 && modifiedArray[5] == 99 && modifiedArray[8] == 99) {
            System.out.println("shouldReplaceAllNumberEntry test -- OK");
        } else {
            System.out.println("shouldReplaceAllNumberEntry test -- FAIL");
        }
    }

    public void shouldRevertArray(){
        ArrayUtil test = new ArrayUtil();
        int[] array = new int[] {1,3,6,8,5,6,9,14,6};
        int[] referenceArray = new int[] {6,14,9,6,5,8,6,3,1};
        test.revertArray(array);
        if (Arrays.equals(array, referenceArray)) {
            System.out.println("shouldRevertArray test -- OK");
        } else {
            System.out.println("shouldRevertArray test -- FAIL");
        }
    }
}



















