package com.javaguru.student_Olga_T.lesson_3.level_x.task_1;

class User {
    String login;
    String password;
    boolean blockedUser;
    int tryConnect;

    User(String login, String password) {
        this.login = login;
        this.password = password;
        this.blockedUser = false;
        this.tryConnect = 3;
    }

    public void resetTries() {
        this.tryConnect = 3;
    }

    public void blockUser() {
        this.blockedUser = true;
    }

}
