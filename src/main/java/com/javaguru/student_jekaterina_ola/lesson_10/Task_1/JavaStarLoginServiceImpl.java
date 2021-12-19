package com.javaguru.student_jekaterina_ola.lesson_10.Task_1;

public class JavaStarLoginServiceImpl implements JavaStarLoginService {
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
