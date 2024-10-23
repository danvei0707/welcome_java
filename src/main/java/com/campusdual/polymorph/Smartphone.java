package com.campusdual.polymorph;

public class Smartphone extends Device implements IChargeable{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Calling someone.");
    }

    @Override
    public void charge() {
        System.out.println("Charging Smartphone.");

    }

    @Override
    public void use() {
        System.out.println("Using phone touch screen.");
    }
}
