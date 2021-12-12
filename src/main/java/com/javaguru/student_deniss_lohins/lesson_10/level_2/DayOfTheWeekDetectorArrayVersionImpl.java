package com.javaguru.student_deniss_lohins.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersionImpl implements DayOfTheWeekDetector{

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
        return days[number - 1];
    }
}
