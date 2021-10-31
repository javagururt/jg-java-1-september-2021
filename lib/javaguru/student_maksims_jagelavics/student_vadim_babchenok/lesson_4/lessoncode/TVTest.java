package com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.lesson_4.lessoncode;

class TVTest {

    public static void main(String[] args) {
        TVTest testRunner = new TVTest();

        testRunner.shouldChangeChannel();
        testRunner.shouldNotChangeChannelIfNotExist();
        testRunner.shouldNotChangeChannelIfOutOfRange();
        testRunner.shouldNotChangeChannelIfTvOff();
    }

    private void shouldChangeChannel() {
        TV victim = new TV(0, 0, true);
        victim.changeChannel(10);

        int expected = 10;
        int actual = victim.getChannel();

        if (expected == actual) {
            System.out.println("shouldChangeChannel: SUCCESS");
        } else {
            System.err.println("shouldChangeChannel: FAILED");
        }
    }

    private void shouldNotChangeChannelIfNotExist(){
        TV victim = new TV(10, 0, true);
        victim.changeChannel(100);

        int expected = 10;
        int actual = victim.getChannel();

        if (expected == actual) {
            System.out.println("shouldNotChangeChannelIfNotExist: SUCCESS");
        } else {
            System.err.println("shouldNotChangeChannelIfNotExist: FAILED");
        }
    }

    private void shouldNotChangeChannelIfOutOfRange() {
        TV victim = new TV(30, 0, true);
        victim.changeChannel(-2);

        int expected = 30;
        int actual = victim.getChannel();

        if (expected == actual) {
            System.out.println("shouldNotChangeChannelIfOutOfRange: SUCCESS");
        } else {
            System.err.println("shouldNotChangeChannelIfOutOfRange: FAILED");
        }
    }

    private void shouldNotChangeChannelIfTvOff() {
        TV victim = new TV(0, 0, false);
        victim.changeChannel(10);

        int expected = 0;
        int actual = victim.getChannel();

        if (expected == actual) {
            System.out.println("shouldNotChangeChannelIfTvOff: SUCCESS");
        } else {
            System.err.println("shouldNotChangeChannelIfTvOff: FAILED");
        }
    }

    // channel not exists - stay on same channel, msg: channel not exists
    // TV is off - msg: please turn on tv
    // channel invalid (out of range) - stay on same channel, msg: channel out of range
}
