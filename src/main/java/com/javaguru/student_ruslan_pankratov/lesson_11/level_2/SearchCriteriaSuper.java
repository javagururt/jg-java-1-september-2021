package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

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
