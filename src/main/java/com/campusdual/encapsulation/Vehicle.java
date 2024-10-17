package com.campusdual.encapsulation;

public class Vehicle {
    // Definir atributos
    private String brand;
    private String licensePlate;
    private String model;
    public boolean available;
    private static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String licensePlate, String brand, String model) {
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

    public void rentACar(){
        if (this.available){
            this.available = false;
            System.out.println("The vehicle with licence plate " + this.licensePlate + " has been rented");
        }
        else {
            System.out.println("The vehicle with licence plate " + this.licensePlate + " is not available");
        }
    }

    public void returnACar(){
        if (!this.available){
            this.available = true;
            System.out.println("The vehicle with licence plate " + this.licensePlate + " has been returned");
        } else {
            System.out.println("The vehicle with licence plate " + this.licensePlate + " is already available");
        }
    }

    public String getDetails(){
        return this.brand + " " + this.model + "\n\t License plate: " + this.licensePlate + "\n\t Available:" + (this.available?"Yes":"No");
    }

    public static void main(String[] args){
        Vehicle v = new Vehicle("94311FYZ", "Mazda", "5");
        System.out.println(v.getDetails());
        v.rentACar();
        System.out.println(v.getDetails());
        v.rentACar();
        v.returnACar();
        System.out.println(v.getDetails());
        v.returnACar();

    }
}
