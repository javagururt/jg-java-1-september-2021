package com.javaguru.student_deniss_lohins.lesson_10.level_2;

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
