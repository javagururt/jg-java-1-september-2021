package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class YearOfIssueSearchCriteriaTest {

    @Test
    public void match() {
        SearchCriteria victim = new YearOfIssueSearchCriteria("1090");
        Book book1 = new Book("A1", "B1");
        book1.setYearOfIssue("1090");
        assertTrue(victim.match(book1));
    }
    @Test
    public void notMatch(){
        SearchCriteria victim = new YearOfIssueSearchCriteria("2000");
        Book book1 = new Book("A2", "B1");
        book1.setYearOfIssue("2001");
        assertFalse(victim.match(book1));
    }
}