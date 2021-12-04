package com.javaguru.student_deniss_lohins.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDemo {

    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDemo(DayOfTheWeekDetector implementation) {
        detector = implementation;

    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int day = sc.nextInt();
        String result = detector.detectDayName(day);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector implementation = new DayOfTheWeekDetectorArrayVersionImpl();
        DayOfTheWeekDemo runner = new DayOfTheWeekDemo(implementation);
        runner.run();
    }
}
