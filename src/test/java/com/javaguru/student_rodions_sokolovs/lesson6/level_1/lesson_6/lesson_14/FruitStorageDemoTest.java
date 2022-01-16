package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_14;
import com.javaguru.student_rodions_sokolovs.lesson_14.level_1_2.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FruitStorageDemoTest {
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
    public void getApplesGreater100Grams() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getAppleByWeight(repository, 100).size();
        assertEquals(4, result);
    }

    @Test
    public void getApplesGreater150Grams() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.getAppleByWeight(repository, 150).size();
        assertEquals(4, result);
    }

    @Test
    public void findGreenApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.findApples(repository, new AppleGreen()).size();
        assertEquals(3, result);
    }

    @Test
    public void findHeavyApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.findApples(repository, new AppleisHeavy()).size();
        assertEquals(4, result);
    }

    @Test
    public void findRedApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.findApples(repository, new RedApples()).size();
        assertEquals(3, result);
    }

    @Test
    public void findGreenAndHeavyApples() {
        FruitStorage victim = new FruitStorage();
        List<Apple> repository = victim.getAllApples();
        int result = victim.findApples(repository, new AppleisGreenHeavy()).size();
        assertEquals(1, result);
    }
}
