package com.campusdual.polymorph;

public class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Métodos

    public void turnOn(){
        System.out.println("This device is turned ON");
    }

    public void turnOff(){
        System.out.println("This device is turned OFF");
    }

    // Getters y setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
