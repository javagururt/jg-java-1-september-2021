package com.javaguru.teacher.lesson_6.lessoncode;

class TV {

    private boolean turnedOn;
    private int channel;
    private int volume;

    public TV(boolean turnedOn, int channel, int volume) {
        this.turnedOn = turnedOn;
        this.channel = channel;
        this.volume = volume;
    }

    /*
    вкл
     */
    public void turnOn() {
        turnedOn = true;
    }

    /*
    выкл
     */
    public void turnOff() {
        turnedOn = false;
    }

    /*
    Переходит на конкр. канал
    Макс. канал - 99
    Мин. канал - 1
     */
    public void changeChannel(int channel) {
        if (turnedOn) {
            if (channel > 0 && channel < 100) {
                this.channel = channel;
            }
        }
    }

    /*
    Увеличивает значение звука на 1
    Макс звук - 100
    Мин звук - 0
     */
    public void increaseVolume() {
        if (turnedOn) {
            if (volume < 100) {
                volume++;
            }
        }
    }

    /*
    Уменьшает значение звука на 1
    Макс звук - 100
    Мин звук - 0
     */
    public void decreaseVolume() {
        if (turnedOn) {
            if (volume > 0) {
                volume--;
            }
        }
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}
