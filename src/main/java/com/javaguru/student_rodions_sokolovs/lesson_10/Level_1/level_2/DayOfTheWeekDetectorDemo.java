package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1.level_2;
import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        runn();
    }

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayz, int number) {
        DayOfTheWeekDetector day = dayz;
        String arr = day.detectDayName(number);
        System.out.println(arr);
    }

    static void runn(){
        System.out.print("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        DayOfTheWeekDetectorIfVersion firstDay = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo dayFirst = new DayOfTheWeekDetectorDemo(firstDay, number);

        System.out.print("Please enter number: ");
        int numberTwo = scanner.nextInt();
        DayOfTheWeekDetectorTEST secondDay = new DayOfTheWeekDetectorTEST();
        DayOfTheWeekDetectorDemo daySecond = new DayOfTheWeekDetectorDemo(secondDay, numberTwo);

        System.out.print("Please enter number: ");
        int numberThree = scanner.nextInt();
        DayOfTheWeekDetectorTETS2 thirdDay = new DayOfTheWeekDetectorTETS2();
        DayOfTheWeekDetectorDemo dayThird = new DayOfTheWeekDetectorDemo(thirdDay,numberThree);

    }

}

