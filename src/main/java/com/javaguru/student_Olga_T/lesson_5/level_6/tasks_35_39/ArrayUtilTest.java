package com.javaguru.student_Olga_T.lesson_5.level_6.tasks_35_39;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

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
            System.out.println("array [" + i + "] = " + array[i]);
            if (array[i] == 0) {
                checkNumber = false;
                //          System.out.println("array [" + i + "] = " + array[i]);
            }
        }
        if (checkNumber) {
            System.out.println("shouldFillArrayWithRandomNumbers test OK");
        } else {
            System.out.println("shouldFillArrayWithRandomNumbers test FAIL");
        }
    }


    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        array = arrayUtil.fillArrayWithRandomNumbers(array);
        array[2] = 120;
        int maxArrayNumber = arrayUtil.findMaxNumber(array);
        if (maxArrayNumber == 120) {
            System.out.println("shouldFindMaxNumber test OK");
        } else {
            System.out.println("shouldFindMaxNumber test FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(5);
        array = arrayUtil.fillArrayWithRandomNumbers(array);
        array[2] = -120;
        int minArrayNumber = arrayUtil.findMinNumber(array);
        if (minArrayNumber == -120) {
            System.out.println("shouldFindMinNumber test OK");
        } else {
            System.out.println("shouldFindMinNumber test FAIL");
        }
    }
}

