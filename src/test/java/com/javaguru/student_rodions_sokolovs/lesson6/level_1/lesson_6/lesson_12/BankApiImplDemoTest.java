package com.javaguru.student_rodions_sokolovs.lesson6.level_1.lesson_6.lesson_12;

import com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2.AccessDeniedException;
import com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2.BankApiImpl;
import com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2.BankClient;
import com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2.Role;
import com.javaguru.student_rodions_sokolovs.lesson_12.level_1.level_2.UserCredentials;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BankApiImplDemoTest {
    @Test
    public void findByUidMustFind() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("0000", "Jake");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertTrue(victim.findByUid(runner, "0000").isPresent());
    }

    @Test
    public void findByUidMustNotFind() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("0000", "Jake");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "1111").isPresent());

    }

    @Test
    public void findByUidContainsButNoAccess() throws AccessDeniedException{
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("0000", "Jake");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        //roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "0000").isPresent());
    }
    @Test
    public void findByUidNotContainsNoAccess() throws AccessDeniedException{
        List<BankClient> clients = new ArrayList<>();
        BankClient client1 = new BankClient("0000", "Jake");
        clients.add(client1);
        List<Role> roles = new ArrayList<>();
        //roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials runner = new UserCredentials(roles);
        BankApiImpl victim = new BankApiImpl(clients);
        assertFalse(victim.findByUid(runner, "1111").isPresent());
    }
}

