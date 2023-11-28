package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.structures.Storage;

public class CropRow <P extends Crop> extends Storage<Crop> {
    P p;
    @Override
    public Object getObject(Object object) {
        object = p;
        return object;
    }
}
