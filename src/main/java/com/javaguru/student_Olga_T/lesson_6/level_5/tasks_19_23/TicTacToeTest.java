package com.javaguru.student_Olga_T.lesson_6.level_5.tasks_19_23;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsX();
        test.isWinPositionForHorizontalsNegativeX();
        test.isWinPositionForVerticalsX();
        test.isWinPositionForVerticalsNegativeX();
        test.isWinPositionForDiagonalsX();
        test.isWinPositionForDiagonalsNegativeX();
        test.isWinPositionForHorizontals0();
        test.isWinPositionForHorizontalsNegative0();
        test.isWinPositionForVerticals0();
        test.isWinPositionForVerticalsNegative0();
        test.isWinPositionForDiagonals0();
        test.isWinPositionForDiagonalsNegative0();
        test.isWinPositionX();
        test.isWinPositionNegativeX();
        test.isWinPosition0();
        test.isWinPositionNegative0();
        test.isDrawPosition();
        test.createField();
    }

    public void allTests(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL");
        }
    }

    public void isWinPositionForHorizontalsX() {
        TicTacToe isWinPositionForHorizontals = new TicTacToe();
        int[][] field = {{1, 1, 1,}, {0, 0, 1}, {1, 1, 0}};
        boolean result = isWinPositionForHorizontals.isWinPositionForHorizontals(field, 1);
        allTests(result, "isWinPositionForHorizontalsX");
    }

    public void isWinPositionForHorizontalsNegativeX() {
        TicTacToe isWinPositionForHorizontals = new TicTacToe();
        int[][] field = {{1, 1, 0,}, {0, 0, 1}, {1, 1, 0}};
        boolean result = isWinPositionForHorizontals.isWinPositionForHorizontals(field, 1);
        allTests(!result, "isWinPositionForHorizontalsNegativeX");
    }

    public void isWinPositionForVerticalsX() {
        TicTacToe isWinPositionForVerticals = new TicTacToe();
        int[][] field = {{1, 0, 1,}, {1, 1, 0}, {1, 0, 0}};
        boolean result = isWinPositionForVerticals.isWinPositionForVerticals(field, 1);
        allTests(result, "isWinPositionForVerticalsX");
    }

    public void isWinPositionForVerticalsNegativeX() {
        TicTacToe isWinPositionForVerticals = new TicTacToe();
        int[][] field = {{1, 0, 1,}, {0, 1, 0}, {1, 0, 0}};
        boolean result = isWinPositionForVerticals.isWinPositionForVerticals(field, 1);
        allTests(!result, "isWinPositionForVerticalsNegativeX");
    }

    public void isWinPositionForDiagonalsX() {
        TicTacToe isWinPositionForDiagonals = new TicTacToe();
        int[][] field = {{1, 1, 0,}, {0, 1, 1}, {1, 0, 1}};
        boolean result = isWinPositionForDiagonals.isWinPositionForDiagonals(field, 1);
        allTests(result, "isWinPositionForDiagonalsX");
    }

    public void isWinPositionForDiagonalsNegativeX() {
        TicTacToe isWinPositionForDiagonals = new TicTacToe();
        int[][] field = {{1, 1, 0,}, {0, 1, 1}, {1, 0, 0}};
        boolean result = isWinPositionForDiagonals.isWinPositionForDiagonals(field, 1);
        allTests(!result, "isWinPositionForDiagonalsNegativeX");
    }

    public void isWinPositionForHorizontals0() {
        TicTacToe isWinPositionForHorizontals = new TicTacToe();
        int[][] field = {{0, 0, 0,}, {1, 1, 0}, {0, 0, 1}};
        boolean result = isWinPositionForHorizontals.isWinPositionForHorizontals(field, 0);
        allTests(result, "isWinPositionForHorizontals0");
    }

    public void isWinPositionForHorizontalsNegative0() {
        TicTacToe isWinPositionForHorizontals = new TicTacToe();
        int[][] field = {{0, 0, 1,}, {1, 1, 0}, {0, 0, 1}};
        boolean result = isWinPositionForHorizontals.isWinPositionForHorizontals(field, 0);
        allTests(!result, "isWinPositionForHorizontalsNegative0");
    }

    public void isWinPositionForVerticals0() {
        TicTacToe isWinPositionForVerticals = new TicTacToe();
        int[][] field = {{0, 1, 0,}, {0, 0, 1}, {0, 1, 1}};
        boolean result = isWinPositionForVerticals.isWinPositionForVerticals(field, 0);
        allTests(result, "isWinPositionForVerticals0");
    }

    public void isWinPositionForVerticalsNegative0() {
        TicTacToe isWinPositionForVerticals = new TicTacToe();
        int[][] field = {{0, 1, 0,}, {1, 0, 1}, {0, 1, 1}};
        boolean result = isWinPositionForVerticals.isWinPositionForVerticals(field, 0);
        allTests(!result, "isWinPositionForVerticalsNegative0");
    }

    public void isWinPositionForDiagonals0() {
        TicTacToe isWinPositionForDiagonals = new TicTacToe();
        int[][] field = {{0, 0, 1,}, {1, 0, 0}, {0, 1, 0}};
        boolean result = isWinPositionForDiagonals.isWinPositionForDiagonals(field, 0);
        allTests(result, "isWinPositionForDiagonals0");
    }

    public void isWinPositionForDiagonalsNegative0() {
        TicTacToe isWinPositionForDiagonals = new TicTacToe();
        int[][] field = {{0, 0, 1,}, {1, 0, 0}, {0, 1, 1}};
        boolean result = isWinPositionForDiagonals.isWinPositionForDiagonals(field, 0);
        allTests(!result, "isWinPositionForDiagonalsNegative0");
    }

    public void isWinPositionX() {
        TicTacToe isWinPosition = new TicTacToe();
        int[][] field = {{1, 1, 1,}, {1, 0, 0}, {0, 1, 1}};
        boolean result = isWinPosition.isWinPosition(field, 1);
        allTests(result, "isWinPositionX");
    }

    public void isWinPositionNegativeX() {
        TicTacToe isWinPosition = new TicTacToe();
        int[][] field = {{0, 0, 1,}, {1, 0, 0}, {0, 1, 1}};
        boolean result = isWinPosition.isWinPosition(field, 1);
        allTests(!result, "isWinPositionNegativeX");
    }

    public void isWinPosition0() {
        TicTacToe isWinPosition = new TicTacToe();
        int[][] field = {{0, 0, 0,}, {0, 1, 1}, {1, 0, 0}};
        boolean result = isWinPosition.isWinPosition(field, 0);
        allTests(result, "isWinPosition0");
    }

    public void isWinPositionNegative0() {
        TicTacToe isWinPosition = new TicTacToe();
        int[][] field = {{1, 1, 0,}, {0, 1, 1}, {1, 0, 0}};
        boolean result = isWinPosition.isWinPosition(field, 0);
        allTests(!result, "isWinPositionNegative0");
    }


    public void isDrawPosition() {
        TicTacToe isDrawPosition = new TicTacToe();
        int[][] field = {{1, 0, 1,}, {1, 0, 0}, {0, 1, 1}};
        boolean result = isDrawPosition.isDrawPosition(field);
        allTests(result, "isDrawPosition");
    }

    public void createField() {
        TicTacToe createField = new TicTacToe();
        int[][] tempArray = createField.createField();
        boolean result = false;
        if (tempArray[0][0] == -1 && tempArray[1][1] == -1 && tempArray[2][2] == -1) {
            result = true;
        }
        allTests(result, "createField");
    }

}
