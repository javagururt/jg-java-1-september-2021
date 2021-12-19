package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class UniqueWordFinderTest {
    @Test
    public void findTest(){
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> actual = finder.find("1 2 1 1 3 4 5 2 3");
        Set<String> expected = new HashSet<>(List.of("1", "2", "3", "4", "5"));
        assertEquals(expected, actual);
    }

}