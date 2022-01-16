package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[10000 * 10000];
    }
}

