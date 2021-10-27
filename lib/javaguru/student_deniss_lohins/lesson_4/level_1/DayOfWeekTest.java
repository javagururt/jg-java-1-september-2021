package com.javaguru.student_deniss_lohins.lesson_4.level_1;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;

import java.util.Scanner;
@CodeReview(approved = true)
class DayOfWeekTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 7:  ");
        int dayNumber = sc.nextInt();
        DayOfWeek day = new DayOfWeek();
        day.dayOfWheek(dayNumber);


    }


}
