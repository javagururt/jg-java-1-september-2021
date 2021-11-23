package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class TankTest {

    @Test
    public void ai() {
        Tank tank = new Tank.TankBuilder().setAi(true).build();//Tank tank = new Tank(); так не создать его
        boolean result = tank.isAi();
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void gps() {
        Tank tank = new Tank.TankBuilder().setGps(true).build();
        boolean result = tank.isGps();
        boolean expectedResult = true;

        assertEquals(expectedResult, result);
    }

    @Test
    public void model() {
        Tank tank = new Tank.TankBuilder().setModel("T-34").build();
        String result = tank.getModel();
        String expectedResult = "T-34";

        assertEquals(expectedResult, result);
    }

    @Test
    public void price() {
        Tank tank = new Tank.TankBuilder().setPrice(10_000_000).build();
        int result = tank.getPrice();
        int expectedResult = 10_000_000;

        assertEquals(expectedResult, result);
    }

}