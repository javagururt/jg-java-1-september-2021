package com.javaguru.student_Olga_T.lesson_6.level_3.tasks_9_13;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldContainNumber();
        test.shouldNotContainNumber();
        test.howManyEqualNumbersContainArray();
        test.shoulReplaceNumber();
        test.shoulReplaceAllNumbers();
        test.shouldReverseArraysNumbers();
    }

    public void shouldContainNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (arrayUtil.checkNumber(2, array)) {
            System.out.println("shouldContainNumber OK");
        } else {
            System.out.println("shouldContainNumber FAIL");
        }
    }

    public void shouldNotContainNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (!arrayUtil.checkNumber(3, array)) {
            System.out.println("shouldNotContainNumber OK");
        } else {
            System.out.println("shouldNotContainNumber FAIL");
        }
    }

    public void howManyEqualNumbersContainArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        if (arrayUtil.howManyEqualNumbersContainArray(4, array) == 3) {
            System.out.println("howManyEqualNumbersContainArray OK");
        } else {
            System.out.println("howManyEqualNumbersContainArray FAIL");
        }
    }

    public void shoulReplaceNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        int[] replaced = arrayUtil.replace(array, 25, 0);
        if (replaced[2] == 0) {
            System.out.println("shoulReplaceNumber OK");
        } else {
            System.out.println("shoulReplaceNumber FAIL");
        }
    }

    public void shoulReplaceAllNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        int[] replaced = arrayUtil.replaceAll(array, 5, 100);
        if (replaced[8] == 100 && replaced[10] == 100) {
            System.out.println("shoulReplaceAllNumbers OK");
        } else {
            System.out.println("shoulReplaceAllNumbers FAIL");
        }
    }

    public void shouldReverseArraysNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.fillArrayWithNumbers();
        int[] replaced = arrayUtil.reverseNumbers(array);
        if (replaced[2] == 5 && replaced[3] == 4) {
            System.out.println("shouldReverseArraysNumbers OK");
        } else {
            System.out.println("shouldReverseArraysNumbers FAIL");
        }
    }

}





