package com.javaguru.student_jekaterina_ola.lesson_10.lesson_1_intern.Task_1;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class JavaStarLoginServiceImpl implements com.javaguru.student_jekaterina_ola.lesson_10.lesson_1_intern.Task_1.JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
