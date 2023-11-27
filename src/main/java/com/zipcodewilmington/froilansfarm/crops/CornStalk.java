package com.zipcodewilmington.froilansfarm.crops;

public class CornStalk <P extends EarCorn> extends Crop {
    P p;
    @Override
    public Integer yield() {
        return 69;
    }
}
