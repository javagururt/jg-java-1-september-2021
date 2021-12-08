package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AndSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {

    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;


   public AndSearchCriteria(SearchCriteria leftCondition,
                             SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }


   public AndSearchCriteria(Paging paging, SearchCriteria leftCondition, SearchCriteria rightCondition) {
        super(paging);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if(leftCondition.match(book) && rightCondition.match(book)){
            return true;
        }
        return false;
    }

}
