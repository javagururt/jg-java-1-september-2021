package com.javaguru.student_deniss_lohins.lesson_16.level_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    @Test
    public void moveRover1() {
        String firstLine = "5 5";
        String secondLine = "1 2 N";
        String move = "LMLMLMLMM";
        MarsRover victim = new MarsRover(firstLine, secondLine);
        String obtainedResult = victim.moveRover(move);
        String expectedResult = "1 3 N";
        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void moveRover2() {
        String firstLine = "5 5";
        String secondLine = "3 3 E";
        String move = "MMRMMRMRRM";
        MarsRover victim = new MarsRover(firstLine, secondLine);
        String obtainedResult = victim.moveRover(move);
        String expectedResult = "5 1 E";
        assertEquals(expectedResult, obtainedResult);
    }


}