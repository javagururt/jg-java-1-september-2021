package com.javaguru.student_mihails_mihejevs.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("San", 4, "black");
        dog1.getName();
        dog1.getAge();
        dog1.voice();
        dog1.happyBirthday();
        dog1.voice();
        dog1.changeColor("braun");
        dog1.voice();
    }
}

