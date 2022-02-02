package com.javaguru.student_nikita_simans.homework.lesson_7.Level_1;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Arrays;
@CodeReview(approved = true)
public class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();

        test.punctuationMarksCheck();
        test.returnFirstIfWordCountIsEven();
    }

    public void punctuationMarksCheck() {
        WordService target = new WordService();
        String[] referenceArray = new String[] {"a", "a", "a", "a", "a", "a", "a"};
        String[] testArray = target.stringToArray("a a, a. a: a! a: a?");

        if (target.wordCounter(referenceArray, "a") == target.wordCounter(testArray, "a")) {
            System.out.println("punctuationMarksCheck test OK");
        } else {
            System.out.println("punctuationMarksCheck test FAIL");

        }
    }

    public void returnFirstIfWordCountIsEven() {
        WordService target = new WordService();
        String reference = "a";
        if ((target.mostFrequentWord("a a b a a b b b")).equals(reference)) {
            System.out.println("returnFirstIfWordCountIsEven test OK");
        } else {
            System.out.println("returnFirstIfWordCountIsEven test FAIL");
        }


    }



}
