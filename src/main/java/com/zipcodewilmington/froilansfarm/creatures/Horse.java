package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public class Horse extends Animal implements Rideable {
    @Override
    public Boolean eat(Integer amountOfEat, Edible edible) {
        return null;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean move() {
        return null;
    }
}
