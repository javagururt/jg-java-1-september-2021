package com.javaguru.student_georgijs_kuznecovs.lesson_3.level_6;

class ThisComputer {
    String name;
    int cpu;
    int memory;

    ThisComputer(String name, int cpu, int memory){
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    void descriptoin() {
        System.out.println("This is " + name + " computer");
        System.out.println("Is powered by " + cpu + " of CPU");
        System.out.println("and contains " + memory + " GB of memory");
    }
}
