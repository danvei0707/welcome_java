package com.campusdual.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> instruments = new HashSet<>();

        instruments.add("Piano");
        instruments.add("Guitar");
        instruments.add("Bass");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");
        instruments.add("Piano");

        for (String instrument: instruments){
            System.out.println(instrument);
        }

        // NO PERMITE DUPLICADOS
    }
}
