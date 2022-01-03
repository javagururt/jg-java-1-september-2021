package com.javaguru.student_dmitrii_faierberg.lesson_12.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankApiImplTest {

    @Test
    public void findByUidTest(){
        UserCredentials userCredentials = new UserCredentials(List.of(Role.CAN_SEARCH_CLIENTS));
        List<BankClient> clients = new ArrayList<>();

        BankClient firstClient = new BankClient("1", "Vasya");
        BankClient secondClient = new BankClient("2", "Petya");
        clients.add(firstClient);
        clients.add(secondClient);

        BankApi bankApi = new BankApiImpl(clients);

        Optional<BankClient> optional;
        try {
            optional = bankApi.findByUid(userCredentials, "2");
        } catch (AccessDeniedException exception){
            throw new AssertionError("There is no appropriate role");
        }

        if (optional.isPresent()){
            assertEquals(secondClient.getFullName(), optional.get().getFullName());
        } else{
            throw new AssertionError("Client was not found");
        }
    }

    @Test
    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}