package com.javaguru.student_jekaterina_ola.lesson_10.lesson_2_intern;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thrusday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid Input";
        }
    }
}
