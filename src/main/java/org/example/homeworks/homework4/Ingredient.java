package org.example.homeworks.homework4;

public class Ingredient {
    private String type;
    private String name;
    private double volume;

    public Ingredient(String type, String name, double volume) {
        this.type = type;
        this.name = name;
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString() {
        return "\ntype: " + type + "\nname: " + name + "\nvolume: " + volume;
    }
}
