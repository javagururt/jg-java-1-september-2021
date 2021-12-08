package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

//Task_15
@CodeReview(approved = true)
public interface SearchCriteria {

    boolean match(Book book);

    Paging paging();
    
}
