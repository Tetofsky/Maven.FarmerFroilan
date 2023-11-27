package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.structures.Silo;

public interface Eater<EdibleType> {
    public Boolean eat(Integer amountOfEat, EdibleType edibleType, Silo silo);
}

