package com.javaguru.student_dmitrii_faierberg.lesson_10.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeek;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector obj) {
        dayOfTheWeek = obj;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = dayOfTheWeek.detectDayName(number);
        System.out.println(result);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion objIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(objIf);
        System.out.println("If version:");
        demo.run();
        System.out.println("------------");

        DayOfTheWeekDetectorArrayVersion objArr = new DayOfTheWeekDetectorArrayVersion();
        demo = new DayOfTheWeekDetectorDemo(objArr);
        System.out.println("Array version:");
        demo.run();
        System.out.println("------------");

        var objSwitch = new DayOfTheWeekDetectorSwitchVersion();
        demo = new DayOfTheWeekDetectorDemo(objSwitch);
        System.out.println("Switch version:");
        demo.run();
    }
}
