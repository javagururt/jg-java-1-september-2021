package com.javaguru.student_dmitrii_faierberg.lesson_14.level_1_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@CodeReview(approved = true)
class FruitStorage {
    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p){
        return inventory.stream().filter(p::test).collect(Collectors.toList());
    }
}
