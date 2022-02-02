package com.javaguru.student_dmitrii_faierberg.lesson_11.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

@CodeReview(approved = true)
class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new Stack<>();

        list.add(23);
        list.add(Integer.valueOf(11));

        list.add(1);
        list.add(1);
        System.out.println(list);

        list1.add(1);
        list1.add(1);
        System.out.println(list1);

        list2.add(1);
        list2.add(1);
        System.out.println(list2);
    }
}
