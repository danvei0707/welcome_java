package com.campusdual.types;

public class Cast {
    public static void main(String[] args) {
        int originalInt = 200;
        originalInt = originalInt + 2;
        System.out.println(originalInt);
        String originalString = "My number is: ";
//        originalString = originalString + 2;
        System.out.println(originalString);
        String parsedInt = String.valueOf(originalInt);
        System.out.println("Stringified int: " + parsedInt);
        boolean bool = false;
        String strBool = String.valueOf(bool);
        System.out.println(strBool);
    }
}
