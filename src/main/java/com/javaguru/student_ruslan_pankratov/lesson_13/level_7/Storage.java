package com.javaguru.student_ruslan_pankratov.lesson_13.level_7;

class Storage {
    private Directory directory = new Directory("Home",0);

    public Directory rootDirectory() {
        return this.directory;
    }

    int totalSize (){
        int sum = 0;
        for (int i = 0; i < directory.directorys.size(); i++) {
          sum  += directory.directorys.get(0).getWeight();
        }
         return sum;
    }

    int totalMP3 (){
        int count = 0;

        for (int i = 0; i <directory.directorys.size() ; i++) {
            if(directory.directorys.get(i).getName().endsWith("MP3")){//будет искать именна где вконце mp3
                count += 1;
            }
        }

        return count;
    }
}

