package com.javaguru.student_nikita_simans.homework.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDemo {

    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDemo(DayOfTheWeekDetector version) {
        detector = version;

    }

    void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day number: ");
        int day = sc.nextInt();
        String result = detector.detectDayName(day);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector version = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDemo tester = new DayOfTheWeekDemo(version);
        tester.run();
    }
}
