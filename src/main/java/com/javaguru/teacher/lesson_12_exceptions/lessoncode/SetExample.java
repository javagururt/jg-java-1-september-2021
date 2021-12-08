package com.javaguru.teacher.lesson_12_exceptions.lessoncode;

import java.util.HashSet;
import java.util.Set;

class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("A");
        stringSet.add("B");
        stringSet.add("B");
        stringSet.add("B");
        stringSet.add("B");
        System.out.println(stringSet);

    }
}
