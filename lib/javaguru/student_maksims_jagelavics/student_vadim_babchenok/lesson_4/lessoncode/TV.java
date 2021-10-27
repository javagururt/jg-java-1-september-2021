package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

/*
- есть звук
- переключать каналы
Функц:
- ув. звук
- ум. звук
- mute

- след. канал
- пред. канал
- конкретный канал

 */
class TV {

    private int channel;
    private int volume;
    private boolean turnedOn;

    public TV(int channel, int volume, boolean turnedOn) {
        this.channel = channel;
        this.volume = volume;
        this.turnedOn = turnedOn;
    }

    public void increaseVolume() {

    }

    public void decreaseVolume() {

    }

    public void mute() {

    }

    public void increaseChannel() {

    }

    public void decreaseChannel() {

    }

    public void changeChannel(int channel) {
        if (turnedOn) {
            if (isValid(channel)) {
                this.channel = channel;
            }
        }
    }

    private boolean isValid(int channel) {
        return channel >= 0 && channel < 100;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
