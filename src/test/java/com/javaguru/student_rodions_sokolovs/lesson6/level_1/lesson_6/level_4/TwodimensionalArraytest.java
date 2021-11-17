package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.level_4;

import com.javaguru.student_rodions_sokolovs.lesson_6.Level_4.TwoDimensionalArray;
import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class TwodimensionalArraytest {
    private TwoDimensionalArray victim;

    @Test
    public void randomtest() {
        victim = new TwoDimensionalArray();
        int[][] array = victim.Arrayrandom(2, 2);
        victim.Random(array);
        assertNotEquals(0, array[0][0]);

    }

    @Test
    public void Sumtest() {
        victim = new TwoDimensionalArray();
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
        };
        int sum = victim.Sum(array);
        assertEquals(60, sum);

    }
}
