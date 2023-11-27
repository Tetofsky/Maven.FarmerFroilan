package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class EarCorn implements Edible {

    public Boolean harvested;
    public Boolean fertilized;
    public EarCorn(){
        this.fertilized = false;
        this.harvested = false;
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
