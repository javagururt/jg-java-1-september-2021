package com.javaguru.student_deniss_lohins.lesson_11.level_2_3_4;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OrSearchCriteria implements SearchCriteria{


    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    @Override
    public boolean match(Book book) {
        if(leftCondition.match(book) || rightCondition.match(book)){
            return true;
        }
        return false;
    }
}
