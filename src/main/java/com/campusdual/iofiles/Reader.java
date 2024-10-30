package com.campusdual.iofiles;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
    public static void main(String[] args) {
        Path filepath = Paths.get(Route.PATH_NAME);
        try(BufferedReader br = new BufferedReader(new FileReader(filepath.toFile()))) {
            System.out.println(br.readLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
