package com.campusdual.override;

public class Vehicle {
    public void start(){
        System.out.println("The vehicle has been started");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Tractor t = new Tractor();
        Plane p = new Plane();

        c.start();
        t.start();
        p.start();
    }
}
