package com.javaguru.student_deniss_lohins.lesson_12.level_2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankApiImplTest {

    @Test
    public void findByUidMustFind() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("111", "Test1");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertTrue(victim.findByUid(runner, "111").isPresent());
    }

    @Test
    public void findByUidMustNotFind() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("111", "Test1");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "112").isPresent());

    }

    @Test
    public void findByUidContainsButNoAccess() throws AccessDeniedException{
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("111", "Test1");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        //roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "111").isPresent());
    }
    @Test
    public void findByUidNotContainsNoAccess() throws AccessDeniedException{
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("111", "Test1");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        //roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "113").isPresent());
    }
}