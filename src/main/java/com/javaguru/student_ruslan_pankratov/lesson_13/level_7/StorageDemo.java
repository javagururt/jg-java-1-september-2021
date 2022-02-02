package com.javaguru.student_ruslan_pankratov.lesson_13.level_7;

class StorageDemo {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.rootDirectory().add(new Directory("Red", 232));
        System.out.println("total weight = " + storage.totalSize());
        File file = new File("Mel", 454);
        storage.rootDirectory().add(file);
        System.out.println("total weight = " + storage.totalSize());
        storage.rootDirectory().add(new Directory("Del", 200));
        System.out.println("total weight = " + storage.totalSize());
        storage.rootDirectory().delete(file);
        System.out.println("total weight = " + storage.totalSize());
        storage.rootDirectory().add(new File("MP3", 2000));
        storage.rootDirectory().add(new File("MP3", 20030));
        storage.rootDirectory().add(new File("MP3", 20020));
        storage.rootDirectory().add(new File("MP3", 200));
        System.out.println("count MP3 = " + storage.totalMP3());

    }
}
