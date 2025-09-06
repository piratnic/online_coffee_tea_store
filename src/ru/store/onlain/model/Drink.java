package ru.store.onlain.model;

import ru.store.onlain.model.enumeration.Country;
import ru.store.onlain.model.enumeration.Manufactored;
import ru.store.onlain.model.enumeration.Packaged;

import java.math.BigDecimal;

public abstract class Drink {

    private String name;
    private BigDecimal price;
    private Float weight;
    private Country country;
    private Manufactored manufactured;
    private Packaged drinkPackage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Manufactored getManufactured() {
        return manufactured;
    }

    public void setManufactured(Manufactored manufactured) {
        this.manufactured = manufactured;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Packaged getDrinkPackage() {
        return drinkPackage;
    }

    public void setDrinkPackage(Packaged drinkPackage) {
        this.drinkPackage = drinkPackage;
    }
}
