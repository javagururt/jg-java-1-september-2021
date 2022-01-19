package com.javaguru.student_nikita_simans.homework.lesson_7.Level_1;

import java.util.Arrays;

public class WordServiceDemo {
    public static void main(String[] args) {
        WordService demo = new WordService();
        //demo.findMostFrequentWord("a b a a a b c");
        System.out.println(demo.findMostFrequentWord("ghjg, kjgsdf ghjg: dfs"));
        System.out.println(Arrays.toString(demo.stringToArray("ghjg, kjgsdf ghjg: dfs")));


    }
}
