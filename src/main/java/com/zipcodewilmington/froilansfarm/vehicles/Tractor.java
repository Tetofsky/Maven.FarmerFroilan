package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

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

    public boolean fertilize(CropRow cropRow) {
        for (Crop c : cropRow) {
            c.hasBeenHarvested = true;
            silo.add();
        }
        return true;

    }
}
