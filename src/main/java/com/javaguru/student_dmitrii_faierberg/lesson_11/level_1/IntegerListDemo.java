package com.javaguru.student_dmitrii_faierberg.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.set(0, 2);
        System.out.println(list.toString());

        int length = list.size();
        System.out.println(length);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(4));
        System.out.println(list);

        System.out.println(list.isEmpty());

        for(Integer value : list)
            System.out.print(value + " ");
    }
}
