package com.javaguru.student_deniss_lohins.lesson_15.level_3_4;

class TenissGamePointCounter implements TennisGame {

    TenisPlayer playerOne;
    TenisPlayer playerTwo;

    public TenissGamePointCounter(String player1, String player2) {
        playerOne = new TenisPlayer(player1);
        playerTwo = new TenisPlayer(player2);
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerOne.getName().equalsIgnoreCase(playerName)) {
            playerOne.increaseScore();
        } else if (playerTwo.getName().equalsIgnoreCase(playerName)) {
            playerTwo.increaseScore();
        }
    }

    @Override
    public String score() {
        if (playerOne.getScore() < 4 && playerTwo.getScore() < 3) {
            String resultString = playerOne.getResult() + " - " + playerTwo.getResult();
            return resultString;
        } else if (playerOne.getScore() < 3 && playerTwo.getScore() < 4) {
            String resultString = playerOne.getResult() + " - " + playerTwo.getResult();
            return resultString;
        } else if (playerOne.getScore() == 4 && playerTwo.getScore() < 3) {
            return "Win " + playerOne.getName();
        } else if (playerTwo.getScore() == 4 && playerOne.getScore() < 3) {
            return "Win " + playerTwo.getName();
        } else if (playerOne.getScore() == playerTwo.getScore() && playerOne.getScore() >= 3) {
            return "Deuce";
        } else if (playerOne.getScore() >= 3 && playerOne.getScore() == playerTwo.getScore() + 1) {
            return "Advantage " + playerOne.getName();
        } else if (playerOne.getScore() >= 3 && playerOne.getScore() == playerTwo.getScore() + 2) {
            return "Win " + playerOne.getName();
        } else if (playerTwo.getScore() >= 3 && playerTwo.getScore() == playerOne.getScore() + 1) {
            return "Advantage " + playerTwo.getName();
        } else if (playerTwo.getScore() >= 3 && playerTwo.getScore() == playerOne.getScore() + 2) {
            return "Win " + playerTwo.getName();
        }
        return "Error";

    }


}



