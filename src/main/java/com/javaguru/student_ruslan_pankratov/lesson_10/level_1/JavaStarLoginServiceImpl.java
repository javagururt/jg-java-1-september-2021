package com.javaguru.student_ruslan_pankratov.lesson_10.level_1;
//Task_1

class JavaStarLoginServiceImpl implements JavaStarLoginService {


    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }

}