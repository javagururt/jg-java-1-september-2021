package com.javaguru.student_ruslan_pankratov.lesson_6.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void isWinPositionForHorizontalsTestFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 1, 1},
                {-1, -1, -1},
                {-1, 0, 0}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, firstPlayer);

        assertFalse(result);

    }

    @Test
    public void isWinPositionForHorizontalsTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 1, 1},
                {-1, -1, -1},
                {-1, 0, 0}};
        int firstPlayer = 1;
        boolean result = ticTacToe.isWinPositionForHorizontals(field, firstPlayer);
        assertTrue(result);
    }

    @Test
    public void isWinPositionForVerticalsTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, -1},
                {1, -1, -1},
                {1, 0, 0}};

        int firstPlayer = 1;
        boolean result = ticTacToe.isWinPositionForVerticals(field, firstPlayer);
        assertTrue(result);
    }


    @Test
    public void isWinPositionForVerticalsTestFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, -1},
                {1, -1, -1},
                {1, 0, 0}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForVerticals(field, firstPlayer);
        assertFalse(result);

    }


    @Test
    public void isWinPositionForDiagonalsTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, 0},
                {1, 0, -1},
                {0, 1, -1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, firstPlayer);
        assertTrue(result);

    }

    @Test
    public void isWinPositionForDiagonalsOneTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {0, 0, 1},
                {1, 0, -1},
                {1, 1, 0}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, firstPlayer);
        assertTrue(result);

    }

    @Test
    public void isWinPositionForDiagonalsTestFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, -1},
                {1, 0, -1},
                {0, 1, -1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPositionForDiagonals(field, firstPlayer);
        assertFalse(result);
    }

    @Test
    public void isWinPositionTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, 0},
                {1, 0, -1},
                {0, 1, -1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPosition(field, firstPlayer);
        assertTrue(result);
    }

    @Test
    public void isWinPositionTestFalse() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 1, -1},
                {1, 1, -1},
                {1, 1, -1}};

        int firstPlayer = 0;
        boolean result = ticTacToe.isWinPosition(field, firstPlayer);
        assertFalse(result);
    }

    @Test
    public void isDrawPositionTestTrue() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] field = {
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}};

        boolean result = ticTacToe.isDrawPosition(field);
        assertTrue(result);
    }

    @Test
    public void isDrawPositionTestFalse() {
        TicTacToe ticTacToe = new TicTacToe();


        int[][] field = {
                {1, -1, 1},
                {0, 1, 1},
                {0, 1, 0}};

        boolean result = ticTacToe.isDrawPosition(field);
        assertFalse(result);

    }

    @Test
    public void createFieldTest() {
        TicTacToe ticTacToe = new TicTacToe();

        int[][] expectedResult = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};

        int[][] result = ticTacToe.createField();

        assertArrayEquals(result, expectedResult);

    }


}