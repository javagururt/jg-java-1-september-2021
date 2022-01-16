package com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.ClientRole(Role.CAN_SEARCH_CLIENTS)) {
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
                throw new AccessDeniedException("ERROR 404 RETRY:****");
            } catch (AccessDeniedException o) {
                o.printStackTrace();
            }
            return Optional.empty();
        }

    }

}
