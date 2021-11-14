package com.javaguru.student_Olga_T.lesson_6.level_5.tasks_19_23;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) { // Task 27

        TicTacToe game = new TicTacToe();
        game.play();
    }

    public void play() { // Task 27
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            System.out.println();
            System.out.println("0 turn:");
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            // printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN! Game over! Please restart the game.");
                printFieldToConsole(field);
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW! Game over! Please restart the game.");
                printFieldToConsole(field);
                break;
            }

            printFieldToConsole(field);
            System.out.println();
            System.out.println("X turn:");
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            //  printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN! Game over! Please restart the game.");
                printFieldToConsole(field);
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW! Game over! Please restart the game.");
                printFieldToConsole(field);
                break;
            }
        }
    }

    public int[][] createField() { // Task 24
        int[][] table = new int[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                table[row][col] = -1;
        }
        return table;
    }

    public Move getNextMove() { // Task 25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter y-coordinate, x-coordinate: (1 or 2 or 3):");
        int x = scanner.nextInt() - 1; // потому что с нуля индексы идут
        int y = scanner.nextInt() - 1;
        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) { // Task 26
        System.out.println("0 1 2 3"); //нумерация поля по горизонтали
        for (int row = 0; row < 3; row++) {
            System.out.print((row + 1) + " "); //нумерация поля по вертикали
            for (int col = 0; col < 3; col++) {
                if (field[row][col] == 0) {
                    System.out.print("O" + " ");
                } else if (field[row][col] == 1) {
                    System.out.print("X" + " ");
                } else {
                    System.out.print("." + " ");

                }
            }
            System.out.println();
        }
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) { // Task 19
        for (int i = 0; i < 3; i++) {
            if ((field[i][0] == playerToCheck) && (field[i][1] == playerToCheck) && (field[i][2] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) { // Task 20
        for (int i = 0; i < 3; i++) {
            if ((field[0][i] == playerToCheck) && (field[1][i] == playerToCheck) && (field[2][i] == playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) { // Task 21
        if ((field[0][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[2][2] == playerToCheck)) {
            return true;
        } else if ((field[2][0] == playerToCheck) && (field[1][1] == playerToCheck) && (field[0][2] == playerToCheck)) {
            return true;
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) { // Task 22
        if (this.isWinPositionForHorizontals(field, playerToCheck) || this.isWinPositionForDiagonals(field, playerToCheck) || this.isWinPositionForVerticals(field, playerToCheck)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isDrawPosition(int[][] field) { // Task 23
        boolean isFieldEmpty = false;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (field[row][col] == -1) {
                    isFieldEmpty = true;
                }
            }
        }
        if (isFieldEmpty) {
            return false;
        } else if (isWinPosition(field, 0) || isWinPosition(field, 1)) {
            return false;
        } else {
            return true;
        }
    }
}













