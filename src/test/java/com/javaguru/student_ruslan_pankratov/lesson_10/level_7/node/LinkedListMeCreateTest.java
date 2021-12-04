package com.javaguru.student_ruslan_pankratov.lesson_10.level_7.node;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListMeCreateTest {

    @Test
    public void sizeTest() {
        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);

        String result = "" + list.size();
        String expectedResult = "10";

        assertEquals(expectedResult, result);

    }

    @Test
    public void out() {
        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);
        String result = "";

        result = resultString(num, result, list);
        String expectedResult = "0 1 2 3 4 5 6 7 8 9 ";

        assertEquals(expectedResult, result);
    }


    @Test
    public void setTest() {
        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);
        list.set(1, "11");
        String result = "";

        result = resultString(num, result, list);
        String expectedResult = "0 11 2 3 4 5 6 7 8 9 ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void removeTest() {
        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);
        list.remove(num - 1);
        String result = "";

        result = resultString(num - 1, result, list);
        String expectedResult = "0 1 2 3 4 5 6 7 8 ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void addNewElement() {

        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);
        list.insert(num - 2, "999");
        String result = "";

        result = resultString(num, result, list);
        String expectedResult = "0 1 2 3 4 5 6 7 999 8 ";

        assertEquals(expectedResult, result);

    }

    @Test
    public void reverse() {
        LinkedListMeCreate<Comparable> list = new LinkedListMeCreate<Comparable>();
        int num = 10;
        create(num, list);
        list.back();
        String result = "";

        result = resultString(num, result, list);
        String expectedResult = "9 8 7 6 5 4 3 2 1 0 ";

        assertEquals(expectedResult, result);

    }

    void create(int num, LinkedListMeCreate<Comparable> list) {
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
    }

    String resultString(int num, String result, LinkedListMeCreate<Comparable> list) {
        for (int i = 0; i < num; i++) {
            result = result + list.get(i) + " ";
        }
        return result;

    }

}