package entities;

import java.util.List;

public abstract class Sandwich {

    private static double grams = 0;
    private List<Vegetable> vegetables;

    public Sandwich(){

    }

    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }


}
