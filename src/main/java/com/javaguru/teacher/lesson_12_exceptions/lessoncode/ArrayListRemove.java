package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.util.ArrayList;
import java.util.List;

class ArrayListRemove {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("A");// 0, i = 1
        strings.add("B");
        strings.add("A");
        strings.add("A");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("D");
        strings.add("C");
        strings.add("E");

        //1
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals("A")) {
                strings.remove(i);
                i--;
            }
        }

        //2
        List<String> itemsToDelete = new ArrayList<>();
        for (String str : strings) {
            if (str.equals("B")) {
                itemsToDelete.add(str);
            }
        }
        strings.removeAll(itemsToDelete);

        //3
        strings.removeIf(str -> str.equals("C"));

        System.out.println(strings);


    }
}
