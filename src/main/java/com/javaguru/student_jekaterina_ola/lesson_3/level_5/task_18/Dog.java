package com.javaguru.student_jekaterina_ola.lesson_3.level_5.task_18;

//task 18-19 - complete
//task 19-22 - happy BD - complete;
// возм увеличивать возраст на один - complete
// voice command - ??

class Dog {
    String dogName;
    int dogAge;
    String dogColour;

    public Dog(String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;

    }
        public String getDogName() {return this.dogName ;}
        public int getDogAge () {return this.dogAge;}
        public String getDogColour () {return this.dogColour;}

    public void happyBirthday(){this.dogAge = this.dogAge + 1;}

    public void changeColour(String newColour){this.dogColour = newColour;}

    public void dogVoice(){
        System.out.println("My name is " + dogName);
        System.out.println("My name is " + dogName);
        System.out.println("My name is " + dogName);
        System.out.println("My age is " + dogAge);
        System.out.println("My colour is " + dogColour);
    }

}


