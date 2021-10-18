package com.javaguru.student_deniss_lohins.lesson_3.level_x;

class User {

    String userName;
    private String enteredUserName;
    private String password;
    private String enteredPassword;
    private boolean isUserBlocked;
    private boolean acessPermitted;
    private int wrongPasswordCounter;

    public void printData(){
        System.out.println(userName);
        System.out.println(isUserBlocked);
        System.out.println(wrongPasswordCounter);
    }
    public void resetWrongPasswordCounter(){
        wrongPasswordCounter = 15;
    }

    public boolean isAreUserBlocked() {
        return isUserBlocked;
    }

    public int getWrongPasswordCounter() {
        return wrongPasswordCounter;
    }

    public void login(String enteredUserName, String enteredPassword){
            this.enteredUserName = enteredUserName;
            this.enteredPassword = enteredPassword;
            if (enteredUserName == userName) {
            }if (enteredPassword == password){
                  acessPermitted = true;
                  System.out.println(acessPermitted);
                  wrongPasswordCounter = 15;
            }else{
                -- wrongPasswordCounter;
                acessPermitted = false;
                System.out.println(acessPermitted);
                System.out.println(wrongPasswordCounter + " try's left to find password!");
                if (wrongPasswordCounter == 0){
                    isUserBlocked = true;
                    System.out.println("User is blocked! Contact system administrator!");
                }
            }

        }

    public void unBlockUser(){
        isUserBlocked = false;
    }
    public void blockUser(){
        isUserBlocked = true;
    }
    public User( String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
