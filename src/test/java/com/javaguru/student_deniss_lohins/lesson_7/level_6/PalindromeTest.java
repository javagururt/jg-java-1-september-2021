package com.javaguru.student_deniss_lohins.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class PalindromeTest {

    @Test
    public void shouldReturnTrueNumbers() {
        Palindrome victim = new Palindrome();
        String test = " 12 32 1";
        assertTrue(victim.isPalindrome(test));
    }

    @Test
    public void shouldReturnFalseNumbers(){
        Palindrome victim = new Palindrome();
        String test = " 12 3122 1";
        assertFalse(victim.isPalindrome(test));
    }

    @Test
    public void shouldReturnTrueWords() {
        Palindrome victim = new Palindrome();
        String test = "А роза упала на лапу Азора";
        assertTrue(victim.isPalindrome(test));
    }

    @Test
    public void shouldReturnFalseWords(){
        Palindrome victim = new Palindrome();
        String test = " sum summus mus1";
        assertFalse(victim.isPalindrome(test));
    }
    @Test
    public void shouldReturnFalseemptyString(){
        Palindrome victim = new Palindrome();
        String test = "";
        assertFalse(victim.isPalindrome(test));
    }
}