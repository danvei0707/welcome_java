package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("Daring Greatly", "2010-08-27", "Brené Brown", "56573533767676");
        System.out.println(item.getDetails());
        System.out.println(book.getDetails());
    }
}
