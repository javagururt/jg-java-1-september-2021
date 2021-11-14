package com.javaguru.student_dmitrii_faierberg.lesson_6.level_5_and_level_6;

import java.util.Scanner;

class TicTacToe {
    public int[][] createField(){
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                field[i][j] = -1;
            }
        }
        return field;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck){
        int winStreak = 0;
        for (int i = 0; i < field.length; i++){
            winStreak = 0;
            for(int j = 0; j < field[i].length; j++){
                if (field[i][j] == playerToCheck){
                    winStreak++;
                }
            }
            if (winStreak == 3) return true;
        }
        return false;
    }
    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck){
        int winStreak = 0;
        for (int i = 0; i < field.length; i++){
            winStreak = 0;
            for(int j = 0; j < field[i].length; j++){
                if (field[j][i] == playerToCheck){
                    winStreak++;
                }
            }
            if (winStreak == 3) return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck){
        int winStreakLeft = 0;
        int winStreakRight = 0;
        for (int i = 0; i < field.length; i++){
            for(int j = 0; j < field[i].length; j++){
                if (i == j){
                    if (field[i][j] == playerToCheck){
                        winStreakLeft++;
                        if (i == 1) winStreakRight++;
                    }
                } else if (i + j == 2) {
                    if (field[i][j] == playerToCheck) {
                        winStreakRight++;
                    }
                }
            }
            if (winStreakLeft == 3) return true;
            if (winStreakRight == 3) return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck){
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field){
        if (!isWinPosition(field, 1) && !isWinPosition(field, 0)){
            for (int i = 0; i < field.length; i++){
                for(int j = 0; j < field[i].length; j++){
                    if (field[i][j] == -1) return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public Move getNextMove() {
        System.out.print("Enter coordinates of a cell: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field[i].length; j++){
                System.out.print(field[i][j] + "\t");
            }
            System.out.println();;
        }
        // распечатайте поле на консоль в читаемом формате
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            //printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
