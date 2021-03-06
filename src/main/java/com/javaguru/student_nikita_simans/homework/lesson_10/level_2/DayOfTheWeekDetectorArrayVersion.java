package com.javaguru.student_nikita_simans.homework.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int realDayNumber = number - 1;
        return days[realDayNumber];
    }
}