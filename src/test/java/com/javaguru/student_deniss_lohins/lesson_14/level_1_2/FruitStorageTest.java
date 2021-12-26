package com.javaguru.student_deniss_lohins.lesson_14.level_1_2;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void getGreenApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getApplesByColour(repository, "green").size();
        assertEquals(3, result);
    }
@Test
    public void getRedApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getApplesByColour(repository, "red").size();
        assertEquals(3, result);
    }

    @Test
    public void getYellowApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getApplesByColour(repository, "yellow").size();
        assertEquals(2, result);
    }

    @Test
    public void getOrangeApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getApplesByColour(repository, "orange").size();
        assertEquals(0, result);
    }

    @Test
    public void getApplesGreater100Grams(){
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getAppleByWeight(repository, 100).size();
        assertEquals(5, result);
    }

    @Test
    public void getApplesGreater150Grams(){
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getAppleByWeight(repository, 150).size();
        assertEquals(4, result);
    }

    @Test
    public void findGreenApples(){
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();

    }
}