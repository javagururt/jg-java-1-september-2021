package com.javaguru.student_ruslan_pankratov.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryErrorTest {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            arr.add("hello hello hello hello hello hello hello hello");
        }
    }
}
