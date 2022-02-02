package com.javaguru.student_nikita_simans.homework.lesson_14.lesson_1_and_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
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

    public List<Apple> findApplesByColour(List<Apple> apples, String colour) {
        List<Apple> applesByColour = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            Apple target = apples.get(i);
            if (target.getColor().equalsIgnoreCase(colour)) {
                applesByColour.add(target);
            }
        }
        return applesByColour;
    }

    public List<Apple> findAppleByWeight(List<Apple> apples, int weight) {
        List<Apple> resultList = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                resultList.add(apple);
            }
        }
        return resultList;
    }


    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}