package com.campusdual.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Se deben guardar las colecciones dentro de su interfaz, no del objeto en sí
        List<String> instruments = new ArrayList<>();

        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument at index " + i + ": " + instruments.get(i));
        }

        instruments.remove("Piano");

        for (int i = 0; i < instruments.size(); i++) {
            System.out.println("Instrument at index " + i + ": " + instruments.get(i));
        }
    }


}
