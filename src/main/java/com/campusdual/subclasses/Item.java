package com.campusdual.subclasses;

public class Item {
    private String title;
    private String publicationDate;
    private boolean checkedOut = false;

    public Item(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public String getDetails(){
        return "Title: " + this.title + "\nPublication date: " + this.publicationDate + "\n\tChecked out: " + (this.checkedOut?"Yes":"No");
    }

    public static void main(String[] args) {

    }
}
