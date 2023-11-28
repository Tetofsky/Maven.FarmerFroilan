package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.crops.Field;

import java.util.Random;

public class CropDuster <RiderType extends Pilot> extends Vehicle implements AirCraft, FarmVehicle {


    @Override
    public String makeNoise() {
        return "Flapp!";
    }

    @Override
    public Boolean move() {
        return true;
    }


    @Override
    public Boolean fly(Field<CropRow<Crop>> field) {
        return true;
    }

    @Override
    public Boolean operate() {
        return true;
    }

    public boolean fertilize(CropRow<Crop> cropRow) {
        for (Crop c : cropRow.keySet()) {
            for(Edible e: c){
                e.hasBeenFertilized();
            }
        }
        return true;
    }

}
