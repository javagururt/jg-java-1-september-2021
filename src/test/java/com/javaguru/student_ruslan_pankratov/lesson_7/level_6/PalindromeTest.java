package com.javaguru.student_ruslan_pankratov.lesson_7.level_6;

import com.javaguru.teacher.codereview.CodeReview;

import org.junit.Test;

import static org.junit.Assert.*;
@CodeReview(approved = true)
public class PalindromeTest {
    @Test
    public void isPalindromeTrueTest() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("LeVel");
        assertTrue(result);
    }

    @Test
    public void isPalindromeTrueFalse() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("Origami");
        assertFalse(result);
    }

}