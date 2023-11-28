package com.zipcodewilmington.froilansfarm.creatures;

import com.zipcodewilmington.froilansfarm.crops.Bean;

public class Chicken extends Animal<Bean> implements Eater<Bean> {
    public Chicken(){
        super();
    }

    @Override
    public String makeNoise() {
        return "Bagawk!";
    }
}