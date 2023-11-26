package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Edible;

public interface Eater<EdibleType extends Edible> {
    public Boolean eat(Integer amountOfEat,EdibleType edibleType);
}

