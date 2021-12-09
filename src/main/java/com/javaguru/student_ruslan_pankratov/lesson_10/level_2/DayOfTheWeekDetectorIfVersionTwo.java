package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorIfVersionTwo implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                return monday();

            case 2:
                return tuesday();

            case 3:
                return wednesday();

            case 4:
                return thursday();

            case 5:
                return friday();

            case 6:
                return saturday();

            case 7:
                return sunday();

            default:
                return noCorrect();

        }
    }

    @Override
    public String monday() {
        return "Monday";
    }

    @Override
    public String tuesday() {
        return "Tuesday";
    }

    @Override
    public String wednesday() {
        return "Wednesday";
    }

    @Override
    public String thursday() {
        return "Thursday";
    }

    @Override
    public String friday() {
        return "Friday";
    }

    @Override
    public String saturday() {
        return "Saturday";
    }

    @Override
    public String sunday() {
        return "Sunday";
    }

    @Override
    public String noCorrect() {
        return "Please input a valid number between 1 and 7";
    }
}
