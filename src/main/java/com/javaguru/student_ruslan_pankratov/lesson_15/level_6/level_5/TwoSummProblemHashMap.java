package com.javaguru.student_ruslan_pankratov.lesson_15.level_6.level_5;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.HashMap;
import java.util.Map;
@CodeReview(approved = true)
class TwoSummProblemHashMap {

    public String findSumOfTwo(int[] array, int number){
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int delta = number - array[i];
            if (hashmap.containsKey(delta)){
                return "[" + hashmap.get(delta) + " " + i + "]";
            }else{
                hashmap.put(array[i], i );
            }
        }
        return "Error";
    }
}
