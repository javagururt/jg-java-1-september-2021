package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

public class TennisGame1 implements TennisGame {

    private int m_score1 = 0;
    private int m_score2 = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    @Override
    public String score() {
        String scoreReturn = "";
        int tempScore = 0;
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    scoreReturn = "Love-All";
                    break;
                case 1:
                    scoreReturn = "Fifteen-All";
                    break;
                case 2:
                    scoreReturn = "Thirty-All";
                    break;
                default:
                    scoreReturn = "Deuce";
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) scoreReturn = "Advantage player1";
            else if (minusResult == -1) scoreReturn = "Advantage player2";
            else if (minusResult >= 2) scoreReturn = "Win for player1";
            else scoreReturn = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = m_score1;
                else {
                    scoreReturn += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0:
                        scoreReturn += "Love";
                        break;
                    case 1:
                        scoreReturn += "Fifteen";
                        break;
                    case 2:
                        scoreReturn += "Thirty";
                        break;
                    case 3:
                        scoreReturn += "Forty";
                        break;
                }
            }
        }
        return scoreReturn;

    }
}