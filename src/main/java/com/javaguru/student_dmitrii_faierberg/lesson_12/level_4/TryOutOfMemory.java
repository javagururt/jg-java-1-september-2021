package com.javaguru.student_dmitrii_faierberg.lesson_12.level_4;

import java.util.ArrayList;

class MyObject {
    int a;
    int b;

}
class TryOutOfMemory {

    public static void main(String[] args) {
        ArrayList<MyObject> list = new ArrayList<>();
        while(true){
            list.add(new MyObject());
            System.out.print("1 ");
        }
    }
}
