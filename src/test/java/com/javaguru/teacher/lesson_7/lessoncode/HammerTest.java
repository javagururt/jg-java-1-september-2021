package com.javaguru.teacher.lesson_7.lessoncode;

import com.javaguru.teacher.lesson_7.lessoncode.Hammer;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammerTest {


    @Test
    public void shouldBeBroken() {
        Hammer hammer = new Hammer();
        hammer.setBroken(true);

        assertTrue(hammer.isBroken());
    }

    @Test
    public void materialShouldBeNull() {
        Hammer hammer = new Hammer();

        assertNull(hammer.getMaterial());
    }
}