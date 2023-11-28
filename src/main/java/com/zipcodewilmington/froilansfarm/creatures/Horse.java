package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public class Horse extends Animal<EarCorn> implements Eater<EarCorn>, Rideable<Rider> {

    public Horse(){
        super();
    }

    @Override
    public String makeNoise() {
        return "Neighhh!";
    }
}
