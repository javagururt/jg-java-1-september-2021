package com.javaguru.teacher.lesson_7.lessoncode;

class Knight {

    private Sword sword;
    private Shield shield;
    private Armor armor;
    private Pants pants;
    private Helm helm;
    private Boots boots;
    private Gloves gloves;
    private Horse horse;

    public Sword getSword() {
        return sword;
    }

    public Shield getShield() {
        return shield;
    }

    public Armor getArmor() {
        return armor;
    }

    public Pants getPants() {
        return pants;
    }

    public Helm getHelm() {
        return helm;
    }

    public Boots getBoots() {
        return boots;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setSword(Sword sword) {
        if (sword != null) {
            this.sword = sword;
        }
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    public void setGloves(Gloves gloves) {
        this.gloves = gloves;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }
}
