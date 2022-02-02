package com.javaguru.student_nikita_simans.homework.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekTest {
    public static void main(String[] args) {
        DayOfTheWeekDetector ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetector arrayVersion = new DayOfTheWeekDetectorArrayVersion();

        System.out.println("if version " + ifVersion.detectDayName(4));
        System.out.println("switch version " + switchVersion.detectDayName(4));
        System.out.println("array version "+ arrayVersion.detectDayName(4));

        int dayNumber = 3;

        if (ifVersion.detectDayName(dayNumber).equals(switchVersion.detectDayName(dayNumber))
                & switchVersion.detectDayName(dayNumber).equals(arrayVersion.detectDayName(dayNumber))) {
            System.out.println("TEST OK");
        } else {
            System.err.println("Test FAIL");
        }

    }




}
