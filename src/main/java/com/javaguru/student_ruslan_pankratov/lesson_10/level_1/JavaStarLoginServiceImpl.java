package com.javaguru.student_ruslan_pankratov.lesson_10.level_1;

import com.javaguru.teacher.codereview.CodeReview;

//Task_1
@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {


    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}