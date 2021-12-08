package com.javaguru.student_ruslan_pankratov.lesson_11.level_1;

import java.util.ArrayList;
import java.util.List;

//Task_3
class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(0, 10);//add first element 10 on index 0
        list.add(5, 40);//add last element 40 on index 5

        System.out.println("size my list = " + list.size());//size my list = 6
        System.out.println("My list items");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        list.remove(1);//delete on index
        list.removeAll(list);
        System.out.println("");
        System.out.println("Is the list empty? " + list.isEmpty());// examination list on empty


    }
}
