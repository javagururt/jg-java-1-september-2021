package com.javaguru.student_jekaterina_ola.lesson_10.level_5_middle;

public class Book {
    private String title;
    private String author;
    private boolean read;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
        this.read = false;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}

    public boolean getRead() {return read;}
//    public boolean setRead(boolean cond) {this.read = cond;}

    public boolean equals(Book book) {return title.equals(book.title) && author.equals(book.author);}

    public boolean equalsAuthor(String author){
        String thisFirstTitle = this.title.split(" ")[0];
        if (thisFirstTitle.equals(title))
            return true;
        else
            return this.title.equals(title);
    }
    public boolean equalsByTitle(String Title){
        String thisFirstTitle = this.title.split(" ")[0];
        if (thisFirstTitle.equals(title))
            return true;
        else
            return this.title.equals(title);
    }
}
