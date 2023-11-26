package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.creatures.Pilot;

public class CropDuster <RiderType extends Pilot> extends Vehicle {
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean move() {
        return null;
    }
}
