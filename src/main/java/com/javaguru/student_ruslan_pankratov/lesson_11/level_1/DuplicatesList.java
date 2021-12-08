package com.javaguru.student_ruslan_pankratov.lesson_11.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;

//Task_4
@CodeReview(approved = true)
class DuplicatesList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 1);
        list.add(2, 1);
        list.add(3, 2);

        for (Integer integer : list) {
            System.out.println(integer);//yes it can store duplicate items
        }
    }
}
