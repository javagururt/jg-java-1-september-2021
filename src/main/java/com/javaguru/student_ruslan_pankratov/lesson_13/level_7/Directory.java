package com.javaguru.student_ruslan_pankratov.lesson_13.level_7;

import java.util.ArrayList;
import java.util.List;

class Directory implements Resource{
   private String name;
   private int weight;



    public Directory(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    List<Resource> directorys = new ArrayList<>();


    public void add(Resource resource){
        directorys.add(resource);
    }

    public void delete(Resource resource){
        directorys.remove(resource);
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
