package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;
import com.zipcodewilmington.froilansfarm.structures.Silo;

public interface Eater<EdibleType extends Edible > {
    public Boolean eat(Integer amountOfEat, EdibleType edibleType, Silo silo);
}

