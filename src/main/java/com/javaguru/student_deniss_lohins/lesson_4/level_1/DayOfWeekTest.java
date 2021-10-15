package com.javaguru.student_deniss_lohins.lesson_4.level_1;

import java.util.Scanner;

class DayOfWeekTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7:  ");
        int dayNumber = sc.nextInt();
        DayOfWeek day = new DayOfWeek();
        day.dayOfWheek(dayNumber);


    }


}
