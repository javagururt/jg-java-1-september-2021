package com.javaguru.student_dmitrii_faierberg.lesson_6.level_5_and_level_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class  TicTacToeTest {
    TicTacToe victim = new TicTacToe();
    @Test
    public void testWinPositionForHorizontalsTrue(){
        int[][] field = { {0,0,0}, {-1,0,1}, {1, 0, -1}};
        assertTrue(victim.isWinPositionForHorizontals(field, 0));
    }

    @Test
    public void testWinPositionForHorizontalsFalse(){
        int[][] field = { {0,0,0}, {-1,0,1}, {1, 0, -1}};
        assertFalse(victim.isWinPositionForHorizontals(field, 1));
    }

    @Test
    public void testWinPositionForVerticalsTrue(){
        int[][] field = { {0,0,0}, {-1,0,1}, {1, 0, -1}};
        assertTrue(victim.isWinPositionForVerticals(field, 0));
    }

    @Test
    public void testWinPositionForVerticalsFalse(){
        int[][] field = { {0,0,0}, {-1,0,1}, {1, 0, -1}};
        assertFalse(victim.isWinPositionForVerticals(field, 1));
    }

    @Test
    public void isWinPositionForLeftDiagonalTrueTest(){
        int[][] field = { {0,-1,1}, {-1,0,1}, {1, 0, 0}};
        assertTrue(victim.isWinPositionForDiagonals(field, 0));
    }
    @Test
    public void isWinPositionForLeftDiagonalFalseTest(){
        int[][] field = { {0,-1,1}, {-1,0,1}, {1, 0, 0}};
        assertFalse(victim.isWinPositionForDiagonals(field, 1));
    }

   @Test
    public void isWinPositionForRightDiagonalTrueTest(){
        int[][] field = { {0,-1,1}, {-1,1,0}, {1, 0, 0}};
        assertTrue(victim.isWinPositionForDiagonals(field, 1));
    }

    @Test
    public void isWinPositionForRightDiagonalFalseTest(){
        int[][] field = { {0,-1,1}, {-1,1,0}, {1, 0, 0}};
        assertFalse(victim.isWinPositionForDiagonals(field, 0));
    }

    @Test
    public void isWinPositionTest1(){
        int[][] field = {{1, 1, 1}, {-1, 0, 0}, {0,-1, 1}};
        assertTrue(victim.isWinPosition(field, 1));
    }

    @Test
    public void isWinPositionTest2(){
        int[][] field = {{1, 0, 1}, {-1, 0, 1}, {0,-1, 1}};
        assertTrue(victim.isWinPosition(field, 1));
    }

    @Test
    public void isWinPositionTest3(){
        int[][] field = {{1, 1, 1}, {-1, 1, 0}, {0,-1, 1}};
        assertTrue(victim.isWinPosition(field, 1));
    }

    @Test
    public void isWinPositionTest4(){
        int[][] field = {{1, 0, 1},
                        {0, 1, 0},
                        {0, 1, 0}};
        assertFalse(victim.isWinPosition(field, 1));
    }

    @Test
    public void drawPositionTrue(){
        int[][] field = {{1, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};
        assertTrue(victim.isDrawPosition(field));
    }

    @Test
    public void drawPositionFalse(){
        int[][] field = {{1, 0, 1},
                {0, 1, 0},
                {0, 1, -1}};
        assertFalse(victim.isDrawPosition(field));
    }

    @Test
    public void testCreateField(){
        int[][] result = victim.createField();
        int[][] expected = { {-1,-1,-1}, {-1,-1,-1}, {-1,-1,-1}};
        assertArrayEquals(expected, result);
    }

}