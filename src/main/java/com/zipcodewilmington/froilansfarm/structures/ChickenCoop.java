package com.zipcodewilmington.froilansfarm.structures;

import com.zipcodewilmington.froilansfarm.creatures.Chicken;

import java.util.ArrayList;

public class ChickenCoop <P extends Chicken> extends Dwelling {
    ArrayList<P> chickens = new ArrayList<>();
    @Override
    public Object getObject(Object object) {
        return null;
    }
}
