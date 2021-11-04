package com.javaguru.teacher.lesson_7.lessoncode;

class KnightDemo {

    public static void main(String[] args) {
        Knight knight = new Knight();

        Sword longSword = new Sword();

        Shield shield = new Shield();
        Armor armor = new Armor();
        Pants pants = new Pants();
        Helm helm = new Helm();
        Boots boots = new Boots();
        Gloves gloves = new Gloves();

        Castle castle = new Castle();

        Horse horse = castle.getRandomHorse();
        System.out.println("Horse color: " + horse.getColor());

        knight.setSword(longSword);
        knight.setSword(null);
        knight.setArmor(armor);
        knight.setBoots(boots);
        knight.setGloves(gloves);
        knight.setPants(pants);
        knight.setHorse(horse);
        knight.setHelm(helm);
        knight.setShield(shield);

        Horse knightHorse = knight.getHorse();
        System.out.println("Knights horse color: " + knightHorse.getColor());
    }


}
