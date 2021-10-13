package com.javaguru.student_ruslan_pankratov.lesson_6.level_2;

import java.util.Scanner;

//Task_7-11
class DayOfTheWeekDetector {


    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7 : ");
        int dayNumber = scanner.nextInt();
        return dayNumber;
    }

    public String findDayOfTheWeek(int dayNumber){
       return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not correct day number";
        };

    }
}
