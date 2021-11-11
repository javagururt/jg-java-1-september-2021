package com.javaguru.student_Olga_T.lesson_5.level_5.tasks_31_34;


class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
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
  //              System.out.println("array [" + i + "] = " + array[i]);
            }
        }
        if (checkNumber) {
            System.out.println("shouldFillArrayWithRandomNumbers test OK");
        } else {
            System.out.println("shouldFillArrayWithRandomNumbers test FAIL");
        }
    }
}



