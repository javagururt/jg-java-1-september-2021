package com.javaguru.student_rodions_sokolovs.lesson_8.level_2;

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);

    }
}

class ComputerPlayer extends Player {
    ComputerPlayer(String name) {
        super(name);
    }
}

class ComputerPlayerDemo {
    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("Rodion");

    }
}