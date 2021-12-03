package com.javaguru.student_dmitrii_faierberg.lesson_10.level_5_and_level_6;

class Book {
    private String title;
    private String author;
    private boolean read;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.read = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getRead(){
        return read;
    }
    public void setRead(boolean cond){
        this.read = cond;
    }

    public boolean equals(Book book){
        return title.equals(book.title) && author.equals(book.author);
    }

    public boolean equalsByAuthor(String author){
        String thisFirstName = this.author.split(" ")[0];
        if (thisFirstName.equals(author))
            return true;
        else
            return this.author.equals(author);
    }

    public boolean equalsByTitle(String title){
        String thisFirstTitle = this.title.split(" ")[0];
        if (thisFirstTitle.equals(title))
            return true;
        else
            return this.title.equals(title);
    }
}
