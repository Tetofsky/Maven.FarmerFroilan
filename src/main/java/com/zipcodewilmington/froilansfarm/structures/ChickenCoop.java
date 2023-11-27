package com.zipcodewilmington.froilansfarm.structures;

import com.zipcodewilmington.froilansfarm.creatures.Chicken;
import com.zipcodewilmington.froilansfarm.creatures.Pilot;

import java.util.ArrayList;

public class ChickenCoop extends Dwelling<Chicken> {
    public ChickenCoop(){
        super();
    }

    @Override
    public Object getObject(Object object) {
        return this.size();
    }
}
