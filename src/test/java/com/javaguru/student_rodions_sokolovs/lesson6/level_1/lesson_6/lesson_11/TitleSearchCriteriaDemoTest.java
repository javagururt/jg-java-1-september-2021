package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_11;

import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.Book;
import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.SearchCriteria;
import com.javaguru.student_rodions_sokolovs.lesson_11.level_1.level_2_3_4.TitleSearchCriteria;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TitleSearchCriteriaDemoTest {
    @Test
    public void truem() {
        SearchCriteria victim = new TitleSearchCriteria("B1");
        Book book1 = new Book("A1", "B1");
        assertTrue(victim.match(book1));
    }
    @Test
    public void falsem(){
        SearchCriteria victim = new TitleSearchCriteria("A1");
        Book book1 = new Book("A2", "B1");
        assertFalse(victim.match(book1));
    }
}
