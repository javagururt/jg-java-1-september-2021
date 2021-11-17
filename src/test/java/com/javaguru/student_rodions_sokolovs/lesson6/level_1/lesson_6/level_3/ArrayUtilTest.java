package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.level_3;

import com.javaguru.student_rodions_sokolovs.lesson_6.level_3.ArrayUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayUtilTest {
    private ArrayUtil victim;

    @Test
    public void Full(){
        victim = new ArrayUtil();
        int[] exp ={1,2,3,10,12,-1};
        assertTrue(victim.Full(-1,exp));

    }
    @Test
    public void Full2(){
        victim = new ArrayUtil();
        int[] exp = {1,2,4,6,7,1,2,2};
        assertEquals(3, victim.Full2(2,exp));

    }
    @Test
    public void Replace1(){
        victim = new ArrayUtil();
        int[] exp = {1,2,1,1,1,1,1};
        int[] replace = {1,1,1,1,1,1,1};
        victim.Replace1(2,1,exp);
        assertEquals(exp[2],replace[2]);

    }
    @Test
    public void ReplaceAll(){
        victim = new ArrayUtil();
        int[] exp = {1,3,6,4,2,3,2,3,6,4,3};
        victim.ReplaceAll(2,4,exp);
        assertEquals(4,victim.Full2(4,exp));

    }
    @Test
    public void Reverse(){
        victim = new ArrayUtil();
        int[] exp = {1,2,3,4,5,6};
        int[] result = {6,5,4,3,2,1};
        victim.reverse(exp);
        assertEquals(result[1],exp[1]);
    }
    @Test
    public void Sort(){
        victim = new ArrayUtil();
        int[] exp = {1,3,5,2,4};
        int[] result = {1,2,3,4,5};
        victim.Sort(exp);
        assertEquals(result[1],exp[1]);
    }
}
//    Добавьте в класс ArrayUtil метод для сортировки массива целых чисел.
//        Напишите автоматические тесты в классе ArrayUtilTest доказывающие,
//        что ваша реализация метода работает правильно.

