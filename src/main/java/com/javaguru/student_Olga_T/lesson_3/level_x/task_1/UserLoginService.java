package com.javaguru.student_Olga_T.lesson_3.level_x.task_1;

class UserLoginService {

    public boolean login(User user1, String password) {
        if (password.equals(user1.password)) {
            if (!user1.blockedUser) {
                user1.resetTries();
                return true;
            } else {
                return false;
            }
        } else {
            user1.tryConnect--;
            if (user1.tryConnect == 0) {
                user1.blockUser();
            }
            return false;
        }


    }
}


