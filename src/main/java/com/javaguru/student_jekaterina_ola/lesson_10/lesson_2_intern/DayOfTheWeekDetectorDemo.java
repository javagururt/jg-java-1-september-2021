package com.javaguru.student_jekaterina_ola.lesson_10.lesson_2_intern;

//Цель этой программы:
//        - запросить у пользователя число;
//        - с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
//        - вывести на консоль найденное название.

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo {
    public static void main (String[] args) {
        run();}

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeek, int number) {
        DayOfTheWeekDetector day = dayOfTheWeek;
        String array = day.detectDayName(number);
        System.out.println(array);
    }


    static void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        DayOfTheWeekDetectorIfVersion day1 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo day1Demo = new DayOfTheWeekDetectorDemo(day1, number);

        int number2 = scanner.nextInt();
        DayOfTheWeekDetectorIfVersion day2 = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo day2Demo = new DayOfTheWeekDetectorDemo(day2, number);

    }
}