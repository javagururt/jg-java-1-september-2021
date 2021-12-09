package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_4
@CodeReview(approved = true)
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{


    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return monday();
        } else if (number == 2) {
            return tuesday();
        } else if (number == 3) {
            return wednesday();
        } else if (number == 4) {
            return thursday();
        } else if (number == 5) {
            return friday();
        } else if (number == 6) {
            return saturday();
        } else if (number == 7) {
            return sunday();
        } else {
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