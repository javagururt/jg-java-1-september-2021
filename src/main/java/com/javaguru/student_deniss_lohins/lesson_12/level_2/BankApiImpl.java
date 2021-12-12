package com.javaguru.student_deniss_lohins.lesson_12.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            for (BankClient client : clients) {
                if (client.getUid().equals(uid)) {
                    return Optional.of(client);
                } else {
                    return Optional.empty();
                }

            }
            return Optional.empty();
        } else {
            try {
                throw new AccessDeniedException("You have not permissions to perform this action");
            } catch (AccessDeniedException e) {
                e.printStackTrace();
            }
            return Optional.empty();
        }


    }
}
