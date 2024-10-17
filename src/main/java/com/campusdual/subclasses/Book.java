package com.campusdual.subclasses;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String title, String publicationDate, String author, String isbn) {
        super(title, publicationDate);
        this.author = author;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
