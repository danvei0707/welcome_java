package com.campusdual.polymorph;

public class FixItShop {
    public static void main(String[] args) {
        Device s1 = new Smartphone("Xiaomi", "Redmi 9");
        Device t1 = new Tablet("BQ", "350");
        Device l1 = new Laptop("HP", "Pavillion");

        // Si lo guardas en la clase padre (super), solo puedes usar sus métodos
        s1.turnOn();
        t1.turnOn();
        l1.turnOn();
        s1.turnOff();
        t1.turnOff();
        l1.turnOff();

        IChargeable s2 = new Smartphone("Poco", "X6 pro");
        IChargeable t2 = new Tablet("Apple", "Ipad");
        IChargeable l2 = new Laptop("Lenovo", "Thinkpad");

        // Si lo guardas en la interfaz, solo puedes usar los métodos de la interfaz
        s2.charge();
        t2.charge();
        l2.charge();
        s2.use();
        t2.use();
        l2.use();

        Device s3 = new Smartphone("Iphone", "12");
        IChargeable t3 = new Tablet("Samsung", "Wide");
        Laptop l3 = new Laptop("MacBook", "Air");

        l3.screenOnClose(); // Método específico de clase
        ((Smartphone)s3).makeACall(); // "Castear" Device s3 como smartphone
        ((Device)t3).turnOn(); // Lo mismo para castear la interfaz como device
    }
}
