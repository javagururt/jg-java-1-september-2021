package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_4;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
import java.util.List;
@CodeReview(approved = true)
public class OutOfMemoryError {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[10000 * 10000];
    }
}

