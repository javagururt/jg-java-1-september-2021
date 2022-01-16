package com.javaguru.student_dmitrii_faierberg.lesson_15.level_3_4;

class TennisGame3 implements TennisGame{
    private int score1;
    private int score2;
    private String playerName1;
    private String playerName2;

    public TennisGame3(String p1N, String p2N) {
        this.playerName1 = p1N;
        this.playerName2 = p2N;
    }

    public String score() {
        String s;
        if (isNotDeuce()) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[score2];
            return (score2 == score1) ? s + "-All" : s + "-" + p[score1];
        } else {
            if (score2 == score1)
                return "Deuce";
            s = score2 > score1 ? playerName1 : playerName2;
            return ((score2 - score1)*(score2 - score1) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    private boolean isNotDeuce() {
        return score2 < 4 && score1 < 4 && !(score2 + score1 == 6);
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.score2 += 1;
        else
            this.score1 += 1;

    }
}
