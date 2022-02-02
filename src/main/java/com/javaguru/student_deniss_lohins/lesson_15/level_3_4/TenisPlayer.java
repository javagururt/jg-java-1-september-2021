package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TenisPlayer {
    private int score;
    private String name;

    public TenisPlayer(String name) {
        this.name = name;
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getResult() {
        switch (score){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return "wrong score";
    }

    public void increaseScore() {
        this.score = score + 1;
    }

    public String getName() {
        return name;
    }

}
