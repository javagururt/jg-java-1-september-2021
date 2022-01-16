package com.javaguru.student_dmitrii_faierberg.lesson_15.level_3_4.someNonsense;

class TennisGamePointsCounter implements TennisGame{
    private Player player1;
    private Player player2;
    ScoreNames scoreNames;
    boolean isDeuce;
    int advantage; // 1 - player1, 2 - player2
    boolean isEnd;
    String result;

    public TennisGamePointsCounter(String playerName1, String playerName2){
        player1.setName(playerName1);
        player2.setName(playerName2);
        isDeuce = false;
        advantage = 0;
        isEnd = false;
        result = "no winner or advantage";
    }

    public void wonPoint(String playerName){
        isDeuce = false;
        advantage = 0;

        if (player1.name.equals(playerName))
            player1.increase();
        else if (player2.name.equals(playerName)){
            player2.increase();
        } else {
            return;
        }
        isDeuce = isDeuce(player1, player2);
        result = analyzedResult(getResult(player1, player2));
    }

    private boolean isDeuce(Player player1, Player player2) {
        int score1 = player1.getIntScore();
        int score2 = player2.getIntScore();

        if (score1 > 2 && score2 > 2){
            return score1 == score2;
        }
        return false;
    }

    private int getResult(Player player1, Player player2){
        int score1 = player1.getIntScore();
        int score2 = player2.getIntScore();

        if (score1 > score2 && score1 - score2 == 1){
            return 1;
        } else if (score2 > score1 && score2 - score1 == 1){
            return 2;
        }else if (score1 > score2 && score1 - score2 == 2){
            return 3;
        } else if (score2 > score1 && score2 - score1 == 2){
            return 4;
        } else
            return 0;
    }

    private String analyzedResult(int value){
        if (value == 0){
            return "no winner or advantage";
        } else if (value == 1){
            return "Advantage " + player1.name;
        } else if (value == 2){
            return "Advantage " + player2.name;
        } else if (value == 3) {
            isEnd = true;
            return "Win " + player1.name;
        } else if (value == 4) {
            isEnd = true;
            return "Win " + player2.name;
        } else {
            return "Some error occurred";
        }
    }


    public String score(){
        if (!result.equals("no winner or advantage")){
            return result;
        } else if (isDeuce){
            return "Deuce";
        } else
            return  player1.getScore() + " - " + player2.getScore();
    }
}
