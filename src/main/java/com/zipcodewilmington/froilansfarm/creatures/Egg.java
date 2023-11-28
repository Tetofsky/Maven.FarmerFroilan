package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;

import java.util.Random;

public class Egg implements Edible {
    Boolean harvested, fertilized;
    Random random;
    public Egg(){
        this.harvested = false;
        this.fertilized = false;
    }

    @Override
    public Boolean hasBeenHarvested() {
        return harvested;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return fertilized;
    }

    public Boolean randomFertilize(Silo silo) {
        if (random.nextInt(100) + 1 <= 30){
            this.fertilized = true;
            this.harvested = true;
            silo.addObject(1,this);
        }
        return fertilized;
    }
}
