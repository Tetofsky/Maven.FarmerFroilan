package com.zipcodewilmington.froilansfarm.crops;

public class BeanStalk <P extends Bean>extends Crop {
    P p;
    @Override
    public Integer yield() {
        return 69;
    }
}
