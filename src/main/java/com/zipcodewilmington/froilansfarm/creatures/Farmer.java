package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.structures.Silo;

public class Farmer extends Person implements Botanist {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }

    @Override
    public String makeNoise() {
        return "Howdy y'all!";
    }

    @Override
    public Boolean plant(Crop crop, CropRow<Crop> cropRow) {
        return false;
    }
}
