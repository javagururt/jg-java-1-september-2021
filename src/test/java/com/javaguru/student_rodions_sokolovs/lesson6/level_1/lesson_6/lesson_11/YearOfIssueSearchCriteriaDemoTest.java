package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_11;

import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.Book;
import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.SearchCriteria;
import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.YearOfIssueSearchCriteria;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearOfIssueSearchCriteriaDemoTest {
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
