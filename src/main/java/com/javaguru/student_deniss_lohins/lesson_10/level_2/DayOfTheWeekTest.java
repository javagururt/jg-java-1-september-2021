package com.javaguru.student_deniss_lohins.lesson_10.level_2;

class DayOfTheWeekTest {
    public static void main(String[] args) {

        DayOfTheWeekDetector ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector switchVersion = new DayOfTheWeekDetectorSwitchVersionImpl();
        DayOfTheWeekDetector arrayVersion = new DayOfTheWeekDetectorArrayVersionImpl();
        for (int i = 1; i <= 7; i++) {
            System.out.println("if version " + ifVersion.detectDayName(i));
            System.out.println("switch version " + switchVersion.detectDayName(i));
            System.out.println("array version "+ arrayVersion.detectDayName(i));
        }


    }
}
