package com.javaguru.student_dmitrii_faierberg.lesson_7.level_7;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.ArrayList;
@CodeReview(approved = true)
class UserEntityRepos {
    ArrayList<UserEntity> people = new ArrayList<UserEntity>();

    public void savePerson(UserEntity person){
        for (int i = 0; i < people.size(); i++){
            if (person.getPersonalCode().equals(people.get(i).getPersonalCode())){
                System.err.println("This person is already in the list.");
                return;
            }
        }
        people.add(person);
    }

    public UserEntity getPerson(int id){
        for (int i = 0; i < people.size(); i++){
            if (id == people.get(i).getId()){
                return people.get(i);
            }
        }
        System.err.println("No such user in the repository.");
        return new UserEntity(-1, "0", "0", "0");
    }

    public UserEntity[] getPeople(String name){
        int length = 0;
        for (int i = 0; i < people.size(); i++){
            if (name.equals(people.get(i).getName())){
                length++;
            }
        }

        UserEntity[] foundUsers = new UserEntity[length];
        int index = 0;

        for (int i = 0; i < people.size(); i++){
            if (name.equals(people.get(i).getName())){
                foundUsers[index] = people.get(i);
                index++;
            }
        }
        return foundUsers;
    }

    public UserEntity[] getAllPeople(){
        UserEntity[] result = new UserEntity[people.size()];
        for(int i = 0; i < people.size(); i++){
            result[i] = people.get(i);
        }
        return result;
    }

    public void deletePerson(int id){
        UserEntity person = getPerson(id);
        people.remove(person);
    }

    public void editPerson(int id, String newName, String newSurname){
        UserEntity person = getPerson(id);
        for(int i = 0; i < people.size(); i++){
            if (person == people.get(i)){
                people.get(i).setName(newName);
                people.get(i).setSurname(newSurname);
            }
        }
    }
}
