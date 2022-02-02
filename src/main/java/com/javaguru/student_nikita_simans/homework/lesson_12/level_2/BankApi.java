package com.javaguru.student_nikita_simans.homework.lesson_12.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.Optional;
@CodeReview(approved = true)
public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
