package com.campusdual.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileCreator {
    public static void main(String[] args) {
        JsonFileCreator.createFile();
    }

    private static void createFile() {
        JsonObject computer = new JsonObject();
        JsonArray componentArray = new JsonArray();

        componentArray.add(JsonFileCreator.createItem(2, "Graphic Card"));
        componentArray.add(JsonFileCreator.createItem(1, "CPU"));
        componentArray.add(JsonFileCreator.createItem(3, "Fan"));
        componentArray.add(JsonFileCreator.createItem(1, "Motherboard"));
        componentArray.add(JsonFileCreator.createItem(2, "RAM"));
        componentArray.add(JsonFileCreator.createItem(2, "SSD"));
        componentArray.add(JsonFileCreator.createItem(2, "Power supply"));
        componentArray.add(JsonFileCreator.createItem(2, "Computer case"));
        computer.add("components", componentArray);

        try(FileWriter fw = new FileWriter("src/main/resources/computerlist.json")) {
            // Without style
            // fw.write(computer.toString());

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            fw.write(json);
            fw.flush();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

    private static JsonObject createItem(int quantity, String itemDesc){
        JsonObject component = new JsonObject();
        component.addProperty("quantity", quantity);
        component.addProperty("name", itemDesc);
        return component;
    }
}
