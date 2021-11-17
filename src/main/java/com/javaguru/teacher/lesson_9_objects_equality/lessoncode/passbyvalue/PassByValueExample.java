package com.javaguru.teacher.lesson_9_objects_equality.lessoncode.passbyvalue;

class PassByValueExample {

    public static void main(String[] args) {
        Cat cat = new Cat(); //ref-1
        cat.setName("Borja");

        System.out.println(cat);

        cloneCat(cat);

        System.out.println(cat);

        int a = 10;
        System.out.println(a);
        increase(a);
        System.out.println(a);

        Dog dog = new Dog("Tuzik", 3);
        dog = changeName(dog);
        System.out.println(dog);
    }

    private static Dog changeName(Dog dog) {
        Dog newDog = new Dog("Bobik", dog.getAge());
        //foo newDog...
        return newDog;
    }

    private static void cloneCat(Cat cat) {//copy ref-1
        Cat cat1 = new Cat();
        cat = cat1; //ref-2
        cat.setName("Vasya");
        System.out.println(cat);
    }

    private static void increase(int a) {
        ++a;
    }
}
