package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_11;

import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.*;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AndSearchCriteriaDemoTest {
    @Test
    public void truem() {
        SearchCriteria victim = new AndSearchCriteria(new YearOfIssueSearchCriteria("2000"), new AuthorSearchCriteria("A1"));
        Book book1 = new Book("A1", "B1");
        book1.setYearOfIssue("2000");
        assertTrue(victim.match(book1));
    }
    @Test
    public void flasem(){
        SearchCriteria victim = new AndSearchCriteria(new YearOfIssueSearchCriteria("2000"), new AuthorSearchCriteria("A1"));
        Book book1 = new Book("A2", "B1");
        book1.setYearOfIssue("2000");
        assertFalse(victim.match(book1));
    }
}
