package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyListClassTest {

    @Test
    public void addElementTest() {
        MyListClass myListClass1 = new MyListClass();

        MyList myList2 = new MyListClass();
        myListClass1.addElement(myList2);

        MyList myList3 = new MyListClass();
        myListClass1.addElement(myList3);

        MyList myList4 = new MyListClass();
        myListClass1.addElement(myList4);

        MyList myList5 = new MyListClass();
        myListClass1.addElement(myList5);

        int result = myListClass1.myListClass.length;
        int expectedResult = 4;

         assertEquals(expectedResult,result);
    }

    @Test
    public void deleteElementTest() {
        MyListClass myListClass2 = new MyListClass();

        MyList myList2 = new MyListClass();
        myListClass2.addElement(myList2);

        MyList myList3 = new MyListClass();
        myListClass2.addElement(myList3);

        MyList myList4 = new MyListClass();
        myListClass2.addElement(myList4);

        MyList myList5 = new MyListClass();
        myListClass2.addElement(myList5);

        myListClass2.deleteElement(2);

        int result = myListClass2.myListClass.length;
        int expectedResult = 3;

        assertEquals(expectedResult,result);
    }

    @Test
    public void clearTest() {
        MyListClass myListClass1 = new MyListClass();
        myListClass1.clear();

        int result = myListClass1.myListClass.length;
        int expectedResult = 0;

        assertEquals(expectedResult,result);
    }

}