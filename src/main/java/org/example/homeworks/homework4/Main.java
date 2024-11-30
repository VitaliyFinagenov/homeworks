package org.example.homeworks.homework4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cocteil> cocteils = new ArrayList<>();

        Ingredient prosecco = new Ingredient("house sparking vine", "brune", 0.15);
        Ingredient pure = new Ingredient("fruit pure", "peach", 0.05);
        Ingredient gin = new Ingredient("house gin", "barister", 0.03);
        Ingredient vermooth = new Ingredient("red sweet wermooth", "martini rosso", 0.03);
        Ingredient bitter = new Ingredient("bitter wermooth", "martini bitter", 0.03);
        Ingredient soda = new Ingredient("sparking water", "baikal", 0.05);

        List<Ingredient> forBelini = new ArrayList<>();
        forBelini.add(prosecco);
        forBelini.add(pure);
        Cocteil belini = new Cocteil("belini", forBelini);

        cocteils.add(belini);

        List<Ingredient> forNegroni = new ArrayList<>();
        forNegroni.add(gin);
        forNegroni.add(vermooth);
        forNegroni.add(bitter);
        Cocteil negroni = new Cocteil("negroni", forNegroni);

        cocteils.add(negroni);

        List<Ingredient> forAmericano = new ArrayList<>();
        forAmericano.add(new Ingredient("red sweet wermooth", "martini rosso", 0.05));
        forAmericano.add(new Ingredient("bitter wermooth", "martini bitter", 0.05));
        forAmericano.add(soda);
        Cocteil americano = new Cocteil("americano", forAmericano);

        cocteils.add(americano);

        for (Cocteil cocteil : cocteils) {
            System.out.println(cocteil.toString());
            System.out.println();
        }
    }
}
