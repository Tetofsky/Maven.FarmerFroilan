package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;
import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public class Horse extends Animal implements Rideable {

    public Horse(){
        super();
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }

    @Override
    public String makeNoise() {
        return "Neighhh!";
    }

    @Override
    public Boolean move() {
        return true;
    }
}
