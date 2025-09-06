package ru.store.onlain.model;

import ru.store.onlain.model.enumeration.CoffeeType;
import ru.store.onlain.model.enumeration.Roasting;

public class Coffee extends Drink{

    private CoffeeType coffeeType;

    private Roasting roasting;

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Roasting getRoasting() {
        return roasting;
    }

    public void setRoasting(Roasting roasting) {
        this.roasting = roasting;
    }
}
