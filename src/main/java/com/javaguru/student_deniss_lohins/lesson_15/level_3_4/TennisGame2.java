package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;
public class TennisGame2 implements TennisGame {
    public int P1point = 0;
    public int P2point = 0;

    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String score() {
        String resultScore = "";
        if (P1point == P2point && P1point < 4) {
            if (P1point==0)
                resultScore = "Love";
            if (P1point==1)
                resultScore = "Fifteen";
            if (P1point==2)
                resultScore = "Thirty";
            resultScore += "-All";
        }
        if (P1point==P2point && P1point>=3)
            resultScore = "Deuce";

        if (P1point > 0 && P2point==0) {
            if (P1point==1)
                P1res = "Fifteen";
            if (P1point==2)
                P1res = "Thirty";
            if (P1point==3)
                P1res = "Forty";

            P2res = "Love";
            resultScore = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0) {
            if (P2point==1)
                P2res = "Fifteen";
            if (P2point==2)
                P2res = "Thirty";
            if (P2point==3)
                P2res = "Forty";

            P1res = "Love";
            resultScore = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4) {
            if (P1point==2)
                P1res="Thirty";
            if (P1point==3)
                P1res="Forty";
            if (P2point==1)
                P2res="Fifteen";
            if (P2point==2)
                P2res="Thirty";
            resultScore = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4) {
            if (P2point==2)
                P2res="Thirty";
            if (P2point==3)
                P2res="Forty";
            if (P1point==1)
                P1res="Fifteen";
            if (P1point==2)
                P1res="Thirty";
            resultScore = P1res + "-" + P2res;
        }

        if (P1point > P2point && P2point >= 3) {
            resultScore = "Advantage player1";
        }

        if (P2point > P1point && P1point >= 3) {
            resultScore = "Advantage player2";
        }

        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2) {
            resultScore = "Win for player1";
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2) {
            resultScore = "Win for player2";
        }
        return resultScore;
    }

    public void SetP1Score(int number) {
        for (int i = 0; i < number; i++) {
            P1Score();
        }

    }

    public void SetP2Score(int number){
        for (int i = 0; i < number; i++){
            P2Score();
        }
    }

    public void P1Score() {
        P1point++;
    }

    public void P2Score() {
        P2point++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            P1Score();
        else
            P2Score();
    }
}