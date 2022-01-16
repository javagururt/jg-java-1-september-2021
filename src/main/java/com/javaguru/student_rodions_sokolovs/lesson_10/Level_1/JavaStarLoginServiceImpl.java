package com.javaguru.student_rodions_sokolovs.lesson_10.Level_1;

class JavaStarLoginServiceImpl implements  JavaStarLoginService{

    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}