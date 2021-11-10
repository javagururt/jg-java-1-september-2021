package com.javaguru.student_deniss_lohins.lesson_3.level_x;

import com.javaguru.teacher.codereview.CodeReview;
import com.javaguru.teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "сравение пользователя и строки")
class UserLoginService {

    boolean login(User user, String password) {
        if (user.equals(user.getUsername())) {
            if (password.equals(user.getPassword())) {
                if (user.isBlocked()) {
                    return false;
                } else {
                    return true;
                    //user.resetTriesCounter();
                }
            } else {
                user.setTriesToLoginLeft(user.getTriesToLoginLeft() - 1);
                return false;
            }
        } else {
            return false;
        }
    }


}
