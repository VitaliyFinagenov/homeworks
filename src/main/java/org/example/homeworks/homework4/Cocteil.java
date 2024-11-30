package org.example.homeworks.homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cocteil {
    private String name;
    private List<Ingredient> ingredients;
    private double cocteilVolume;

    public Cocteil(String name, List<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return Collections.unmodifiableList(ingredients);
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public double getCocteilVolume() {
        return cocteilVolume;
    }

    public void setCocteilVolume(double cocteilVolume) {
        this.cocteilVolume = cocteilVolume;
    }

    public String showIngredients() {
        String result = "";
        for (Ingredient ingredient : getIngredients()) {
            result += ingredient.toString();
            cocteilVolume += ingredient.getVolume();
        }
        return result;
    }

    public String toString() {
        return "Cocteil " + name + "\nIngredients: " + showIngredients() + "\nCocteil volume: " + cocteilVolume;
    }
}
