package com.javaguru.student_dmitrii_faierberg.lesson_15.level_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TennisGame1 implements TennisGame {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String score() {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2) {
            score = getEqualScore();
        }
        else if (m_score1>=4 || m_score2>=4) {
            score = getDifference();
        }
        else {
            score = getScore(score);
        }
        return score;
    }

    private String getScore(String score) {
        int tempScore;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i<3; i++) {
            if (i==1) tempScore = m_score1;
            else { scoreBuilder.append("-"); tempScore = m_score2;}
            switch (tempScore) {
                case 0 -> scoreBuilder.append("Love");
                case 1 -> scoreBuilder.append("Fifteen");
                case 2 -> scoreBuilder.append("Thirty");
                case 3 -> scoreBuilder.append("Forty");
            }
        }
        score = scoreBuilder.toString();
        return score;
    }

    private String getDifference() {
        String score;
        int minusResult = m_score1-m_score2;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private String getEqualScore() {
        String score = switch (m_score1) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
        return score;
    }
}
