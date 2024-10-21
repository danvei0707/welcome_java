package com.campusdual.subclasses;

public class Library {
    public static void main(String[] args) {
        Item item = new Item("New Item", "2010-01-02");
        Book book = new Book("Daring Greatly", "2010-08-27", "Brené Brown", "56573533767676");
        Magazine magazine = new Magazine("Muy Curioso", "2008-10-25", 24, "Fernando Torres");
        DVD dvd = new DVD("Avatar 2", "2023-9-10", 120, "Mariano");

        System.out.println(item.getDetails());
        System.out.println(book.getDetails());

        System.out.println(magazine.getDetails());
        magazine.checkOut();
        magazine.returnItem();

        dvd.checkOut();
        dvd.play();

    }
}
