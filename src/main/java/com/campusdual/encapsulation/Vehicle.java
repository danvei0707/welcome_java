package com.campusdual.encapsulation;

public class Vehicle {
    // Definir atributos
    public String brand;
    public String licensePlate;
    public String model;
    public boolean available;
    public static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String brand, String licensePlate, String model) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.model = model;
        this.available = true;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
