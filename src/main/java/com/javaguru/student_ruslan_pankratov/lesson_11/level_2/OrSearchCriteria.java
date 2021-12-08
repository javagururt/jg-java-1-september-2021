package com.javaguru.student_ruslan_pankratov.lesson_11.level_2;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "статику лучше не юзать в этом случае. Тем более поля не используются")
class OrSearchCriteria extends SearchCriteriaSuper implements SearchCriteria {

    private static int countElement;
    private static int page;
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public OrSearchCriteria(Paging paging, SearchCriteria leftCondition, SearchCriteria rightCondition) {
        super(paging);
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }

    public boolean match(Book book) {
        if (leftCondition.match(book) || rightCondition.match(book)) {
            return true;
        }
        return false;
    }


}