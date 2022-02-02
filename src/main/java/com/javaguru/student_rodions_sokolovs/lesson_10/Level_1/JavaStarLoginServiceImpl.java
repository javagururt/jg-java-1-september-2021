package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements  JavaStarLoginService{

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}