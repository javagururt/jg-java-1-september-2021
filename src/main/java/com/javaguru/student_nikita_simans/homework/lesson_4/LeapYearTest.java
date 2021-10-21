package com.javaguru.student_nikita_simans.homework.lesson_4;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest check = new LeapYearTest();
        check.isLeapIfDiv4AndDiv100AndDiv400();
        check.isLeapIfDiv4AndNotDiv100();
        check.isRegularIfDiv4AndDiv100AndNotDiv400();
        check.isRegularIfNotDiv4();
    }

    public void isRegularIfDiv4AndDiv100AndNotDiv400(){
        System.out.println("isRegularIfDiv4AndDiv100AndNotDiv400" + tester(1900, false));
    }

    public void isRegularIfNotDiv4(){
        System.out.println("isRegularIfNotDiv4" + tester(1991, false));
    }

    public void isLeapIfDiv4AndNotDiv100(){
        System.out.println("isLeapIfDiv4AndNotDiv100" + tester(1904, true));
    }
    public void isLeapIfDiv4AndDiv100AndDiv400(){
        System.out.println("isLeapIfDiv4AndDiv100AndDiv400" + tester(2000, true));
    }



    public String tester(int year, boolean mustResult){
        String testResult;
        LeapYear test = new LeapYear();
        if (test.isLeapYear(year) == mustResult){
            testResult = " = OK";
        } else {
            testResult = " = FAIL";
        }
        return testResult;
    }
}
