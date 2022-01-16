package com.javaguru.student_deniss_lohins.lesson_16.level_5;

import java.util.HashMap;
import java.util.Map;

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
