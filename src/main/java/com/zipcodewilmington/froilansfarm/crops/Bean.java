package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.creatures.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;


public class Bean /*<P extends Tractor, T extends CropDuster<Pilot>>*/ implements Edible{
    public Boolean harvested;
    public Boolean fertilized;
//    P p;
//    T t;

    public Bean(){
        this.fertilized = false;
        this.harvested = false;
    }
    @Override
    public Boolean hasBeenHarvested() {
//        if(p.harvest()){
//            this.harvested = true;
//        }
//        return harvested;
        return harvested = true;
    }

    @Override
    public Boolean hasBeenFertilized() {
//        if(t.fertilize()){
//            this.fertilized = true;
//        }
        return fertilized = true;
    }
}
