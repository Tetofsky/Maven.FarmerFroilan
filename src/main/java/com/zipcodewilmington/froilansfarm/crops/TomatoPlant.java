package com.zipcodewilmington.froilansfarm.crops;

public class TomatoPlant<P extends Tomato> extends Crop {
    P p;
    @Override
    public Integer yield() {
        return 12;
    }
}
