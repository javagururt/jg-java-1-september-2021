package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrSearchCriteriaTest {
    @Test
    public void match() {
        SearchCriteria victim = new OrSearchCriteria(new YearOfIssueSearchCriteria("2000"), new AuthorSearchCriteria("A1"));
        Book book1 = new Book("A1", "B1");
        book1.setYearOfIssue("2020");
        assertTrue(victim.match(book1));
    }
    @Test
    public void match1() {
        SearchCriteria victim = new OrSearchCriteria(new YearOfIssueSearchCriteria("2000"), new AuthorSearchCriteria("A11"));
        Book book1 = new Book("A1", "B1");
        book1.setYearOfIssue("2000");
        assertTrue(victim.match(book1));
    }
    @Test
    public void notMatch(){
        SearchCriteria victim = new AndSearchCriteria(new YearOfIssueSearchCriteria("2000"), new AuthorSearchCriteria("A1"));
        Book book1 = new Book("A2", "B1");
        book1.setYearOfIssue("2010");
        assertFalse(victim.match(book1));
    }

}