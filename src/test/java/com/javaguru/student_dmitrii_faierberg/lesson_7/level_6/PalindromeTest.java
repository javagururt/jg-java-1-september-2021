package com.javaguru.student_dmitrii_faierberg.lesson_7.level_6;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome victim = new Palindrome();
    @Test
    public void testIsPalindrome1(){
        String text = "level";
        assertTrue(victim.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome2(){
        String text = "А роза упала на лапу Азора";
        assertTrue(victim.isPalindrome(text));
    }

    @Test
    public void testIsPalindrome3(){
        String text = "Just text";
        assertFalse(victim.isPalindrome(text));
    }




}