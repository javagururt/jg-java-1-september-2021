package com.javaguru.student_vadim_babchenok.lesson6Home.level1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTestTest {
    private Calculator victim;

    @Before
    public void setUp(){
        victim = new Calculator();
    }

    @Test
    public void shouldReturnEvenNumber(){
        boolean result = victim.isEven(4);
        Assert.assertEquals(true,result);
    }
}