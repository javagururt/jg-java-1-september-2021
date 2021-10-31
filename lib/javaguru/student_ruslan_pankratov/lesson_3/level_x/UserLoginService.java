package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

//super_task_1
@CodeReview(approved = true)
@CodeReviewComment(teacher = "нет смысла создавать экземпляр класса UserLoginService в данном случае, так как он не используется.")
public class UserLoginService {
    public static void main(String[] args) {
        User user = new User("Rik", "Been123");
        user.login(user, "12312");
        user.login(user, "Been123");
        user.login(user, "1132131");
        user.login(user, "1132131");
        user.login(user, "1132131");
        user.login(user, "Been123");//теперь пользователь не может писать пароль
    }
}
