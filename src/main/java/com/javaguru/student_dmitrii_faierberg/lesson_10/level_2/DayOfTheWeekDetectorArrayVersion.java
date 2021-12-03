package com.javaguru.student_dmitrii_faierberg.lesson_10.level_2;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number){
        int indexNumber = number - 1;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"};
        if (indexNumber >= 0 && indexNumber < days.length){
            return days[indexNumber];
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }

}
