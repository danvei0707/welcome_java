package com.campusdual.iofiles;

import com.campusdual.Utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
    public static void main(String[] args) {
        Path filepath = Paths.get(Route.PATH_NAME);
        try(PrintWriter pw = new PrintWriter(new FileWriter(filepath.toFile()))) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Línea " + i + "...");
                pw.println(Utils.getRandomNumberInRange(0,100));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
