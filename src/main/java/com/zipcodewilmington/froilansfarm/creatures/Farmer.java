package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public class Farmer extends Person{
    public Farmer(String name) {
        super(name);
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible) {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }
}
