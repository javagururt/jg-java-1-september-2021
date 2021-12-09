package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class SearchCriteriaSuper implements SearchCriteria {
    Paging paging;

    public SearchCriteriaSuper(Paging paging) {
        this.paging = paging;
    }

    public SearchCriteriaSuper() {
    }

    @Override
    public Paging paging() {
        return paging;
    }
}
