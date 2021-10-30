package com.javaguru.student_georgijs_kuznecovs.lesson_5.level_5;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(6);
        int expected = 6;

        if (array.length == expected) {
            System.out.println("Create array Test = SUCCESS");
        } else
            System.out.println("Create array Test = FAIL");

    }

    public void shouldFindMaxNumber() {
        // Write test implementation here !!!
    }

}
