package com.javaguru.student_dmitrii_faierberg.lesson_7.level_7;

import com.javaguru.teacher.lesson_3.homework.level_x.solutions.super_task_1.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserEntityReposTest {
    private UserEntityRepos victim;

    @Before
    public void setUp(){
        victim = new UserEntityRepos();
        UserEntity user1 = new UserEntity(1, "a", "a", "101");
        UserEntity user2 = new UserEntity(2, "b", "b", "102");
        UserEntity user3 = new UserEntity(3, "a", "c", "103");
        victim.savePerson(user1);
        victim.savePerson(user2);
        victim.savePerson(user3);
    }

    @Test
    public void getPersonByIdTest(){
        UserEntity expected = new UserEntity(1, "a", "a", "101");
        UserEntity real = victim.getPerson(1);
        assertEquals(expected.getPersonalCode(), real.getPersonalCode());

        real = victim.getPerson(4);
        assertNotEquals(expected.getPersonalCode(), real.getPersonalCode());
        //assertFalse(expected.getPersonalCode().equals(real.getPersonalCode()));
    }


    @Test
    public void getPersonByNameTest(){
        UserEntity[] expectedArray = { new UserEntity(1, "a", "a", "101"),
                                  new UserEntity(3, "a", "c", "103")};
        UserEntity[] realArray = victim.getPeople("a");

        String expected = expectedArray[0].getPersonalCode() + "" + expectedArray[1].getPersonalCode();
        String real = realArray[0].getPersonalCode() + "" + realArray[1].getPersonalCode();
        assertEquals(expected, real);
    }

    @Test
    public void getAllPeopleTest(){
        UserEntity[] expectedArray = { new UserEntity(1, "a", "a", "101"),
                                    new UserEntity(2, "b", "b", "102"),
                                    new UserEntity(3, "a", "c", "103")};
        UserEntity[] realArray = victim.getAllPeople();

        String expected = "";
        String real = "";
        for(int i = 0; i < expectedArray.length; i++){
            expected += expectedArray[i].getPersonalCode();
            real += realArray[i].getPersonalCode();
        }
        assertEquals(expected, real);
    }

    @Test
    public void deletePersonTest(){
        victim.deletePerson(2);

        UserEntity[] expectedArray = { new UserEntity(1, "a", "a", "101"),
                new UserEntity(3, "a", "c", "103")};
        UserEntity[] realArray = victim.getAllPeople();

        String expected = expectedArray[0].getPersonalCode() + "" + expectedArray[1].getPersonalCode();
        String real = realArray[0].getPersonalCode() + "" + realArray[1].getPersonalCode();
        assertEquals(expected, real);

    }

    @Test
    public void editPersonTest(){
        victim.editPerson(2, "e", "e");
        UserEntity[] expectedArray = { new UserEntity(1, "a", "a", "101"),
                new UserEntity(2, "e", "e", "102"),
                new UserEntity(3, "a", "c", "103")};
        UserEntity[] realArray = victim.getAllPeople();

        String expected = "";
        String real = "";
        for(int i = 0; i < expectedArray.length; i++){
            expected += expectedArray[i].getName() + expectedArray[i].getSurname();
            real += realArray[i].getName() + realArray[i].getSurname();
        }

        assertEquals(expected, real);

    }
}