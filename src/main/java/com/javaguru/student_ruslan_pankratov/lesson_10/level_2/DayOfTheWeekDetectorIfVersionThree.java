package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorIfVersionThree implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        if(number <= 7 && number >= 1){
            return arr[number - 1];
        } else {
            return arr[7];
        }

    }

    String[] arr = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
            , "Please input a valid number between 1 and 7"};

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
