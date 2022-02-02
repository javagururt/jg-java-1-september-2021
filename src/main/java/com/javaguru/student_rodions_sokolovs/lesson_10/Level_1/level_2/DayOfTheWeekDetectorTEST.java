package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorTEST implements  DayOfTheWeekDetector {

    public String monday() {
        return "Monday";
    }


    public String tuesday() {
        return "Tuesday";
    }


    public String wednesday() {
        return "Wednesday";
    }


    public String thursday() {
        return "Thursday";
    }


    public String friday() {
        return "Friday";
    }


    public String saturday() {
        return "Saturday";
    }


    public String sunday() {
        return "Sunday";
    }


    public String noCorrect() {
        return "Please input a valid number between 1 and 7";
    }


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
}
