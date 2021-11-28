package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayOfTheWeekDetectorTest {


    @Test
    public void dayOfTheWeekDetectorIfVersionTest() {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        String result = day.detectDayName(2);
        String expectedResult = "Tuesday";

        assertEquals(expectedResult, result);

    }

    @Test
    public void dayOfTheWeekDetectorIfVersionTwoTest() {
        DayOfTheWeekDetectorIfVersionTwo day = new DayOfTheWeekDetectorIfVersionTwo();
        String result = day.detectDayName(8);
        String expectedResult = "Please input a valid number between 1 and 7";

        assertEquals(expectedResult, result);

    }


    @Test
    public void dayOfTheWeekDetectorIfVersionThreeTestFail() {
        DayOfTheWeekDetectorIfVersionThree day = new DayOfTheWeekDetectorIfVersionThree();
        String result = day.detectDayName(8);
        String expectedResult = "Please input a valid number between 1 and 7";

        assertEquals(expectedResult, result);

    }

    @Test
    public void dayOfTheWeekDetectorIfVersionThreeTest() {
        DayOfTheWeekDetectorIfVersionThree day = new DayOfTheWeekDetectorIfVersionThree();
        String result = day.detectDayName(3);
        String expectedResult = "Wednesday";

        assertEquals(expectedResult, result);

    }

}