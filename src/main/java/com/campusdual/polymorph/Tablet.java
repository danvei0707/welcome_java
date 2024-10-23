package com.campusdual.polymorph;

public class Tablet extends Device implements IChargeable{
    public Tablet(String brand, String model) {
        super(brand, model);
    }

    public void rotateScreen(){
        System.out.println("Screen orientation switched.");
    }

    @Override
    public void charge() {
        System.out.println("Charging Tablet.");
    }

    @Override
    public void use() {
        System.out.println("Browsing in the tablet");
    }
}
