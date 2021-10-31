package com.javaguru.student_vladislav_savickis.lesson_5.homework.level_5_middle;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] randomTest = new int[9];
        arrayUtil.fillArrayWithRandomNumbers(randomTest);
    }

    public void shouldCreateArray() {
        int expected = 5;

        ArrayUtil victim = new ArrayUtil();
        int[] victimArrayLength = victim.createArray(5);
        int actual = victimArrayLength.length;
        assertEquals("Should return array length", expected, actual);
    }


    private void assertEquals(String testName, int expected, int actual){
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.err.println(testName + ": FAILURE, expected: " + expected + ", actual: " + actual);
        }
    }
}
