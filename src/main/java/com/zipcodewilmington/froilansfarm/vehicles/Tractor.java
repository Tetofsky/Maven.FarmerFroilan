package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

   public Boolean harvest(){
       return true;
   }
    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public Boolean move() {
        return null;
    }

    @Override
    public Boolean operate() {
        return null;
    }
}
