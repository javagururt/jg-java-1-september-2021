package com.javaguru.student_deniss_lohins.lesson_10.level_2;

class DayOfTheWeekDetectorSwitchVersionImpl implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        switch (number){
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
                return "Wrong number";
        }
    }
}
