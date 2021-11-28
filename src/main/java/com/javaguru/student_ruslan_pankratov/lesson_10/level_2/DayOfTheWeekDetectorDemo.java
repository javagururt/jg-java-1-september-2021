package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import java.util.Scanner;

//Task_5
class DayOfTheWeekDetectorDemo{
    public static void main(String[] args) {
        run();
    }

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayVers, int number) {
        DayOfTheWeekDetector day = dayVers;
       String arr = day.detectDayName(number);
        System.out.println(arr);
    }

  static void run(){
       Scanner scanner = new Scanner(System.in);
       int number = scanner.nextInt();
       DayOfTheWeekDetectorIfVersion dayOne = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo day = new DayOfTheWeekDetectorDemo(dayOne, number);

      int numberTwo = scanner.nextInt();
        DayOfTheWeekDetectorIfVersionTwo dayTwo = new DayOfTheWeekDetectorIfVersionTwo();
        DayOfTheWeekDetectorDemo dayTwoDemo = new DayOfTheWeekDetectorDemo(dayTwo, numberTwo);

      int numberThree = scanner.nextInt();
        DayOfTheWeekDetectorIfVersionThree dayThree = new DayOfTheWeekDetectorIfVersionThree();
        DayOfTheWeekDetectorDemo dayThreeDemo = new DayOfTheWeekDetectorDemo(dayThree,numberThree);

   }
}
