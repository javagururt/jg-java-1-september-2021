package com.javaguru.student_dmitrii_faierberg.lesson_14.level_1_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    @Test
    public void shouldFindGreenApplesTest(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        var result = fruitStorage.findApples(apples, (Apple apple) -> "green".equals(apple.getColor()));

        List<Apple> expected = new ArrayList<>();
        expected.add(apples.get(3));
        expected.add(apples.get(4));
        expected.add(apples.get(5));

        assertEquals(expected, result);
    }

    @Test
    public void shouldFindRedApplesTest(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        var result = fruitStorage.findApples(apples, (Apple apple) -> "red".equals(apple.getColor()));

        List<Apple> expected = new ArrayList<>();
        expected.add(apples.get(0));
        expected.add(apples.get(1));
        expected.add(apples.get(2));

        assertEquals(expected, result);
    }

    @Test
    public void shouldFindHeavyApplesByWeightTest(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        var result = fruitStorage.findApples(apples, (Apple apple) -> apple.getWeight() > 150);

        List<Apple> expected = new ArrayList<>();
        expected.add(apples.get(1));
        expected.add(apples.get(2));
        expected.add(apples.get(3));
        expected.add(apples.get(7));

        assertEquals(expected, result);
    }

    @Test
    public void shouldFindLightApplesByWeightTest(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        var result = fruitStorage.findApples(apples, (Apple apple) -> apple.getWeight() < 150);

        List<Apple> expected = new ArrayList<>();
        expected.add(apples.get(0));
        expected.add(apples.get(4));
        expected.add(apples.get(5));
        expected.add(apples.get(6));

        assertEquals(expected, result);
    }

    @Test
    public void shouldFindGreenHeavyApplesTest(){
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> apples = fruitStorage.getAllApples();
        var result = fruitStorage.findApples(apples, (Apple apple) -> "green".equals(apple.getColor()) &&
                apple.getWeight() > 150);

        List<Apple> expected = new ArrayList<>();
        expected.add(apples.get(3));

        assertEquals(expected, result);
    }


}