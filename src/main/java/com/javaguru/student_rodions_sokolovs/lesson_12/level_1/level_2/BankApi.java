package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
