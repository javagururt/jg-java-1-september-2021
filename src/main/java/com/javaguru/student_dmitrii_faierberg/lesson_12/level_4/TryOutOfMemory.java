package com.javaguru.student_dmitrii_faierberg.lesson_12.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class MyObject {
    int a;
    int b;

}
@CodeReview(approved = true)
class TryOutOfMemory {

    public static void main(String[] args) {
        ArrayList<MyObject> list = new ArrayList<>();
        while(true){
            list.add(new MyObject());
            System.out.print("1 ");
        }
    }
}
