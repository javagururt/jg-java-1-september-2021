package com.javaguru.student_ruslan_pankratov.lesson_10.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyListClass implements MyList{
    MyList[] myListClass = new MyListClass[0];

    @Override
    public void addElement(MyList myList) {


        MyList[] my = new MyListClass[myListClass.length + 1];

            for (int i = 0; i < my.length - 1; i++) {
                my[i] = myListClass[i];
            }
            if(my.length == 1){
                  my[0] = myList;
            } else {
                my[my.length - 1] = myList;
            }


            myListClass = new MyListClass[myListClass.length + 1];
            for (int i = 0; i < my.length; i++) {
                myListClass[i] = my[i];
            }

    }

    @Override
    public void deleteElement(int index) {
        MyList[] my = new MyListClass[myListClass.length - 1];
        int count = 0;
        for (int i = 0; i < myListClass.length; i++) {
            if(i != index){
                my[count] = myListClass[i];
                count++;
            }

        }

        myListClass = new MyListClass[myListClass.length -1 ];
        for (int i = 0; i < my.length; i++) {
            myListClass[i] = my[i];
        }
    }

    @Override
    public void clear() {
        myListClass = new MyListClass[0];
    }

}
