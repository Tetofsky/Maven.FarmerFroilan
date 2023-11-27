package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.structures.Silo;

public class Pilot extends Person {
    public Pilot(String name) {
        super(name);
    }

    @Override
    public Boolean eat(Integer amountOfEat, Object edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }

    @Override
    public String makeNoise() {
        return "I'm da pilot";
    }
}
