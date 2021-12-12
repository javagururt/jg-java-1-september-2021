package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleSearchCriteriaTest {

    @Test
    public void match() {
        SearchCriteria victim = new TitleSearchCriteria("B1");
        Book book1 = new Book("A1", "B1");
        assertTrue(victim.match(book1));
    }
    @Test
    public void notMatch(){
        SearchCriteria victim = new TitleSearchCriteria("A1");
        Book book1 = new Book("A2", "B1");
        assertFalse(victim.match(book1));
    }
}