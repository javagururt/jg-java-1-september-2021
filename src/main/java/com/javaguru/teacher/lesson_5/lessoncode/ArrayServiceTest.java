package com.javaguru.teacher.lesson_5.lessoncode;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest runner = new ArrayServiceTest();
        runner.shouldReturnSumOfArray();
        runner.shouldReturnMaxOfArray();
    }

    void shouldReturnSumOfArray() {
        int[] array = {3, 9, 1, 5};

        int expected = 18;

        ArrayService victim = new ArrayService();
        int actual = victim.sumArray(array);

        assertEquals("shouldReturnSumOfArray", expected, actual);
    }

    void shouldReturnMaxOfArray() {
        int[] array = {1, 5, 40, -1, 20, 0};
        int expected = 40;
        ArrayService victim = new ArrayService();
        int actual = victim.maxNumberOfArray(array);

        assertEquals("shouldReturnMaxOfArray", expected, actual);
    }

    private void assertEquals(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.err.println(testName + ": FAILURE, expected: " + expected + ", actual: " + actual);
        }
    }

}
