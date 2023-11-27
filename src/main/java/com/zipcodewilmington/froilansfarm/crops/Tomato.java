package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Tomato implements Edible {
    public Boolean harvested;
    public Boolean fertilized;

    public Tomato(){
        this.harvested = false;
        this.fertilized = false;
    }
    @Override
    public Boolean hasBeenHarvested() {
        return harvested = true;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return fertilized = true;
    }
}
