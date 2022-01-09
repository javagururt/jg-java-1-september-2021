package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

public class TennisGame2 implements TennisGame {
    public int player1Points = 0;
    public int player2Points = 0;

    public String player1Result = "";
    public String player2Result = "";

    String[] scoreNames = {
            "Love",
            "Fifteen",
            "Thirty",
            "Forty"
    };

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String score() {
        String resultScore = "";
        if (player1Points == player2Points && player1Points < 4) {
            resultScore = scoreNames[player1Points];
            resultScore += "-All";
        }
        if (player1Points == player2Points && player1Points >= 3) {
            resultScore = "Deuce";
        }

        if(player1Points <4 && player2Points < 4 && player2Points!= player1Points){
            resultScore = scoreNames[player1Points] + "-" + scoreNames[player2Points];
        }

        if (player1Points > player2Points && player2Points >= 3) {
            resultScore = "Advantage " + player1Name;
        }

        if (player2Points > player1Points && player1Points >= 3) {
            resultScore = "Advantage " + player2Name;
        }

        if (player1Points >= 4 && player2Points >= 0 && (player1Points - player2Points) >= 2) {
            resultScore = "Win for " + player1Name;
        }
        if (player2Points >= 4 && player1Points >= 0 && (player2Points - player1Points) >= 2) {
            resultScore = "Win for " + player2Name;
        }
        return resultScore;
    }

    public void player1Score() {
        player1Points++;
    }

    public void player2Score() {
        player2Points++;
    }

    public void wonPoint(String player) {
        if (player.equalsIgnoreCase(player1Name)) {
            player1Score();
        } else {
            player2Score();
        }
    }
}