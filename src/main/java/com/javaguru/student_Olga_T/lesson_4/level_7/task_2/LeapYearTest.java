package com.javaguru.student_Olga_T.lesson_4.level_7.task_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.leapTest2020();
        leapYearTest.leapTest1600();
        leapYearTest.leapTest2016();
        leapYearTest.notLeapTest();

    }

    public void leapTest2020() {
        LeapYear year = new LeapYear();
        allTest(year.isLeapYear(2020), "leapTest2020");
    }

    public void leapTest1600() {
        LeapYear year = new LeapYear();
        allTest(year.isLeapYear(1600), "leapTest1600");
    }

    public void leapTest2016() {
        LeapYear year = new LeapYear();
        allTest(year.isLeapYear(2016), "leapTest2016");
    }


    public void notLeapTest() {
        LeapYear year = new LeapYear();
        allTest(!year.isLeapYear(2019), "notLeapTest");

    }


    private void allTest(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }
}





