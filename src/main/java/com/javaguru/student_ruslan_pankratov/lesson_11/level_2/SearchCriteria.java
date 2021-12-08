package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

//Task_15
public interface SearchCriteria {

    boolean match(Book book);

    Paging paging();
    
}
