package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface TennisGame {

    void wonPoint(String playerName);

    String score();
}
