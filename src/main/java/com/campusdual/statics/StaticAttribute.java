package com.campusdual.statics;

public class StaticAttribute {

    // Atributo público que vamos a modificar
    public static int totalCounter = 0;

    public void incrementAndPrintCounter(){
        StaticAttribute.totalCounter++;
        System.out.println("Incremented counter: " + StaticAttribute.totalCounter);
    }
}
