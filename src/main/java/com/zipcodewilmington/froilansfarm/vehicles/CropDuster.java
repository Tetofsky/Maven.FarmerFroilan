package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Field;

public class CropDuster <RiderType extends Pilot> extends Vehicle implements AirCraft, FarmVehicle {
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean move() {
        return null;
    }


    @Override
    public Boolean fly(Field field) {
        return null;
    }

    @Override
    public Boolean operate() {
        return null;
    }
}
