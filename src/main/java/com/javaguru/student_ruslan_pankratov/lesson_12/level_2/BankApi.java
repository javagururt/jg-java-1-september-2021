package com.javaguru.student_ruslan_pankratov.lesson_12.level_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
    //мы можем бросать ошибку уже в интерфейсе

}