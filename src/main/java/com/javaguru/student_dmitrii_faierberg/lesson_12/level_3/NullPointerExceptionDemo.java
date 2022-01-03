package com.javaguru.student_dmitrii_faierberg.lesson_12.level_3;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        int[] array = null;
        String str = null;
        System.out.println(array.length);   // here
        System.out.println(str.length());   // and here
    }
}
