package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Bean;
import com.zipcodewilmington.froilansfarm.structures.Silo;

public class Chicken extends Animal {
    public Chicken(){

    }

    @Override
    public Boolean eat(Integer amountOfEat, Bean edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }

    @Override
    public String makeNoise() {
        return "Bagawk!";
    }
}