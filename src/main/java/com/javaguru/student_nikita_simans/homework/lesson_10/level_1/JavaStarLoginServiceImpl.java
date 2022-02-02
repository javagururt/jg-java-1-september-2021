package com.javaguru.student_nikita_simans.homework.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService{
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
