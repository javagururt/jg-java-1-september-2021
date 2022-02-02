package com.javaguru.student_rodions_sokolovs.lesson_11.level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(2, 50);//добавить в список элемент в начало
        list.add(5, 100);//добавить в список элемент в конец

        System.out.println("Size: " + list.size());//узнать длину списка
        System.out.println("List: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        list.remove(1);//удалить элемент из списка
        list.removeAll(list);
        System.out.println("");
        System.out.println("list empty?");
        System.out.println(list.isEmpty());//узнать пустой список или нет


    }
}
