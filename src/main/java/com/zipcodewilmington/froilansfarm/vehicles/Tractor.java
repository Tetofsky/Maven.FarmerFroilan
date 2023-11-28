package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;

import java.util.Random;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor() {
        super();
    }
    @Override
    public String makeNoise() {
        return "Wroom!";
    }

    @Override
    public Boolean move() {
        return true;
    }

    @Override
    public Boolean operate() {
        return true;
    }

    public boolean harvest(CropRow<Crop> cropRow) {
        for (Crop c : cropRow.keySet()) {
            for(Edible e: c){
                e.hasBeenHarvested();
            }
        }
        return true;
    }
}
