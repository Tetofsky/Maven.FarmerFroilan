package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;

abstract class Animal<EdibleType extends Edible> implements Eater<EdibleType>, NoiseMaker{
    @Override
    public Boolean eat(Integer amountOfEat, EdibleType edible, Silo silo) {
        silo.removeObject(amountOfEat, edible);
        return true;
    }
}
