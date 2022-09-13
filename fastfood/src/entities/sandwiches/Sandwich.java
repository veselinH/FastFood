package entities.sandwiches;

import entities.vegetables.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Sandwich {

    private static double grams = 0;
    private String type;
    private List<Vegetable> vegetables;

    public Sandwich(String type) {
        this.type = type;
        vegetables = new ArrayList<>();
    }

    public void addVegetables(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public static double getGrams() {
        return grams;
    }

    public static void setGrams(double grams) {
        Sandwich.grams = grams;
    }

    public List<Vegetable> getVegetables() {
        return Collections.unmodifiableList(vegetables);
    }
}
