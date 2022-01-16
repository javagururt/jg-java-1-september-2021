package com.javaguru.student_deniss_lohins.lesson_16.level_1_2_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoversControlAppTest {

    @Test
    public void moveRover() {
        MarsRoversControlApp victim = new MarsRoversControlApp(5, 5);
        victim.addRover(1, 2, 'N');
        victim.addRover(3, 3, 'E');
        String rover0Actual = victim.moveRover(0, "LMLMLMLMM");
        String rover0Expected = "1 3 N";
        assertEquals(rover0Expected, rover0Actual);
        String rover1Actual = victim.moveRover(1, "MMRMMRMRRM");
        String rover1Expected = "5 1 E";
        assertEquals(rover1Expected, rover1Actual);
    }

    @Test
    public void moveRoverCollision() {
        MarsRoversControlApp victim = new MarsRoversControlApp(5, 5);
        victim.addRover(1, 2, 'N');
        victim.addRover(3, 3, 'E');
        victim.addRover(1, 1, 'N');
        victim.addRover(5, 5, 'S');
        String rover0Actual = victim.moveRover(0, "LMLMLMLMM");
        String rover0Expected = "1 3 N";
        assertEquals(rover0Expected, rover0Actual);
        String rover1Actual = victim.moveRover(1, "MMRMMRMRRM");
        String rover1Expected = "5 1 E";
        assertEquals(rover1Expected, rover1Actual);
        String rover2Expected = "1 1 N";
        String rover2Actual = victim.moveRover(2, "mm");
        assertEquals(rover2Expected, rover2Actual);
        String rover3Expected = "5 5 S";
        String rover3Actual = victim.moveRover(3, "llmRR");
        assertEquals(rover3Expected, rover3Actual);


    }
}