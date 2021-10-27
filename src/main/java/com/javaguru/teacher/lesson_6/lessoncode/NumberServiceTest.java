package com.javaguru.teacher.lesson_6.lessoncode;


class NumberServiceTest {


    public static void main(String[] args) {
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.shouldReturn27();
        testRunner.shouldReturn0();
        testRunner.shouldReturn4();
        testRunner.shouldReturnOneIfPowerZero();
        testRunner.shouldReturn1();
    }

    void shouldReturnOneIfPowerZero() {
        NumberService victim = new NumberService();

        int expected = 1;
        int actual = victim.power(10, 0);

        assertEquals("shouldReturnOneIfPowerZero", expected, actual);
    }

    void shouldReturn4() {
        NumberService victim = new NumberService();

        int expected = 4;
        int actual = victim.power(2, 2);

        assertEquals("shouldReturn4", expected, actual);
    }

    void shouldReturn27() {
        NumberService victim = new NumberService();

        int expected = 27;
        int actual = victim.power(3, 3);

        assertEquals("shouldReturn27", expected, actual);
    }

    void shouldReturn0() {
        NumberService victim = new NumberService();

        int expected = 0;
        int actual = victim.power(0, 2);

        assertEquals("shouldReturn0", expected, actual);
    }

    void shouldReturn1() {
        NumberService victim = new NumberService();

        int expected = 1;
        int actual = victim.power(0, 0);

        assertEquals("shouldReturn1", expected, actual);
    }

    private void assertEquals(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println(testName + ": SUCCESS");
        } else {
            System.err.println(testName + ": FAILURE, expected: " + expected + ", actual: " + actual);
        }
    }
}
