package com.javaguru.student_dmitrii_faierberg.lesson_15.level_3_4.someNonsense;

class Player {
    private String score;
    private int intScore = 0;
    String name;

    private final ScoreNames scoreNames = new ScoreNames();

    public String getScore() {
        return score;
    }

    public int getIntScore(){
        return intScore;
    }

    public void setIntScore(int value){
        intScore = value;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increase(){
        intScore++;
        if (intScore < 4){
            score = scoreNames.scores.get(intScore);
        }
    }
}
