package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;
import com.zipcodewilmington.froilansfarm.vehicles.Rideable;

public abstract class Person implements Eater<Edible>, NoiseMaker, Rider {
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }

    @Override
    public Boolean mount(Rideable<Rider> rideable) {
        return true;
    }

    @Override
    public Boolean dismount(Rideable<Rider> rideable) {
        return true;
    }
}
