package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;
public class TennisGame3 implements TennisGame {
//36 lines of code at begining
    private int player2Points;
    private int player1Points;
    private String player1Name;
    private String player2Name;
    private final String[] pointNames = new String[]{"Love", "Fifteen", "Thirty", "Forty"};


    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String score() {
        String resultingString;
        if (player1Points >= 4 || player2Points >= 4 || player1Points + player2Points == 6) {
            if (player1Points == player2Points)
                return "Deuce";
            resultingString = player1Points > player2Points ? player1Name : player2Name;
            return ((player1Points - player2Points)*(player1Points - player2Points) == 1) ? "Advantage " + resultingString : "Win for " + resultingString;
        } else {
            resultingString = pointNames[player1Points];
            return (player1Points == player2Points) ? resultingString + "-All" : resultingString + "-" + pointNames[player2Points];
        }
    }

    public void wonPoint(String playerName) {
        if (playerName == player1Name)
            this.player1Points += 1;
        else
            this.player2Points += 1;

    }

}