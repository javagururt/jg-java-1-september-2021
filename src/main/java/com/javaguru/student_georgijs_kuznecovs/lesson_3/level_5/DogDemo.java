package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog sharikDog = new Dog(7, "Black");

        sharikDog.voice();
        sharikDog.happyBirthday();
        sharikDog.changeColor("White");          //sharikDog.color = "White";
        sharikDog.voice();
   }
}
