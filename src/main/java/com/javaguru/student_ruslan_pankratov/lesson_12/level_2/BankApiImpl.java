package com.javaguru.student_ruslan_pankratov.lesson_12.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {//contains провердяет на то, есть ли в списке данное условие
            throw new AccessDeniedException();
        }
        for (int j = 0; j < clients.size(); j++) {
            if (clients.get(j).getUid().equals(uid)) {
               return Optional.of(clients.get(j));//через of добавляем значение
            }
        }
        return Optional.empty();
    }

}
