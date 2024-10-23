package com.campusdual.polymorph;

public class Laptop extends Device implements IChargeable{
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    public void screenOnClose(){
        System.out.println("Screen closed, suspending system.");
    }

    @Override
    public void charge() {
        System.out.println("The laptop is charging.");
    }

    @Override
    public void use() {
        System.out.println("Laptop is being used.");
    }
}
