package com.javaguru.teacher.lesson_6.lessoncode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TVTest {

    private TV victim;

    @Test
    public void shouldTurnOn() {
        victim = new TV(false, 1, 0);

        victim.turnOn();

        assertTrue(victim.isTurnedOn());
    }

    @Test
    public void shouldTurnOff() {
        victim = new TV(true, 1, 0);

        victim.turnOff();

        assertFalse(victim.isTurnedOn());
    }

    @Test
    public void shouldChangeChannel() {
        victim = new TV(true, 1, 0);

        victim.changeChannel(99);

        assertEquals(99, victim.getChannel());
    }

    @Test
    public void shouldRemainsOnSameChannelIfGreaterThanMax() {
        victim = new TV(true, 1, 0);

        victim.changeChannel(100);

        assertEquals(1, victim.getChannel());
    }

    @Test
    public void shouldRemainsOnSameChannelIfLessThanMin() {
        victim = new TV(true, 1, 0);

        victim.changeChannel(0);

        assertEquals(1, victim.getChannel());
    }

    @Test
    public void shouldNotChangeChannelIfTVTurnedOff() {
        victim = new TV(false, 1, 0);

        victim.changeChannel(2);

        assertEquals(1, victim.getChannel());
    }

    @Test
    public void shouldIncreaseVolume() {
        victim = new TV(true, 1, 0);

        victim.increaseVolume();

        assertEquals(1, victim.getVolume());
    }

    @Test
    public void shouldNotIncreaseIfMax() {
        victim = new TV(true, 1, 100);

        victim.increaseVolume();

        assertEquals(100, victim.getVolume());
    }

    @Test
    public void shouldNotIncreaseVolumeIfTVOff() {
        victim = new TV(false, 1, 0);

        victim.increaseVolume();

        assertEquals(0, victim.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        victim = new TV(true, 1, 1);

        victim.decreaseVolume();

        assertEquals(0, victim.getVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeIfLessThanMin() {
        victim = new TV(true, 1, 0);

        victim.decreaseVolume();

        assertEquals(0, victim.getVolume());
    }

    @Test
    public void shouldNotDecreaseVolumeIfTVOff() {
        victim = new TV(false, 1, 1);

        victim.decreaseVolume();

        assertEquals(1, victim.getVolume());
    }
}