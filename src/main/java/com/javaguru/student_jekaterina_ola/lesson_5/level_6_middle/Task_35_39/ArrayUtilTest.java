package com.javaguru.student_jekaterina_ola.lesson_5.level_6_middle.Task_35_39;


public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        if (array.length == 5) {
            System.out.println("shouldCreateArray test OK");
        } else {
            System.out.println("shouldCreateArray test FAIL");
        }
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        array = arrayUtil.fillArrayWithRandomNumbers(array);
        boolean checkNumber = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                checkNumber = false;
            }
        }
        if (checkNumber) {
            System.out.println("shouldFillArrayWithRandomNumbers OK");
        } else {
            System.out.println("shouldFillArrayWithRandomNumbers Fail");
        }
    }

    public void shouldFindMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] number = {5, 9, 2, 7, 3};
        int result = arrayUtil.findMaxNumber(number);
        int expectedResult = 9;

        if (result == expectedResult){
            System.out.println("ShouldFindMaxNumber test OK");
        }else {
            System.out.println("ShouldFindMaxNumber test FAIL");
        }

    }

    public void shouldFindMinNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] number = {5, 9, 2, 7, 3};
        int result = arrayUtil.findMinNumber(number);
        int expectedResult = 2;

        if (result == expectedResult){
            System.out.println("ShouldFindMinNumber test OK");
        }else {
            System.out.println("ShouldFindMinNumber test FAIL");
        }
    }
}



