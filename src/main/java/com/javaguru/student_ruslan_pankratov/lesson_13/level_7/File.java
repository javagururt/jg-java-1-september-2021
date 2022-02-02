package com.javaguru.student_ruslan_pankratov.lesson_13.level_7;

class File implements Resource {
    String name;
    int weight;


    public File(String name, int size) {
        this.name = name;
        this.weight = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
