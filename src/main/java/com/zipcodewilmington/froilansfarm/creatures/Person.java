package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;

public abstract class Person implements Eater<Edible>, NoiseMaker{
    String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public Boolean eat(Integer amountOfEat, Edible edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }
}
