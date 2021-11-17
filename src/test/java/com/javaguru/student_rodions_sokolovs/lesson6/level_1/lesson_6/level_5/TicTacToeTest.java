package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.level_5;

import com.javaguru.student_rodions_sokolovs.lesson_6.level_5.TicTacToe;
import org.junit.Test;

import static org.junit.Assert.*;


public class TicTacToeTest {
    private TicTacToe victim;

    @Test
    public void ShouldWinHorizontal() {
        victim = new TicTacToe();
        int field[][] = {
                {-1, -1, -1},
                {-1, 1, 1},
                {0, 0, 0}
        };
        assertFalse(victim.isWinPositionForHorizontals(field, 1));
        assertTrue(victim.isWinPositionForHorizontals(field, 0));
    }

    @Test
    public void ShouldWinVertical() {
        victim = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {1, 0, 1},
                {-1, -1, 1}
        };
        assertTrue(victim.isWinPositionForVerticals(field, 1));
        assertFalse(victim.isWinPositionForVerticals(field, 0));
    }

    @Test
    public void ShouldWinDiagonal() {
        victim = new TicTacToe();
        int[][] field = {
                {0, -1, 1},
                {1, 0, 1},
                {0, 1, 0}
        };
        assertTrue(victim.isWinPositionForDiagonals(field, 0));
        assertFalse(victim.isWinPositionForDiagonals(field, 1));
    }

    @Test
    public void ShouldPositionWin() {
        victim = new TicTacToe();
        int[][] field = {
                {0, -1, 1},
                {1, 0, 1},
                {0, 1, 0}
        };
        assertTrue(victim.isWinPosition(field, 0));
        assertFalse(victim.isWinPosition(field, 1));
    }

    @Test
    public void ShouldPositionisDraw() {
        victim = new TicTacToe();
        int[][] field = {
                {1, 0, 1},
                {0, 1, 1},
                {0, 1, 0}
        };
        assertTrue(victim.isDrawPosition(field));
    }

    @Test
    public void CrateField() {
        victim = new TicTacToe();
        int[][] exp = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        assertArrayEquals(exp ,victim.createField());
    }
}

