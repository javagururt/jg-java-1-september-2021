package com.javaguru.student_deniss_lohins.lesson_8.level_1;

class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 victim = new DefaultConstructorV3();
        System.out.println( "int age = " + victim.getAge());
        System.out.println("String Full name = " + victim.getFullName());
        System.out.println("boolean male = " + victim.isMale());
        System.out.println("Boolean female = " + victim.getFemale());
    }
}
