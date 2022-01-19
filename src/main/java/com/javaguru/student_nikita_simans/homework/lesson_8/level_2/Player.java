package com.javaguru.student_nikita_simans.homework.lesson_8.level_2;

class Player {
    private String name;
    Player(String name) {
        this.name = name;
    }
}

class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }
}

class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }
}

class ComputerPlayerDemo{
    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("Nikita");
    }
}
