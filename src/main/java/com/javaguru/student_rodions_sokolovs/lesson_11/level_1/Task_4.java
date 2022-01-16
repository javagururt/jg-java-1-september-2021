package com.javaguru.student_rodions_sokolovs.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 0);
        l1.add(1, 0);
        l1.add(2, 2);
        l1.add(3, 2);
        l1.add(4, 3);

        for (Integer integer : l1) {
            System.out.println(integer);
        }
    }
}
///Да возможно