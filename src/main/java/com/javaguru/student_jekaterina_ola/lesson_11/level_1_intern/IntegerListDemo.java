package com.javaguru.student_jekaterina_ola.lesson_11.level_1_intern;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
class IntegerListDemo {

    public static void main (String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.toString());

        int length = list.size();
        System.out.println(length);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.isEmpty());

        for (Integer value : list)
            System.out.println(value + " ");
    }
}
