package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public class Farmer extends Person implements Botanist {
    public Farmer(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "Howdy y'all!";
    }

    @Override
    public Boolean plant(Crop crop, CropRow<Crop> cropRow) {
        return true;
    }
}
