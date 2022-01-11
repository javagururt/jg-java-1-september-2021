package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;
    String[] scoreNames = {
            "Love",
            "Fifteen",
            "Thirty",
            "Forty"
    };

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (player1Name.equalsIgnoreCase(playerName))
            player1Score += 1;
        else
            player2Score += 1;
    }

    @Override
    public String score() {

        String scoreToReturn = "";
        if (player1Score == player2Score) {
            scoreToReturn = sameResultsForBothPlayers();
        } else if (player1Score >= 4 || player2Score >= 4) {
            scoreToReturn = scoreAbove4ForBothPlayers();
        } else {
            scoreToReturn = scoreNames[player1Score] + "-" + scoreNames[player2Score];
        }
        return scoreToReturn;

    }

    private String sameResultsForBothPlayers() {
        String scoreToReturn;
        if(player1Score < 3){
            scoreToReturn = scoreNames[player1Score] + "-All";
        }else{
            scoreToReturn = "Deuce";
        }

        return scoreToReturn;
    }

    private String scoreAbove4ForBothPlayers() {
        String scoreToReturn;
        int firstAndSecondPlayerResultDelta = player1Score - player2Score;
        if (firstAndSecondPlayerResultDelta == 1) scoreToReturn = "Advantage " + player1Name;
        else if (firstAndSecondPlayerResultDelta == -1) scoreToReturn = "Advantage " + player2Name;
        else if (firstAndSecondPlayerResultDelta >= 2) scoreToReturn = "Win for " + player1Name;
        else scoreToReturn = "Win for " + player2Name;
        return scoreToReturn;
    }
}