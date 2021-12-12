package com.javaguru.student_ruslan_pankratov.lesson_10.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_4
@CodeReview(approved = true)
interface DayOfTheWeekDetector {

    String detectDayName(int number);

    String monday();

    String tuesday();

    String wednesday();

    String thursday();

    String friday();

    String saturday();

    String sunday();

    String noCorrect();
}