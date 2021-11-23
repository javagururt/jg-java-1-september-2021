package com.javaguru.student_ruslan_pankratov.lesson_9.level_2;

class ProtectedClass {

    private String title;
    private String author;
    //protected class могут быть или вложеные классы.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   protected class Jer{

    }
}



