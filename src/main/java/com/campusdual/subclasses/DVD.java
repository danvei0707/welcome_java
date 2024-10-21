package com.campusdual.subclasses;

public class DVD extends Item {
    private int number;
    private String duration;

    public DVD(String title, String publicationDate, int number, String director) {
        super(title, publicationDate);
        this.number = number;
        this.duration = duration;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void play(){
        System.out.println("Now playing DVD: \n" + this.getDetails());
    }
}
