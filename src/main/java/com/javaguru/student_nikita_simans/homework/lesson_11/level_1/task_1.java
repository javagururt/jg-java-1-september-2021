package com.javaguru.student_nikita_simans.homework.lesson_11.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class task_1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();  /*В отличие от обычного массива имеет нефиксированную длину,
         т.е., позволяет добавлять, удалять и заменять элементы */
        LinkedList<String> linkedList = new LinkedList<>(); /*Хранит элементы "по цепочке": каждый элемент имеет ссылки на
        предыдущий и последующий. По ним можно переходить от одного элемента к другому, что значительно расширяет
        его функционал
        */

        String element1 = new String("element1");
        String element2 = new String("element2");
        String element3 = new String("element3");
        String element4 = new String("element4");
        String integratedElement = new String("integratedElement");
        String firstElement = new String("firstElement");
        String lastElement = new String("lastElement");
        String replacedElement = new String("replacedElement");
        String veryFirstElement = new String("veryFirstElement");
        String veryLastElement = new String("veryLastElement");


        System.out.println("----------ArrayList-------------");
        arrayList.add(element1);
        arrayList.add(element2);
        arrayList.add(element3);
        arrayList.add(element4);
        System.out.println(arrayList);

        arrayList.add(1, integratedElement);
        arrayList.add(0, firstElement);
        arrayList.add(arrayList.size(), lastElement);
        arrayList.set(4, replacedElement);
        System.out.println(arrayList);

        System.out.println("----------LinkedList-------------");
        linkedList.add(element1);
        linkedList.add(element2);
        linkedList.add(element3);
        linkedList.add(element4);
        System.out.println(linkedList);

        linkedList.add(1, integratedElement);
        linkedList.add(0, firstElement);
        linkedList.add(linkedList.size(), lastElement);
        linkedList.set(4, replacedElement);
        System.out.println(linkedList);

        linkedList.addFirst(veryFirstElement);
        linkedList.addLast(veryLastElement);
        System.out.println(linkedList);



    }


}
