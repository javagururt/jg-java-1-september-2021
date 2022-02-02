package com.javaguru.student_ruslan_pankratov.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

class FruitStorage {


    List<Apple> apples = new ArrayList<>();
    public List<Apple> getAllApples() {
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



    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private List<Apple> getOnlyGreenApples(){
        List<Apple> greens = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if(apples.get(i).getColor().equalsIgnoreCase("green")){
                greens.add(apples.get(i));
            }
        }
        return greens;
    }


    private List<Apple> getOnlyRedApples(){
        List<Apple> red = new ArrayList<>();
        for (int i = 0; i < apples.size(); i++) {
            if(apples.get(i).getColor().equalsIgnoreCase("red")){
                red.add(apples.get(i));
            }
        }
        return red;
    }

    public List<Apple> findApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equalsIgnoreCase(color)) {
                result.add(apple);
            }
        }
        return result;
    }



}
