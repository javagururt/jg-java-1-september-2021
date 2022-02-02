package com.javaguru.student_ruslan_pankratov.lesson_15.level_3;

public class TennisGame2 implements TennisGame {
    public int p1Point = 0;
    public int p2Point = 0;

    public String p1Res = "";
    public String p2Res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String score() {
        String score = "";
        if (p1Point == p2Point && p1Point < 4) {
            score = equals(p1Point, score);
        }

        if (p1Point == p2Point && p1Point >= 3) {
            score = "Deuce";
        }

        if (p1Point > 0 && p2Point == 0) {
            score = p2Zero(p1Point);
        }

        if (p1Point > p2Point && p1Point < 4) {
            score = p2Smaller();
        }

        return score = win(score);

    }


    private String equals(int P1point, String score) {
        if (P1point == 0) {
            score = "Love";
        }
        if (P1point == 1) {
            score = "Fifteen";
        }
        if (P1point == 2) {
            score = "Thirty";
        }
        score += "-All";

        return score;
    }

    private String p2Zero(int P1point) {

        if (P1point == 1) {
            p1Res = "Fifteen";
        }
        if (P1point == 2) {
            p1Res = "Thirty";
        }
        if (P1point == 3) {
            p1Res = "Forty";
        }
        p2Res = "Love";
        String score = p1Res + "-" + p2Res;
        return score;
    }

    private String p2Smaller() {
        if (p1Point == 2) {
            p1Res = "Thirty";
        }
        if (p1Point == 3) {
            p1Res = "Forty";
        }
        if (p2Point == 1) {
            p2Res = "Fifteen";
        }
        if (p2Point == 2) {
            p2Res = "Thirty";
        }
        return p1Res + "-" + p2Res;

    }

    private String win(String score) {

        if (p1Point > p2Point && p2Point >= 3) {
            score = "Advantage player1";
        }

        if (p2Point > p1Point && p1Point >= 3) {
            score = "Advantage player2";
        }

        if (p1Point >= 4 && p2Point >= 0 && (p1Point - p2Point) >= 2) {
            score = "Win for player1";
        }
        if (p2Point >= 4 && p1Point >= 0 && (p2Point - p1Point) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void P1Score() {
        p1Point++;
    }

    public void P2Score() {
        p2Point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}
