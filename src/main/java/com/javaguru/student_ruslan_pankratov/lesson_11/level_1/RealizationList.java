package com.javaguru.student_ruslan_pankratov.lesson_11.level_1;

//Task_1-2

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
@CodeReview(approved = true)
class RealizationList {
    public static void main(String[] args) {
        List list = new ArrayList();//хранит в себе массив списка, при увеличении размера создаёт новый массив, что накладно
        List list1 = new LinkedList();//основан на двусвязном списке. То есть элемент хранит о себе информацию, о
        // предыдущем элементе, и о следующем, и происходит своего рода цепь

        //List<int> list2 = new ArrayList<int>();//он не может реализовывать примитивные типы данных
        List<Integer> list2 = new ArrayList<>();//но зато может хранить обвёртки
        list2.add(0, 12323);
        list2.add(1, 232);// он может хранить только в себе объекты, как например Интежер, который можно потом
        // перевести в инт


        RealizationList realizationList = new RealizationList();
        RealizationList realizationList1 = new RealizationList();
        List<RealizationList> lists = new ArrayList<>();
        lists.add(realizationList);
        lists.add(realizationList1);//да как мы видим,может хранить, ссылки
    }
}
