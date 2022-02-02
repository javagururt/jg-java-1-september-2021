package com.javaguru.student_dmitrii_faierberg.lesson_15.level_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TennisGame {
    void wonPoint(String playerName);
    String score();
}

