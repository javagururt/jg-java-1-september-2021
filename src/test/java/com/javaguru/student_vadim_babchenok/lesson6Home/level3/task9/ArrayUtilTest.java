package com.javaguru.student_vadim_babchenok.lesson6Home.level3.task9;

import com.javaguru.student_vadim_babchenok.lesson6Home.level1.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilTest {
    private ArrayUtil victim;

    @Test
    public void arrayContainsNumber() {
        victim = new ArrayUtil();
        int[] massivChisel = {7, 8, 2, 5};
        boolean result = victim.ArrayContainsNumber(massivChisel, 8);
        Assert.assertEquals(true, result);
    }

    @Test
    public void CountOfNumberInArrayTest() {
        victim = new ArrayUtil();
        int[] massivChisel = {7, 8, 9, 0, 5, 5, 6, 5};
        int result = victim.CountOfNumberInArray(massivChisel,
                5);
        Assert.assertEquals(3, result);
    }

    @Test
    public void ReplacingAnArrayValue() {
        victim=new ArrayUtil();

        int[] massivChisel = {2,3,5,8};
        int[] expectedArray = {6,3,5,8};

        victim.ReplacingAnArrayValue(massivChisel,2,6);
        Assert.assertArrayEquals(massivChisel, expectedArray);
    }
}