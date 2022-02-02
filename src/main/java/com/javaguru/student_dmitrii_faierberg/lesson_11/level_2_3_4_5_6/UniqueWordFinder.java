package com.javaguru.student_dmitrii_faierberg.lesson_11.level_2_3_4_5_6;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
@CodeReview(approved = true)
class UniqueWordFinder {
    Set<String> find(String text){
        Set<String> result = new HashSet<>(List.of(text.split(" ")));
        return result;
    }
}
