package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

import com.javaguru.teacher.codereview.CodeReview;

//super_task_1
@CodeReview(approved = true)
class User {
    private String login;
    private String password;
    private boolean userBlocked = false;
    private int numberOfBlockAttempts = 3;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private void resetNumber() {
        numberOfBlockAttempts = 3;
        System.out.println("Количество входов обновилось и теперь есть количество попыток: " + numberOfBlockAttempts);
    }

    private void blockUser() {
        numberOfBlockAttempts = numberOfBlockAttempts - 1;
        if (numberOfBlockAttempts <= 0) {
            userBlocked = true;
            System.out.println("Вы заблокированы");
        }
    }

    void login(User user, String password) {
        if (userBlocked == false && password == this.password) {
            user.resetNumber();
            System.out.println("Пароль ввёден верно");
        } else {
            System.out.println("Пароль ввёден не верно");
            blockUser();
        }
    }
}
