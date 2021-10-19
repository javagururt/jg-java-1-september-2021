package com.javaguru.student_georgijs_kuznecovs.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.ifLeap();
        leapYearTest.ifNotLeap();
    }

    public void ifLeap() {
        int year = 2000;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == true) {
            System.out.println("LeapYear test = OK");
        } else
            System.out.println("LeapYear test = FAIL");
    }

    public void ifNotLeap() {
        int year = 1900;
        LeapYear leapYear = new LeapYear();
        boolean result = leapYear.isLeapYear(year);

        if (result == false) {
            System.out.println("LeapYear test = OK");
        } else
            System.out.println("LeapYear test = FAIL");
    }

}
